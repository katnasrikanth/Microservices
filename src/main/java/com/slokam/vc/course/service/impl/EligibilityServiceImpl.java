package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Eligibility;
import com.slokam.vc.course.repo.EligibilityRepo;
import com.slokam.vc.course.service.EligibilityService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EligibilityServiceImpl implements EligibilityService {

      
   

	@Autowired
	private EligibilityRepo repo;
	
	@Override
	public List<Eligibility> getAll() {
		return repo.findAll();
	}

	@Override
	public Eligibility getById(Integer id) {
		
		Optional<Eligibility> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Eligibility save(Eligibility todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Eligibility todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
