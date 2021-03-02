package com.itcc.boot.service;

import com.itcc.boot.bean.User;

import java.util.List;

/**
 * Created by caocaixia on 2021/2/22 12:45
 */

public interface UserService {

    List<User> getUserList();

    void removeById(Long id);
}
