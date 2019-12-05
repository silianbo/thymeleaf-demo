package com.silianbo.thymeleafdemo.web.controller;

import com.silianbo.thymeleafdemo.web.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bo
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public String listUser(Model model) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("张三" + i);
            userList.add(user);
        }
        model.addAttribute("users", userList);
        return "/user/list";
    }
}