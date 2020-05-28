package com.maskmanage.service.impl;

import com.maskmanage.entity.requirement;
import com.maskmanage.entity.requirementExample;
import com.maskmanage.mapper.requirementMapper;
import com.maskmanage.service.requirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class requirementServiceImpl implements requirementService {
    @Autowired
    private requirementMapper reqMapper;

    @Override
    public void save(requirement reqr) throws Exception {
        reqMapper.insert(reqr);
    }

    @Override
    public List<requirement> getAllRequirement() {
        requirementExample example = new requirementExample();
        requirementExample.Criteria criteria =example.createCriteria();
        return reqMapper.selectByExample(example);
    }
}
