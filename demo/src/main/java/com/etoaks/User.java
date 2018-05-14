package com.etoaks;

import com.alibaba.fastjson.annotation.JSONField;


import java.util.Date;

/**
 * Created by Administrator on 2017/10/8 0008.
 */
public class User {
    private int id;
    private String name;
    @JSONField(format = "yyyy-MM-dd :HH/mm/ss")
    private Date createTime;
    @JSONField(serialize = false)
    private String remarks;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
