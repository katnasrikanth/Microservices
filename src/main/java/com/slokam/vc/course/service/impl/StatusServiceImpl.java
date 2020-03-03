package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Status;
import com.slokam.vc.course.repo.StatusRepo;
import com.slokam.vc.course.service.StatusService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StatusServiceImpl implements StatusService {

      
   

	@Autowired
	private StatusRepo repo;
	
	@Override
	public List<Status> getAll() {
		return repo.findAll();
	}

	@Override
	public Status getById(Integer id) {
		
		Optional<Status> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Status save(Status todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Status todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
