package com.bjsxt.sorm.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bjsxt.sorm.bean.ColumnInfo;
import com.bjsxt.sorm.bean.JavaFieldGetSet;
import com.bjsxt.sorm.bean.TableInfo;
import com.bjsxt.sorm.core.DBManager;
import com.bjsxt.sorm.core.MySqlTypeConvertor;
import com.bjsxt.sorm.core.TableContext;
import com.bjsxt.sorm.core.TypeConvertor;

/**
 * 灏佽浜嗙敓鎴怞ava鏂囦欢(婧愪唬鐮�甯哥敤鐨勬搷浣�
 * @author gaoqi www.sxt.cn
 *
 */
public class JavaFileUtils {
	
	/**
	 * 鏍规嵁瀛楁淇℃伅鐢熸垚java灞炴�淇℃伅銆傚锛歷archar username-->private String username;浠ュ強鐩稿簲鐨剆et鍜実et鏂规硶婧愮爜
	 * @param column 瀛楁淇℃伅
	 * @param convertor 绫诲瀷杞寲鍣�
	 * @return java灞炴�鍜宻et/get鏂规硶婧愮爜
	 */
	public static JavaFieldGetSet createFieldGetSetSRC(ColumnInfo column,TypeConvertor convertor){
		JavaFieldGetSet jfgs  = new JavaFieldGetSet();
		
		String javaFieldType = convertor.databaseType2JavaType(column.getDataType());
		
		jfgs.setFieldInfo("\tprivate "+javaFieldType+" "+column.getName()+";\n");
		
		//public String getUsername(){return username;}
		//鐢熸垚get鏂规硶鐨勬簮浠ｇ爜
		StringBuilder getSrc = new StringBuilder();
		getSrc.append("\tpublic "+javaFieldType+" get"+StringUtils.firstChar2UpperCase(column.getName())+"(){\n");
		getSrc.append("\t\treturn "+column.getName()+";\n");
		getSrc.append("\t}\n");
		jfgs.setGetInfo(getSrc.toString());
		
		//public void setUsername(String username){this.username=username;}
		//鐢熸垚set鏂规硶鐨勬簮浠ｇ爜
		StringBuilder setSrc = new StringBuilder();
		setSrc.append("\tpublic void set"+StringUtils.firstChar2UpperCase(column.getName())+"(");
		setSrc.append(javaFieldType+" "+column.getName()+"){\n");
		setSrc.append("\t\tthis."+column.getName()+"="+column.getName()+";\n");
		setSrc.append("\t}\n");
		jfgs.setSetInfo(setSrc.toString());
		return jfgs;
	}
	
	/**
	 * 鏍规嵁琛ㄤ俊鎭敓鎴恓ava绫荤殑婧愪唬鐮�
	 * @param tableInfo 琛ㄤ俊鎭�
	 * @param convertor 鏁版嵁绫诲瀷杞寲鍣�
	 * @return java绫荤殑婧愪唬鐮�
	 */
	public static String createJavaSrc(TableInfo tableInfo,TypeConvertor convertor){
		
		Map<String,ColumnInfo> columns = tableInfo.getColumns();
		List<JavaFieldGetSet> javaFields = new ArrayList<JavaFieldGetSet>();

		for(ColumnInfo c:columns.values()){
			javaFields.add(createFieldGetSetSRC(c,convertor));
		}
		
		StringBuilder src = new StringBuilder();
		
		//鐢熸垚package璇彞
		src.append("package "+DBManager.getConf().getPoPackage()+";\n\n");
		//鐢熸垚import璇彞
		src.append("import java.sql.*;\n");
		src.append("import java.util.*;\n\n");
		//鐢熸垚绫诲０鏄庤鍙�
		src.append("public class "+StringUtils.firstChar2UpperCase(tableInfo.getTname())+" {\n\n");
		
		//鐢熸垚灞炴�鍒楄〃
		for(JavaFieldGetSet f:javaFields){
			src.append(f.getFieldInfo());
		}
		src.append("\n\n");
		//鐢熸垚get鏂规硶鍒楄〃
		for(JavaFieldGetSet f:javaFields){
			src.append(f.getGetInfo());
		}
		//鐢熸垚set鏂规硶鍒楄〃
		for(JavaFieldGetSet f:javaFields){
			src.append(f.getSetInfo());
		}
		
		//鐢熸垚绫荤粨鏉�
		src.append("}\n");
		return src.toString();
	}
	
	
	public static void createJavaPOFile(TableInfo tableInfo,TypeConvertor convertor){
		String src = createJavaSrc(tableInfo,convertor);
		
		String srcPath = DBManager.getConf().getSrcPath()+"\\";
		String packagePath = DBManager.getConf().getPoPackage().replaceAll("\\.", "/");
		
		File f = new File(srcPath+packagePath);
		
		if(!f.exists()){  //濡傛灉鎸囧畾鐩綍涓嶅瓨鍦紝鍒欏府鍔╃敤鎴峰缓绔�
			f.mkdirs();
		}
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile()+"/"+StringUtils.firstChar2UpperCase(tableInfo.getTname())+".java"));
			bw.write(src);
			System.out.println("寤虹珛琛"+tableInfo.getTname()+
					"瀵瑰簲鐨刯ava绫伙細"+StringUtils.firstChar2UpperCase(tableInfo.getTname())+".java");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bw!=null){
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
//		ColumnInfo ci = new ColumnInfo("id", "int", 0);
//		JavaFieldGetSet f = createFieldGetSetSRC(ci,new MySqlTypeConvertor());
//		System.out.println(f);
		
		Map<String,TableInfo> map = TableContext.tables;
		for(TableInfo t:map.values()){
			createJavaPOFile(t,new MySqlTypeConvertor());
		}
	}
	
}
