package com.ant.open.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.youguu.core.dao.DataSourceLoader;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.ant*"})
public class ContextLoader  extends DataSourceLoader {
	

}
