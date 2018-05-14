package com.comcontroller;

import com.bean.Stu;
import com.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:chao.wei
 * @Date: Created in 2017/10/12 0012.
 */
@RestController
public class StuConyroller {
    @Autowired
    private StuService stuService;
    //查询名字是魏超的用户
    @RequestMapping("/selectByName")
    public Stu getStuByName(String name){
       Stu stu = stuService.getStuByName(name);
       return stu;
    }

    //查询用户根据id
    @RequestMapping("/selectById")
    public Stu getStuById(Integer id){
       Stu stu= stuService.getStuById(id);
       return stu;
    }

    //保存用户
    @RequestMapping("/save")
    public int SaveStu(){
        Stu stu = new Stu();
        stu.setName("芬芬");
        stu.setStatus("01");
        stu.setSchool("黑龙江大学");
        int num = stuService.SaveStu(stu);
        return num;
    }

    //查询所有
    @RequestMapping("/selectAll")
    public List<Stu> queryAll(){
        List<Stu> stuList= stuService.queryAll();
        return stuList;
    }
}
