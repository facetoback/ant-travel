package com.youguu.open.util;

import javax.sql.DataSource;

import com.youguu.core.dao.multi.MultiDataSourceTransactionManager;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.youguu.core.dao.DataSourceLoader;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.youguu*"})
public class ContextLoader  extends DataSourceLoader {
	
	public DataSource getDataSource(){
		return loadMulti("open");
	}

	@Bean
	public SqlSessionFactory openSessionFactory() throws Exception{
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(getDataSource());
		DefaultResourceLoader dc=new DefaultResourceLoader();
		bean.setConfigLocation(dc.getResource("classpath:mybatis/open_sqlMapConfig.xml"));
		return bean.getObject();
	}
	
	@Bean
	public DataSourceTransactionManager txUser(){
		DataSourceTransactionManager transactionManager = new MultiDataSourceTransactionManager();
		transactionManager.setDataSource(getDataSource());
		return transactionManager;
		
	}

}
