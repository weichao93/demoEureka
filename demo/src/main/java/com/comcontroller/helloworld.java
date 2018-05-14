package com.comcontroller;

import com.bean.Cat;
import com.etoaks.User;
import com.service.CatServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by weichao on 2017/10/8 0008.
 */

@RestController
public class helloworld {
    @RequestMapping("/hello")
    public String test(){
        return "hello_2016";

    }
    /*
    * 测试返回json数据
    *
    * */

    @RequestMapping("/getDemo")
public User getDemo(){
    User user =new User();
    user.setId(15);
    user.setName("魏超");
    user.setRemarks("wrwetet");
    user.setCreateTime(new Date());

    return user;
}
    @Autowired
    private CatServie catService;

    @GetMapping("save")
    public void saveCat(){
        Cat cat = new Cat();
        cat.setName("芬芬");
        cat.setAge(25);
        catService.save(cat);


   }
    @GetMapping("delete")
    public void deleteCat(){

        catService.delete(2);

    }


}
