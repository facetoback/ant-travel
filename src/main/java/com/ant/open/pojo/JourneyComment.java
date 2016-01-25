package com.ant.open.pojo;

import java.util.Date;

/**
 * 行程
 * Created by qxd on 2016/1/14.
 */
public class JourneyComment {

    //id
    private int id;
    //行程Id
    private int journey;
    //评论人ID
    private int userId;
    //回复的评论ID
    private int toCommentId;
    //评论内容
    private String content;
    //状态
    private int status;
    //创建时间
    private Date createDate;
    //更新时间
    private Date updateTime;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Journey{");
        sb.append("id=").append(id);
        sb.append(", journey=").append(journey);
        sb.append(", userId=").append(userId);
        sb.append(", toCommentId=").append(toCommentId);
        sb.append(", content='").append(content).append('\'');
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJourney() {
        return journey;
    }

    public void setJourney(int journey) {
        this.journey = journey;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getToCommentId() {
        return toCommentId;
    }

    public void setToCommentId(int toCommentId) {
        this.toCommentId = toCommentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
