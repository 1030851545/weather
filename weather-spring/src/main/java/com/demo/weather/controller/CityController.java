package com.demo.weather.controller;


import com.demo.weather.entity.City;
import com.demo.weather.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-06-09
 */
@RestController
@RequestMapping("//city")
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping("/list")
    public List<City> list(){
        return this.cityService.list();
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
    return this.cityService.removeById(id);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody City city) {
        return this.cityService.save(city);
    }
    @GetMapping("/find/{id}")
    public City find(@PathVariable("id") Integer id){
        return this.cityService.getById(id);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody City city){
        return this.cityService.updateById(city);
    }
}

