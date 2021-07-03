package com.demo.weather.VO;
import lombok.Data;

import java.util.List;

@Data
public class HumVO {
    private List<String> names;
    private List<DuVO> shidus;
}
