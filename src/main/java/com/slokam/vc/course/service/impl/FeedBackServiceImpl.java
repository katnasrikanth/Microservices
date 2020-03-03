package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.FeedBack;
import com.slokam.vc.course.repo.FeedBackRepo;
import com.slokam.vc.course.service.FeedBackService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FeedBackServiceImpl implements FeedBackService {

      
   

	@Autowired
	private FeedBackRepo repo;
	
	@Override
	public List<FeedBack> getAll() {
		return repo.findAll();
	}

	@Override
	public FeedBack getById(Integer id) {
		
		Optional<FeedBack> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public FeedBack save(FeedBack todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(FeedBack todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
