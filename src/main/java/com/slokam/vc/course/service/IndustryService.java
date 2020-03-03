package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Industry;
import com.slokam.vc.course.repo.IndustryRepo;

import java.util.*;

public interface IndustryService {
	
	public List<Industry> getAll();
	public Industry getById(Integer id);
	public Industry save(Industry Industry);
	public void remove(Industry Industry);
    public void remove(Integer id);
}
