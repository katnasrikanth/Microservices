package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Cat;
import com.slokam.vc.course.repo.CatRepo;
import com.slokam.vc.course.service.CatService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CatServiceImpl implements CatService {

      
   

	@Autowired
	private CatRepo repo;
	
	@Override
	public List<Cat> getAll() {
		return repo.findAll();
	}

	@Override
	public Cat getById(Integer id) {
		
		Optional<Cat> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Cat save(Cat todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Cat todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
