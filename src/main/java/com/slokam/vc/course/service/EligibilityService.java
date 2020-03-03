package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Eligibility;
import com.slokam.vc.course.repo.EligibilityRepo;

import java.util.*;

public interface EligibilityService {
	
	public List<Eligibility> getAll();
	public Eligibility getById(Integer id);
	public Eligibility save(Eligibility Eligibility);
	public void remove(Eligibility Eligibility);
    public void remove(Integer id);
}
