package com.ant.open.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;

import com.youguu.core.dao.SqlDAO;

public class BasicDAO<T> extends SqlDAO<T> {
    public BasicDAO() {
        super();
        setUseSimpleName(true);
    }
    @Resource(name = "antSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
