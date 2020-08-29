package com.app.services;

import com.app.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String getFirstUser() {
        return userDao.getUsers().get(0);
    }
}
