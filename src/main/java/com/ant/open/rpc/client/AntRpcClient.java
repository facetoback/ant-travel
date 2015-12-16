package com.ant.open.rpc.client;

import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import com.youguu.core.util.RPCServiceClient;
import com.youguu.core.util.rpc.multipex.RPCMultiplexConnection;
import com.youguu.core.util.rpc.multipex.RPCMultiplexPool;
import com.ant.open.rpc.common.Constants;
import com.ant.open.rpc.thrift.gen.OpenRpcThriftService;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;

/**
 * Created by qxd on 2015/11/30.
 */
public class AntRpcClient implements OpenRpcThriftService.Iface {
    private static final Log logger = LogFactory.getLog(Constants.ISTOCKRPC_CLIENT);

    private static RPCMultiplexPool pool = RPCServiceClient.getMultiplexCPool(Constants.ISTOCKRPCPOOL);

    private RPCMultiplexConnection getConnection() {
        try {
            return pool.borrowObject();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    @Override
    public boolean isLogon() throws TException {
        RPCMultiplexConnection conn = null;
        try {
            conn = getConnection();
            return conn.getClient(OpenRpcThriftService.Client.class).isLogon();
        } catch (Exception e) {
            if (e instanceof TApplicationException && ((TApplicationException) e).getType() == TApplicationException.MISSING_RESULT)
            {
                return false;
            }else{
                conn.setIdle(false);
                throw e;
            }
        }finally{
            if(conn != null){
                try {
                    pool.returnObject(conn);
                } catch (Exception e) {
                    logger.error(e);
                }
            }
        }
    }
}
