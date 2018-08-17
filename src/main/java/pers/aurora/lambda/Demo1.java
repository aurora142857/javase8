package pers.aurora.lambda;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public void method1() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        map.put("four", "四");
        map.put("five", "五");
        map.forEach((s, s2) -> {
            System.out.println(s+":"+s2);
        });
    }
}
