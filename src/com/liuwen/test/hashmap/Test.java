package com.liuwen.test.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * ----------------------------------------------------------------------
 * @author Create by liuwen at  2020/10/11 22:25
 * <p>
 * ----------------------------------------------------------------------
 **/
public class Test {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("k1",0.1);
        map.put("k2",0.2);
        map.put("k3",0.3);
        map.put("k4",0.4);
        map.put("k5",0.5);
        System.out.println(map);
    }
}
