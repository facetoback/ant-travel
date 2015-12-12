package com.youguu.open.member.service.impl;


import com.youguu.open.member.service.IOpenService;
import org.springframework.stereotype.Service;

@Service(value = "openService")
public class OpenServiceImpl implements IOpenService {


    @Override
    public boolean isLogon() {
        return true;
    }
}
