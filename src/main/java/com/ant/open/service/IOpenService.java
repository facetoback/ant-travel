package com.ant.open.service;


import com.ant.open.pojo.User;

public interface IOpenService {

	User login(String username, String password);

	int register(String phone, String password,  String nickname, int sex, String birthday, String avatar);
	}
