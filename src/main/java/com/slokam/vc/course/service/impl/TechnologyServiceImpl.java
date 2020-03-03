package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Technology;
import com.slokam.vc.course.repo.TechnologyRepo;
import com.slokam.vc.course.service.TechnologyService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TechnologyServiceImpl implements TechnologyService {

      
   

	@Autowired
	private TechnologyRepo repo;
	
	@Override
	public List<Technology> getAll() {
		return repo.findAll();
	}

	@Override
	public Technology getById(Integer id) {
		
		Optional<Technology> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Technology save(Technology todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Technology todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
