package com.ant.open.pojo;

import java.util.Date;

/**
 * Created by qxd on 2016/1/14.
 */
public class Journey {
    //id
    private int id;
    //发布的用户ID
    private int userId;
    //出发地
    private String origin;
    //目的地
    private String destination;
    //出行方式
    private String tripMode;
    //出发日期
    private Date startDate;
    //出行天数
    private int dayCount;
    //行程人数
    private int partnerCount;
    //已有男生人数
    private int hasMaleCount;
    //已有女生人数
    private int hasFemaleCount;
    //还缺男生数量
    private int needMaleCount;
    //还缺女生数量
    private int needFemaleCount;
    //详情
    private String detail;
    //收藏人数
    private int collectCount;
    //顶的次数
    private int upCount;
    //分享次数
    private int shareCount;
    //评论次数
    private int commentCount;
    //状态
    private int status;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //性别限制 1男 0女 2不限
    private int sexLimit;
    //公开手机号 1公开 2实名用户可见 3私密
    private int publicPhone;
    //公开微信 1公开 2实名用户可见 3私密
    private int publicWechat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripMode() {
        return tripMode;
    }

    public void setTripMode(String tripMode) {
        this.tripMode = tripMode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public int getPartnerCount() {
        return partnerCount;
    }

    public void setPartnerCount(int partnerCount) {
        this.partnerCount = partnerCount;
    }

    public int getHasMaleCount() {
        return hasMaleCount;
    }

    public void setHasMaleCount(int hasMaleCount) {
        this.hasMaleCount = hasMaleCount;
    }

    public int getHasFemaleCount() {
        return hasFemaleCount;
    }

    public void setHasFemaleCount(int hasFemaleCount) {
        this.hasFemaleCount = hasFemaleCount;
    }

    public int getNeedMaleCount() {
        return needMaleCount;
    }

    public void setNeedMaleCount(int needMaleCount) {
        this.needMaleCount = needMaleCount;
    }

    public int getNeedFemaleCount() {
        return needFemaleCount;
    }

    public void setNeedFemaleCount(int needFemaleCount) {
        this.needFemaleCount = needFemaleCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }

    public int getUpCount() {
        return upCount;
    }

    public void setUpCount(int upCount) {
        this.upCount = upCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
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

    public int getSexLimit() {
        return sexLimit;
    }

    public void setSexLimit(int sexLimit) {
        this.sexLimit = sexLimit;
    }

    public int getPublicPhone() {
        return publicPhone;
    }

    public void setPublicPhone(int publicPhone) {
        this.publicPhone = publicPhone;
    }

    public int getPublicWechat() {
        return publicWechat;
    }

    public void setPublicWechat(int publicWechat) {
        this.publicWechat = publicWechat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Journey{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", origin='").append(origin).append('\'');
        sb.append(", destination='").append(destination).append('\'');
        sb.append(", tripMode='").append(tripMode).append('\'');
        sb.append(", startDate=").append(startDate);
        sb.append(", dayCount=").append(dayCount);
        sb.append(", partnerCount=").append(partnerCount);
        sb.append(", hasMaleCount=").append(hasMaleCount);
        sb.append(", hasFemaleCount=").append(hasFemaleCount);
        sb.append(", needMaleCount=").append(needMaleCount);
        sb.append(", needFemaleCount=").append(needFemaleCount);
        sb.append(", detail='").append(detail).append('\'');
        sb.append(", collectCount=").append(collectCount);
        sb.append(", upCount=").append(upCount);
        sb.append(", shareCount=").append(shareCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", sexLimit=").append(sexLimit);
        sb.append(", publicPhone=").append(publicPhone);
        sb.append(", publicWechat=").append(publicWechat);
        sb.append('}');
        return sb.toString();
    }
}
