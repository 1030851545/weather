package com.demo.weather.controller;


import com.demo.weather.VO.HumVO;
import com.demo.weather.entity.Humidity;
import com.demo.weather.service.HumidityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-06-16
 */
@RestController
@RequestMapping("//humidity")
public class HumidityController {
    @Autowired
    private HumidityService humidityService;
    @GetMapping("/list")
    public List<Humidity> list(){
        return this.humidityService.list();
    }
    @PostMapping("/add")
    public boolean add(@RequestBody Humidity humidity){
        return this.humidityService.save(humidity);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.humidityService.removeById(id);
    }
    @GetMapping("/find/{id}")
    public Humidity find(@PathVariable("id") Integer id){
        return this.humidityService.getById(id);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody Humidity humidity){
        return this.humidityService.updateById(humidity);
    }
    @GetMapping("/humVO")
    public HumVO humVO(){
        return this.humidityService.humVOList();
    }
}

