package com.ant.open.service.impl;


import com.ant.open.dao.UserDAO;
import com.ant.open.pojo.User;
import com.ant.open.service.IOpenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "openService")
public class OpenServiceImpl implements IOpenService {

    @Resource
    private UserDAO userDAO;
    @Override
    public User login(String username, String password) {
        return userDAO.login(username, password);
    }

    @Override
    public int register(String phone, String password, String nickname, int sex, String birthday, String avatar) {
        return userDAO.register(phone, password, nickname, sex, birthday, avatar);
    }
}
