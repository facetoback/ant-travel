package com.ant.open.rpc.common;


import com.ant.open.rpc.thrift.gen.OpenRpcThriftService;

public enum ClientMultiplexProp {

    AntThriftRpcService("AntThriftRpcService",
                        OpenRpcThriftService.Client.class,
                        OpenRpcThriftService.Processor.class,
                        OpenRpcThriftService.Iface.class
    );

    Class<?> processor;

    Class<?> client;

    Class<?> iface;

    private String name;

    ClientMultiplexProp(String name, Class<?> client, Class<?> processor, Class<?> iface) {
        this.processor = processor;
        this.client = client;
        this.name = name;
        this.iface = iface;
    }

    public Class<?> getProcessor() {
        return processor;
    }

    public void setProcessor(Class<?> processor) {
        this.processor = processor;
    }

    public Class<?> getClient() {
        return client;
    }

    public void setClient(Class<?> client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<?> getIface() {
        return iface;
    }

    public void setIface(Class<?> iface) {
        this.iface = iface;
    }

}
