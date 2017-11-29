package com.dzr.dds.service;

import com.dzr.dds.po.User;

import java.util.List;

/**
 * @author dingzr
 * @Description
 * @ClassName UserService
 * @since 2017/11/29 17:39
 */
public interface UserService {

    /**
     *不指定数据源使用默认数据源
     *@return
     */
    List<User> getList();


    /**
     *指定数据源
     *@return
     */
    List<User> getListByDs1();

}
