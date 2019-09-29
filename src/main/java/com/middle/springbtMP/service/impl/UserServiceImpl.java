package com.middle.springbtMP.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.middle.springbtMP.POJO.User;
import com.middle.springbtMP.mapper.UserMapper;
import com.middle.springbtMP.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Auther: middle
 * @Date: 2019/9/29 12:36
 * @Description:
 */
@Service(value="userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public int insertUser(User user) {
        return baseMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return baseMapper.updateById(user);
    }

    @Override
    public int deleteUserById(int id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public User findUserByName(String userName) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.allEq(Collections.singletonMap("user_name", userName));
        return baseMapper.selectOne(userQueryWrapper);
    }

    @Override
    public List<User> getUsersPage(int current, int size) {
        Page<User> page = new Page<>(current,size);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();// 没有设条件
        IPage<User> userIPage = baseMapper.selectPage(page, userQueryWrapper);
        return userIPage.getRecords();
    }

}
