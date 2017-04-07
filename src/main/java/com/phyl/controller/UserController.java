package com.phyl.controller;

import com.phyl.bean.User;
import com.phyl.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xh on 2017/4/6.
 */
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("add")
    public User addUser() {
        return userRepository.save(new User("phyl", 22));
    }


    @RequestMapping("find")
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
