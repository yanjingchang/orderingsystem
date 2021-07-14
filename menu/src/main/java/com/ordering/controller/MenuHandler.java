package com.ordering.controller;

import com.ordering.entity.Menu;
import com.ordering.entity.MenuVO;
import com.ordering.entity.Type;
import com.ordering.repository.MenuRepository;
import com.ordering.repository.TypeRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: MenuHandler
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/14 - 10:59
 * @Vesion: 1.0
 */
@RestController
@RequestMapping(value ="/menu")
public class MenuHandler {

    @Resource
    private MenuRepository menuRepository;
    @Resource
    private TypeRepository typeRepository;

    @GetMapping("/findall/{page}/{limit}")
    public MenuVO findAll(@PathVariable("page") int page ,@PathVariable("limit") int limit){
        MenuVO menuVO = new MenuVO();
        menuVO.setCode(0);
        menuVO.setMsg("");
        menuVO.setCount(menuRepository.count());
        menuVO.setData(menuRepository.findAll((page-1)*limit,limit));
        return menuVO;
    }

    @GetMapping("/findall")
    public List<Type> findAll(){
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRepository.save(menu);
    }

    @GetMapping("/findbyid/{id}")
    public Menu findById(@PathVariable("id")long id){
        return  menuRepository.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu ){
        menuRepository.update(menu);
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuRepository.deleteById(id);
    }
}
