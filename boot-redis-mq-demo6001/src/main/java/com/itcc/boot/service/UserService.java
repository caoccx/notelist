package com.itcc.boot.service;

import com.itcc.boot.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caocaixia on 2021/2/22 12:45
 */

@Service
public interface UserService {

    List<User> getUserList();

    void removeById(Long id);

    int createUser(User user);
}
