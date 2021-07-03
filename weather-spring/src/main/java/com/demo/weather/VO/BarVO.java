package com.demo.weather.VO;

import lombok.Data;

import java.util.List;

@Data
public class BarVO {
    private List<String> names;
    private List<TempVO> values;
    private List<MinVO> mins;
}
