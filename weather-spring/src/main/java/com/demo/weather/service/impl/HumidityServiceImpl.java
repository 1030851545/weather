package com.demo.weather.service.impl;

import com.demo.weather.VO.DuVO;
import com.demo.weather.VO.HumVO;
import com.demo.weather.entity.Humidity;
import com.demo.weather.mapper.HumidityMapper;
import com.demo.weather.service.HumidityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-06-16
 */
@Service
public class HumidityServiceImpl extends ServiceImpl<HumidityMapper, Humidity> implements HumidityService {
    @Autowired
    private HumidityMapper humidityMapper;

    @Override
    public HumVO humVOList(){
        HumVO humVO = new HumVO();
        List<String> names = new ArrayList<>();
        List<DuVO> shidus = new ArrayList<>();
        List<Humidity> humiditys = this.humidityMapper.selectList(null);
        for (Humidity humidity : humiditys){
            names.add(humidity.getName());
            DuVO duVO = new DuVO();

            duVO.setValue(humidity.getHumidity());
            shidus.add(duVO);

        }
        humVO.setNames(names);
        humVO.setShidus(shidus);
        return humVO;
    }
}


