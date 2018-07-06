package cn.bjsxt.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        // 首先声明一个Map，录入每个同学的一门课成绩
        Map<String, Integer> oneGrade = new HashMap<String, Integer>();
        oneGrade.put("小明", 98);
        oneGrade.put("小红", 95);
        System.out.println("Map<string,Integer>: ");
        System.out.println(oneGrade);

        // 其次我们想给每个同学录入更多的成绩
        Map<String, List<Integer>> manyGrades = new HashMap<String, List<Integer>>();
        // 录入小明的几科成绩
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(98);
        tmp.add(96);
        tmp.add(93);
        manyGrades.put("小明", tmp);
        // 录入小红的几科成绩
        tmp.clear();
        tmp.add(95);
        tmp.add(99);
        tmp.add(100);
        manyGrades.put("小红", tmp);
        System.out.println("Map<String,List<Integer>>: ");
        System.out.println(manyGrades);

        // 再次我们想保留每个同学究竟哪门课的了多少分的具体信息
        Map<String, Map<String, Integer>> detailGrades = new HashMap<String, Map<String, Integer>>();
        //录入小明的具体每门课程的成绩
        Map<String,Integer>    tmp1 = new HashMap<String, Integer>();
        tmp1.put("语文", 98);
        tmp1.put("数学", 96);
        tmp1.put("英语", 93);
        detailGrades.put("小明", tmp1);
        //录入小红的具体每门课的成绩
        tmp1.clear();
        tmp1.put("语文", 95);
        tmp1.put("数学", 99);
        tmp1.put("英语", 100);
        detailGrades.put("小红", tmp1);
        System.out.println("Map<String,Map<String,Integer>>: ");
        System.out.println(detailGrades);
    }
}