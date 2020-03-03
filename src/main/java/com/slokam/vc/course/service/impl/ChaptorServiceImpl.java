package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Chaptor;
import com.slokam.vc.course.repo.ChaptorRepo;
import com.slokam.vc.course.service.ChaptorService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ChaptorServiceImpl implements ChaptorService {

      
   

	@Autowired
	private ChaptorRepo repo;
	
	@Override
	public List<Chaptor> getAll() {
		return repo.findAll();
	}

	@Override
	public Chaptor getById(Integer id) {
		
		Optional<Chaptor> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Chaptor save(Chaptor todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Chaptor todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
