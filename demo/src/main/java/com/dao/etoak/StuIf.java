package com.dao.etoak;

import com.bean.Stu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @Author:chao.wei
 * @Date: Created in 2017/10/12 0012.
 */
//@Repository
public interface StuIf {
    //查询名字是魏超的用户
   @Select("select * from stu where name=#{name}")
    public Stu getStuByName(String name);

    //查询用户根据id
    @Select("select * from stu where name=#{id}")
    public Stu getStuById(Integer id);

    //保存用户
   @Insert("insert into stu(name,birth,status,school) values(#{name},#{birth},#{status},#{school})")
   @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
   public int SaveStu(Stu stu);

   //查询所有
    @Select("select * from stu")
    public List<Stu> queryAll();

}
