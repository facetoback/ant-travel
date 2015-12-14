package com.youguu.open.rpc.server.impl;

import com.youguu.open.rpc.thrift.gen.OpenRpcThriftService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * Created by qxd on 2015/8/12.
 */
@Service("openThriftRpcService")
public class OpenThriftRpcServiceImpl implements OpenRpcThriftService.Iface {


    @Override
    public boolean isLogon() throws TException {
        return false;
    }
}
