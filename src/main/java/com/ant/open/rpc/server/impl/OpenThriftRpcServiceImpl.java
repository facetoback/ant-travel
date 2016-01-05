package com.ant.open.rpc.server.impl;

import com.ant.open.rpc.thrift.gen.UserThrift;
import com.ant.open.service.IOpenService;
import com.ant.open.rpc.thrift.gen.OpenRpcThriftService;
import com.youguu.core.util.ClassCast;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by qxd on 2015/8/12.
 */
@Service("openThriftRpcService")
public class OpenThriftRpcServiceImpl implements OpenRpcThriftService.Iface {

    @Resource
    private IOpenService openService;

    @Override
    public UserThrift login(String username, String password) throws TException {
        return ClassCast.cast(openService.login(username, password), UserThrift.class);
    }

    @Override
    public int registe(String phone, String password, String nickname, int sex, String birthday, String avatar) throws TException {
        return openService.register(phone, password, nickname, sex, birthday, avatar);
    }
}
