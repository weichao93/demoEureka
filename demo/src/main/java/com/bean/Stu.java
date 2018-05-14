package com.bean;

import java.util.Date;

/**
 * @Author:chao.wei
 * @Date: Created in 2017/10/12 0012.
 */
public class Stu {
    private String  id;
    private String name;
    private Date birth;
    private String status;
    private String school;

    public Stu() {
    }

    public Stu(String  id, String name, Date birth, String status, String school) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.status = status;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
