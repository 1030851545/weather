package com.demo.weather.service.impl;

import com.demo.weather.VO.BarVO;
import com.demo.weather.VO.MinVO;
import com.demo.weather.VO.TempVO;
import com.demo.weather.entity.Wendu;
import com.demo.weather.mapper.WenduMapper;
import com.demo.weather.service.WenduService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.weather.util.TempUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-06-16
 */
@Service
public class WenduServiceImpl extends ServiceImpl<WenduMapper, Wendu> implements WenduService {
    @Autowired
    private WenduMapper wenduMapper;


    @Override
    public BarVO barVOList(){
        BarVO barVO = new BarVO();
        List<String> names = new ArrayList<>();
        List<TempVO> values = new ArrayList<>();
        List<MinVO> mins= new ArrayList<>();
        List<Wendu> wendus = this.wenduMapper.selectList(null);
        for (Wendu wendu : wendus) {
            names.add(wendu.getName());
            TempVO tempVO = new TempVO();
            MinVO minVO = new MinVO();
            minVO.setValue(wendu.getMin());
            tempVO.setValue(wendu.getMax());
            tempVO.setItemStyle(TempUtil.createItemStyle(wendu.getMax()));
            values.add(tempVO);
            mins.add(minVO);
            Map<String,String> map = new HashMap<>();
            map.put("color","00000");
            tempVO.setItemStyle(map);
        }
        barVO.setNames(names);
        barVO.setMins(mins);
        barVO.setValues(values);
        return barVO;
    }

}
