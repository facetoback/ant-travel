package com.ant.open.rpc.client.impl;

import com.ant.open.rpc.client.AntRpcClient;
import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import com.ant.open.rpc.client.IAntRpcService;
import com.ant.open.rpc.common.Constants;
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
    public boolean isLogon() {
        try {
            return getClient().isLogon();

        } catch (TException e) {
            logger.error(e);
        }
        return false;
    }
}
