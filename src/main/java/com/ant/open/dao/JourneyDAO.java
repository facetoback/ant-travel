package com.ant.open.dao;

import com.ant.open.pojo.Journey;

import java.util.List;

/**
 * Created by qxd on 2016/1/14.
 */
public interface JourneyDAO {
    int publishJourney(Journey journey);

    Journey getJourney(int id);

    List<Journey> getJourneyList(int pageNum, int pageSize);
}
