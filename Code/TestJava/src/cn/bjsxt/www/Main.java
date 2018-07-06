package cn.bjsxt.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        // ��������һ��Map��¼��ÿ��ͬѧ��һ�ſγɼ�
        Map<String, Integer> oneGrade = new HashMap<String, Integer>();
        oneGrade.put("С��", 98);
        oneGrade.put("С��", 95);
        System.out.println("Map<string,Integer>: ");
        System.out.println(oneGrade);

        // ����������ÿ��ͬѧ¼�����ĳɼ�
        Map<String, List<Integer>> manyGrades = new HashMap<String, List<Integer>>();
        // ¼��С���ļ��Ƴɼ�
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(98);
        tmp.add(96);
        tmp.add(93);
        manyGrades.put("С��", tmp);
        // ¼��С��ļ��Ƴɼ�
        tmp.clear();
        tmp.add(95);
        tmp.add(99);
        tmp.add(100);
        manyGrades.put("С��", tmp);
        System.out.println("Map<String,List<Integer>>: ");
        System.out.println(manyGrades);

        // �ٴ������뱣��ÿ��ͬѧ�������ſε��˶��ٷֵľ�����Ϣ
        Map<String, Map<String, Integer>> detailGrades = new HashMap<String, Map<String, Integer>>();
        //¼��С���ľ���ÿ�ſγ̵ĳɼ�
        Map<String,Integer>    tmp1 = new HashMap<String, Integer>();
        tmp1.put("����", 98);
        tmp1.put("��ѧ", 96);
        tmp1.put("Ӣ��", 93);
        detailGrades.put("С��", tmp1);
        //¼��С��ľ���ÿ�ſεĳɼ�
        tmp1.clear();
        tmp1.put("����", 95);
        tmp1.put("��ѧ", 99);
        tmp1.put("Ӣ��", 100);
        detailGrades.put("С��", tmp1);
        System.out.println("Map<String,Map<String,Integer>>: ");
        System.out.println(detailGrades);
    }
}