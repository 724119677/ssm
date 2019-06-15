package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {

    //根据id来查询数据
    @Select("SELECT * FROM  Items where id=#{id}")
    public Items findById(Integer id);
}
