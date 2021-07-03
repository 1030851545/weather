package com.demo.weather.service;


import com.demo.weather.VO.HumVO;
import com.demo.weather.entity.Humidity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2021-06-16
 */
public interface HumidityService extends IService<Humidity> {
    public HumVO humVOList();
}
