package com.ant.open.rpc.client.impl;

import com.ant.open.pojo.Journey;
import com.ant.open.pojo.User;
import com.ant.open.rpc.client.AntRpcClient;
import com.ant.open.rpc.thrift.gen.JourneyThrift;
import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import com.ant.open.rpc.client.IAntRpcService;
import com.ant.open.rpc.common.Constants;
import com.youguu.core.util.ClassCast;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * Created by qxd on 2015/11/30.
 */
@Service("antRpcService")
public class AntRpcServiceImpl implements IAntRpcService {

    private static final Log logger = LogFactory.getLog(Constants.ISTOCKRPC_CLIENT);

    public AntRpcClient getClient(){
        return new AntRpcClient();
    }

    @Override
    public User login(String username, String password) {
        try {
            return ClassCast.cast(getClient().login(username, password), User.class);

        } catch (TException e) {
            logger.error(e);
        }
        return null;
    }

    @Override
    public int register(String phone, String password, String nickname, int sex, String birthday, String avatar) {
        try {
            return getClient().registe(phone, password, nickname, sex, birthday, avatar);

        } catch (TException e) {
            logger.error(e);
        }
        return 0;
    }

    @Override
    public int publishJourney(Journey journey) {
        try {
            return getClient().publishJourney(ClassCast.cast(journey, JourneyThrift.class));

        } catch (TException e) {
            logger.error(e);
        }
        return 0;
    }

    @Override
    public Journey getJourney(int id) {
        try {
            return ClassCast.cast(getClient().getJourney(id), Journey.class);

        } catch (TException e) {
            logger.error(e);
        }
        return null;
    }
}
