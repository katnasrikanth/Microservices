package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Unit;
import com.slokam.vc.course.repo.UnitRepo;
import com.slokam.vc.course.service.UnitService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UnitServiceImpl implements UnitService {

      
   

	@Autowired
	private UnitRepo repo;
	
	@Override
	public List<Unit> getAll() {
		return repo.findAll();
	}

	@Override
	public Unit getById(Integer id) {
		
		Optional<Unit> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Unit save(Unit todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Unit todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
