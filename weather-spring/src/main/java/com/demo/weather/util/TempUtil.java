package com.demo.weather.util;

import java.util.HashMap;
import java.util.Map;

public class TempUtil {
    public static Map<String,String> createItemStyle(Integer max){
        String color = "";
        if (max<10){
            color = "#CCC";
        }
        if (max>10 && max<20){
            color = "#c4ebad";
        }
        if (max>20 && max<30){
            color = "#3fb1e3";
        }
        Map<String,String> map = new HashMap<>();
        map.put("color",color);
                return map;
    }
}
