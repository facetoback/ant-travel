package com.ant.open.dao.impl;

import com.ant.open.dao.BasicDAO;
import com.ant.open.dao.JourneyDAO;
import com.ant.open.pojo.Journey;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qxd on 2016/1/25.
 */
@Repository
public class JourneyDAOImpl extends BasicDAO<Journey> implements JourneyDAO {
    @Override
    public int publishJourney(Journey journey) {
        return this.insert(journey);
    }

    @Override
    public Journey getJourney(int id) {
        return this.get(id);
    }

    @Override
    public List<Journey> getJourneyList(int pageNum, int pageSize) {
        Map<String, Object> map = new HashMap<>();
        int pageStart = (pageNum -1)*pageSize;
        map.put("pageStart", pageStart);
        map.put("pageSize", pageSize);
        return this.findBy("getList", map);
    }
}
