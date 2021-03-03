package com.itcc.boot.mapper;

import com.itcc.boot.entities.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by caocaixia on 2021/2/22 12:47
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> getUserList();

    @Delete("delete from user where id =#{id}")
    void removeById(Long id);

    int createUser(User user);

}
