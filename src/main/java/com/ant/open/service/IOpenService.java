package com.ant.open.service;


import com.ant.open.pojo.User;

public interface IOpenService {

	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 */
	User login(String username, String password);

	/**
	 * 注册
	 * @param phone 手机号
	 * @param password 密码
	 * @param nickname 昵称
	 * @param sex 性别
	 * @param birthday 生日
	 * @param avatar 头像
	 * @return
	 */
	int register(String phone, String password,  String nickname, int sex, String birthday, String avatar);
	}
