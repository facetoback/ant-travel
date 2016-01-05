package com.ant.open.rpc.client;


import com.ant.open.pojo.User;

/**
 * Created by qxd on 2015/11/30.
 */
public interface IAntRpcService {

    User login(String username, String password);

    int register(String phone, String password,  String nickname, int sex, String birthday, String avatar);
}
