package com.demo.weather.service;

import com.demo.weather.VO.BarVO;
import com.demo.weather.entity.Wendu;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-06-16
 */
public interface WenduService extends IService<Wendu> {
    public BarVO barVOList();


}
