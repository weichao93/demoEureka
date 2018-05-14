package com.service;

import com.bean.Cat;
import com.dao.etoak.CatIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:chao.wei
 * @Date: Created in 2017/10/9 0009.
 */
@Service
public class CatServie {

    @Autowired
    private CatIf catif;

    public CatIf getCatif() {
        return catif;
    }

    public void setCatif(CatIf catif) {
        this.catif = catif;
    }

    public void save(Cat cat){
        catif.save(cat);
    }
    public void delete(int id){
        catif.delete(id);
    }
}