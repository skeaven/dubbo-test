package com.skeaven.provider;

import com.skeaven.api.User;
import com.skeaven.api.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void registerUser(User user) {
        System.out.println("hello " + user.getUsername());
    }

    @Override
    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return user;
    }
}
