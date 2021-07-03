package com.demo.weather.VO;

import lombok.Data;

import java.util.Map;

@Data
public class TempVO {
    private Integer value;
    private Map<String,String> itemStyle;
}
