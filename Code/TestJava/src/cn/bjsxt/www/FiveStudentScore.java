package cn.bjsxt.www;
import java.util.*;

public class FiveStudentScore {

    public static void main(String[] args) {
    	Map<String, Set<Integer>> map = new HashMap<String, Set<Integer>>();
    	Scanner input = new Scanner(System.in);
    	for(int i = 0; i < 5; ++i){
    		Set<Integer> s = new HashSet<Integer>();
    		String name = input.next();
    		for(int j = 0; j < 3; ++j){
    			int score = input.nextInt();
    			s.add(score);
    		}
    		map.put(name, s);
    	}
    	//��һ�֣�ͨ��Map��key������
//    	for(String it : map.keySet()){
//    		System.out.println("key" + it + "value" + map.get(it));
//    	}
    	//�ڶ��֣�ͨ��Map�ĵ�����
//    	Iterator<Map.Entry<String, Set<Integer>>> it = map.entrySet().iterator();
//    	while(it.hasNext()){
//    		Map.Entry<String, Set<Integer>> entry = it.next();
//    		System.out.println("key" + entry.getKey() + " value" + entry.getValue().toString());
//    	}
    	//�����֣�ֱ��foren����
//    	for(Map.Entry<String, Set<Integer>> it : map.entrySet()){
//    		System.out.println("key" + it.getKey() + " value" + it.getValue());
//    	}
    	//�����֣�ͨ��value������
//    	for(Set<Integer> score : map.values()){
//    		System.out.print(" " + score.toString());
//    	}
    	input.close();
    }
}