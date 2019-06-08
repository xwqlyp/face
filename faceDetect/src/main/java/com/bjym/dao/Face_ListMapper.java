package com.bjym.dao;

import java.util.List;

import com.bjym.pojo.Face_List;

public interface Face_ListMapper {
    
    
    /**
     *	调用  增加属性到数据库
     * @param product
     * @return
     */
    Integer save(Face_List face_list);
}