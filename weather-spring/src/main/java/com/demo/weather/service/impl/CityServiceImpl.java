package com.demo.weather.service.impl;

import com.demo.weather.entity.City;
import com.demo.weather.mapper.CityMapper;
import com.demo.weather.service.CityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-06-16
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {

}
