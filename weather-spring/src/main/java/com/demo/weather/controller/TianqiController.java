package com.demo.weather.controller;


import com.demo.weather.entity.Tianqi;
import com.demo.weather.service.TianqiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("//tianqi")
public class TianqiController {
    @Autowired
    private TianqiService tianqiService;
    @GetMapping("/list")
    public List<Tianqi> list(){
        return this.tianqiService.list();
    }
}

