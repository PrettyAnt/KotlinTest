package com.prettyant.s6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KtBase128 {
    public static void main(String[] args) {
        //1.定义name集合
        ArrayList<String> names = new ArrayList<>();
        names.add("孙悟空");
        names.add("孙行者");
        names.add("孙慧");
        //2.定义age集合
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(999);
        ages.add(888);
        ages.add(30);
        //3.合并以上两个集合
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            result.put(names.get(i), ages.get(i));
        }
        //4.给集合添加详细内容,方便输出
        List<String> showList = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : result.entrySet()) {
            String finResult = String.format("you name is %s,you age is %d", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            showList.add(finResult);
        }
        //5.输出最后的成功 结果
        for (int i = 0; i < showList.size(); i++) {
            System.out.println(showList.get(i));
        }
    }
}
