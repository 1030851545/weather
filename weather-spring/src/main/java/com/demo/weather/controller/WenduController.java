package com.demo.weather.controller;


import com.demo.weather.VO.BarVO;
import com.demo.weather.entity.Wendu;
import com.demo.weather.service.WenduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



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
@RequestMapping("//wendu")
public class WenduController {
    @Autowired
    private WenduService wenduService;
    @GetMapping("/list")
    public List<Wendu> list(){
        return this.wenduService.list();
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.wenduService.removeById(id);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody Wendu wendu){
        return this.wenduService.save(wendu);
    }
    @GetMapping("/find/{id}")
    public Wendu find(@PathVariable("id") Integer id){
        return this.wenduService.getById(id);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody Wendu wendu){
        return this.wenduService.updateById(wendu);
    }
    @GetMapping("/barVO")
    public BarVO barVO(){
        return this.wenduService.barVOList();
    }
}

