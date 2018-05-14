package com.dao.etoak;

import com.bean.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * @Author:chao.wei
 * @Date: Created in 2017/10/9 0009.
 */
public interface CatIf extends CrudRepository<Cat,Integer> {

}
