package com.maskmanage.service;

import com.maskmanage.entity.requirement;

import java.util.List;

public interface requirementService {
    void save(requirement reqr) throws Exception;

    List<requirement> getAllRequirement();
}
