package com.ant.open.dao;

import com.ant.open.pojo.User;

/**
 * 用户
 * Created by qxd on 2015/12/27.
 */
public interface UserDAO {
    User login(String username, String password);

    int register(String phone, String password, String nickname, int sex, String birthday, String avatar);

}
