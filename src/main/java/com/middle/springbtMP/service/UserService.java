package com.middle.springbtMP.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.middle.springbtMP.POJO.User;

import java.util.List;

public interface UserService extends IService<User> {
    // 常见的方法，MP都提供了，特殊的需要自己实现
    int insertUser(User user);
    int updateUser(User user);
    int deleteUserById(int id);

    User findUserByName(String userName);
    List<User> getUsersPage(int current, int size);
}
