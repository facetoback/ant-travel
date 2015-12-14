package com.youguu.open.rpc.common;

import com.youguu.open.rpc.server.impl.OpenThriftRpcServiceImpl;

/**
 * 
 * @ClassName: MultiplexProp
 * @Description: 对应的客户端，服务端
 * @author zhanglei
 * @date 2014年11月6日 上午11:14:46
 *
 */
public enum MultiplexProp {

	AntThriftRpcService("AntThriftRpcService",
			com.youguu.open.rpc.thrift.gen.OpenRpcThriftService.Client.class,
			com.youguu.open.rpc.thrift.gen.OpenRpcThriftService.Processor.class,
			com.youguu.open.rpc.thrift.gen.OpenRpcThriftService.Iface.class,
			OpenThriftRpcServiceImpl.class
	);

	Class<?> processor;
	
	Class<?> client;
	
	Class<?> iface;
	
	Class<?> impl;
	
	private String name;
	
	MultiplexProp(String name, Class<?> client, Class<?> processor, Class<?> iface, Class<?> impl){
		this.processor = processor;
		this.client = client;
		this.name = name;
		this.iface = iface;
		this.impl = impl;
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

	public Class<?> getImpl() {
		return impl;
	}

	public void setImpl(Class<?> impl) {
		this.impl = impl;
	}
}
