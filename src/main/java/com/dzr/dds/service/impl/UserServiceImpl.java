package com.dzr.dds.service.impl;

import com.dzr.dds.config.TargetDataSource;
import com.dzr.dds.dao.UserDao;
import com.dzr.dds.po.User;
import com.dzr.dds.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dingzr
 * @Description
 * @ClassName TestService
 * @since 2017/11/29 17:13
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     *不指定数据源使用默认数据源
     *@return
     */
    public List<User> getList(){
        return userDao.getList();
    }

    /**
     *指定数据源
     *@return
     */
    @TargetDataSource("ds1")
    public List<User> getListByDs1(){
        return userDao.getListByDs1();
    }
}
