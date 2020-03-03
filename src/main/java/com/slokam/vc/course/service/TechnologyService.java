package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Technology;
import com.slokam.vc.course.repo.TechnologyRepo;

import java.util.*;

public interface TechnologyService {
	
	public List<Technology> getAll();
	public Technology getById(Integer id);
	public Technology save(Technology Technology);
	public void remove(Technology Technology);
    public void remove(Integer id);
}
