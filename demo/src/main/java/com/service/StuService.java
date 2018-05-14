package com.service;

import com.bean.Stu;
import com.dao.etoak.StuIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:chao.wei
 * @Date: Created in 2017/10/12 0012.
 */
@Service
public class StuService {
   @Autowired
   private StuIf stuif;
    //查询名字是魏超的用户

    public Stu getStuByName(String name){
        Stu stu = stuif.getStuByName(name);
        return stu ;
    }

    //查询用户根据id

    public Stu getStuById(Integer id){
       Stu stu =  stuif.getStuById(id);
        return stu ;
    }

    //保存用户

    public int SaveStu(Stu stu){
        Integer num = stuif.SaveStu(stu);
        return num ;
    }

    //查询所有

    public List<Stu> queryAll(){
        List<Stu> stuList = stuif.queryAll();
        return stuList;
    }

}
