package com.simon.service;

import com.simon.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    // set
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
