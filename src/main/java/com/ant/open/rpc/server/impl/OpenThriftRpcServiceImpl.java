package com.ant.open.rpc.server.impl;

import com.ant.open.service.IOpenService;
import com.ant.open.rpc.thrift.gen.OpenRpcThriftService;
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
    public boolean isLogon() throws TException {
        return openService.isLogon();
    }
}
