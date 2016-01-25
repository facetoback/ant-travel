package com.ant.open.rpc.client;

import com.ant.open.rpc.thrift.gen.JourneyThrift;
import com.ant.open.rpc.thrift.gen.UserThrift;
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
    public UserThrift login(String username, String password) throws TException {
        RPCMultiplexConnection conn = null;
        try {
            conn = getConnection();
            return conn.getClient(OpenRpcThriftService.Client.class).login(username, password);
        } catch (Exception e) {
            if (e instanceof TApplicationException && ((TApplicationException) e).getType() == TApplicationException.MISSING_RESULT)
            {
                return null;
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

    @Override
    public int registe(String phone, String password, String nickname, int sex, String birthday, String avatar) throws TException {
        RPCMultiplexConnection conn = null;
        try {
            conn = getConnection();
            return conn.getClient(OpenRpcThriftService.Client.class).registe(phone, password, nickname, sex, birthday, avatar);
        } catch (Exception e) {
            if (e instanceof TApplicationException && ((TApplicationException) e).getType() == TApplicationException.MISSING_RESULT)
            {
                return 0;
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

    @Override
    public int publishJourney(JourneyThrift journey) throws TException {
        RPCMultiplexConnection conn = null;
        try {
            conn = getConnection();
            return conn.getClient(OpenRpcThriftService.Client.class).publishJourney(journey);
        } catch (Exception e) {
            if (e instanceof TApplicationException && ((TApplicationException) e).getType() == TApplicationException.MISSING_RESULT)
            {
                return 0;
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

    @Override
    public JourneyThrift getJourney(int id) throws TException {
        RPCMultiplexConnection conn = null;
        try {
            conn = getConnection();
            return conn.getClient(OpenRpcThriftService.Client.class).getJourney(id);
        } catch (Exception e) {
            if (e instanceof TApplicationException && ((TApplicationException) e).getType() == TApplicationException.MISSING_RESULT)
            {
                return null;
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
