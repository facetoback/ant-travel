package com.ant.open.dao.impl;

import com.ant.open.dao.BasicDAO;
import com.ant.open.dao.UserDAO;
import com.ant.open.pojo.User;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qxd on 2015/12/27.
 */
@Repository
public class UserDAOImpl extends BasicDAO<User> implements UserDAO {
    @Override
    public User login(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);

        return this.findUniqueBy("login", map );
    }

    @Override
    public int register(String phone, String password, String nickname, int sex, String birthday, String avatar) {
        User user = new User();
        user.setPhonenumber(phone);
        user.setPassword(password);
        user.setNickname(nickname);
        user.setSex(sex);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟
        Date date= null;
        try {
            date = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setBirthday(date);
        user.setAvatarUrl(avatar);
        this.insert(user);
        return user.getId();
    }
}
