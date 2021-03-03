package com.itcc.boot.service.impl;

import com.itcc.boot.entities.User;
import com.itcc.boot.mapper.UserMapper;
import com.itcc.boot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by caocaixia on 2021/2/22 12:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public void removeById(Long id) {
         userMapper.removeById(id);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }
}
