package com.middle.springbtMP.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.middle.springbtMP.POJO.User;
import com.middle.springbtMP.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: middle
 * @Date: 2019/9/29 13:19
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/insert")
    public Object insert(@RequestBody User user) {
        return userService.insertUser(user);
    }


    @GetMapping("/deleteUserById")
    public Object delete(@RequestParam int  id) {
        return userService.deleteUserById(id);
    }


    @PostMapping("/update")
    public Object update(@RequestBody User user) {
        return userService.updateUser(user);
    }


    //http://localhost:8080/user/getUserByName?userName=孙悟空
    @GetMapping("/getUserByName")
    public Object getUserByName(@RequestParam String userName) {
        return userService.findUserByName(userName);
    }


    // 分页查
    // 查询所有
    // current和size两个参数[当前页，每页个数]
    @GetMapping("/page")
    public Object getUserPage(@RequestParam int current, @RequestParam int size) {
        return userService.getUsersPage(current, size);
    }

}
