package com.ant.open.service.impl;

import com.ant.open.dao.JourneyDAO;
import com.ant.open.pojo.Journey;
import com.ant.open.service.IJourneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qxd on 2016/1/14.
 */
@Service(value ="journeyService")
public class JourneyServiceImpl implements IJourneyService{

    @Resource
    private JourneyDAO journeyDAO;

    @Override
    public int publishJourney(Journey journey) {
        return journeyDAO.publishJourney(journey);
    }

    @Override
    public Journey getJourney(int id) {
        return journeyDAO.getJourney(id);
    }

    @Override
    public List<Journey> getJourneyList(int pageNum, int pageSize) {
        return journeyDAO.getJourneyList(pageNum, pageSize);
    }
}
