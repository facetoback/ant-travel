package com.youguu.open.service.impl;


import com.youguu.open.service.IOpenService;
import org.springframework.stereotype.Service;

@Service(value = "openService")
public class OpenServiceImpl implements IOpenService {


    @Override
    public boolean isLogon() {
        return true;
    }
}
