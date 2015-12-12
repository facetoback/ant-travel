package com.youguu.open.rpc.server;

import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import com.youguu.core.util.PropertiesUtil;
import com.youguu.core.util.rpc.ThriftRpcServer;
import com.youguu.open.common.constants.Constants;
import com.youguu.open.common.pojo.OpenFlow;
import com.youguu.open.rpc.thrift.MultiplexProp;
import com.youguu.open.util.ContextLoader;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.TProcessor;
import org.apache.thrift.transport.TTransportException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * Created by shilei on 2015/8/12.
 */
public class BootStrap {

    private static final Log logger = LogFactory.getLog(Constants.OPEN_SERVER_LOG);

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        ApplicationContext app = new AnnotationConfigApplicationContext(ContextLoader.class);

        TMultiplexedProcessor processor = new TMultiplexedProcessor();

        for (MultiplexProp prop : MultiplexProp.values()) {
            try {
                Constructor<?> cons = prop.getProcessor().getConstructor(prop.getIface());

                processor.registerProcessor(prop.getName(), (TProcessor) cons.newInstance(app.getBean(prop.getImpl())));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Properties prop = null;
        try {
            prop = PropertiesUtil.getProperties("properties/open_rpc_server.properties");
            if (null == prop) {
                logger.error("没有找到启动文件：open_rpc_server.properties");
                return;
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        String host = prop.getProperty("open.rpc.host.name").trim();
        int hostPort = Integer.valueOf(prop.getProperty("open.rpc.host.port").trim()).intValue();
        int workerThreads = Integer.valueOf(prop.getProperty("open.rpc.server.workerThreads")).intValue();

        ThriftRpcServer server = new ThriftRpcServer(
                host,
                hostPort,
                workerThreads,
                processor);


        try {
            logger.info("server start on port {}", hostPort);
            server.start();

        } catch (TTransportException e) {
            e.printStackTrace();
        }


    }
}
