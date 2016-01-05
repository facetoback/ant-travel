package com.ant.open.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * Created by qxd on 2015/12/24.
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String nickname;
    private String phonenumber;
    private String email;
    private String password;
    private String realname;
    private int sex;
    private Date birthday;
    private int level;
    private int nameAuth;
    private int emailAuth;
    private int phoneAuth;
    private int status;
    private Date createTime;
    private Date updateTime;
    private String avatarUrl;
    private String signature;
    private String province;
    private String city;
    private int followerCount;
    private int followningCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNameAuth() {
        return nameAuth;
    }

    public void setNameAuth(int nameAuth) {
        this.nameAuth = nameAuth;
    }

    public int getEmailAuth() {
        return emailAuth;
    }

    public void setEmailAuth(int emailAuth) {
        this.emailAuth = emailAuth;
    }

    public int getPhoneAuth() {
        return phoneAuth;
    }

    public void setPhoneAuth(int phoneAuth) {
        this.phoneAuth = phoneAuth;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getFollowningCount() {
        return followningCount;
    }

    public void setFollowningCount(int followningCount) {
        this.followningCount = followningCount;
    }
}
