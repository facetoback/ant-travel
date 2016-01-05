package com.ant.open.util;

import com.youguu.core.dao.multi.MultiDataSourceTransactionManager;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.youguu.core.dao.DataSourceLoader;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.ant*"})
public class ContextLoader  extends DataSourceLoader {

    public DataSource getDataSource(){
        return load("ant", "ant");
    }

    @Bean
    public SqlSessionFactory antSessionFactory() throws Exception{
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(getDataSource());
        DefaultResourceLoader dc=new DefaultResourceLoader();
        bean.setConfigLocation(dc.getResource("classpath:mybatis/ant_sqlMapConfig.xml"));
        return bean.getObject();
    }

//    @Bean
//    public DataSourceTransactionManager txUser(){
//        DataSourceTransactionManager transactionManager = new MultiDataSourceTransactionManager();
//        transactionManager.setDataSource(getDataSource());
//        return transactionManager;
//
//    }
}
