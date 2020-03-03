package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.TechnologyLevel;
import com.slokam.vc.course.repo.TechnologyLevelRepo;
import com.slokam.vc.course.service.TechnologyLevelService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TechnologyLevelServiceImpl implements TechnologyLevelService {

      
   

	@Autowired
	private TechnologyLevelRepo repo;
	
	@Override
	public List<TechnologyLevel> getAll() {
		return repo.findAll();
	}

	@Override
	public TechnologyLevel getById(Integer id) {
		
		Optional<TechnologyLevel> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public TechnologyLevel save(TechnologyLevel todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(TechnologyLevel todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
