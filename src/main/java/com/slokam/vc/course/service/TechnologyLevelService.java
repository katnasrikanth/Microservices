package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.TechnologyLevel;
import com.slokam.vc.course.repo.TechnologyLevelRepo;

import java.util.*;

public interface TechnologyLevelService {
	
	public List<TechnologyLevel> getAll();
	public TechnologyLevel getById(Integer id);
	public TechnologyLevel save(TechnologyLevel TechnologyLevel);
	public void remove(TechnologyLevel TechnologyLevel);
    public void remove(Integer id);
}
