package com.ant.open.service;

import com.ant.open.pojo.Journey;

import java.util.List;

/**
 * Created by qxd on 2016/1/14.
 */
public interface IJourneyService {

    /**
     * 发布行程
     * @param journey
     * @return
     */
    int publishJourney(Journey journey);

    /**
     * 获取详情
     * @param id
     * @return
     */
    Journey getJourney(int id);

    /**
        获取列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Journey> getJourneyList(int pageNum, int pageSize);
}
