package com.ant.open.rpc.client;


import com.ant.open.pojo.Journey;
import com.ant.open.pojo.User;

/**
 * Created by qxd on 2015/11/30.
 */
public interface IAntRpcService {

    User login(String username, String password);

    int register(String phone, String password,  String nickname, int sex, String birthday, String avatar);

    /**
     * 发布行程
     * @param journey
     * @return
     */
    int publishJourney(Journey journey);

    /**
     * 获取详情
     * @param id
     * @return
     */
    Journey getJourney(int id);

}
