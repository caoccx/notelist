package com.itcc.boot.service.impl;

import com.itcc.boot.bean.User;
import com.itcc.boot.mapper.UserMapper;
import com.itcc.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caocaixia on 2021/2/22 12:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public void removeById(Long id) {
         userMapper.removeById(id);
    }
}
