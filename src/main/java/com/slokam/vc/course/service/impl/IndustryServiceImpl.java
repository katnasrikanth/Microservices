package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Industry;
import com.slokam.vc.course.repo.IndustryRepo;
import com.slokam.vc.course.service.IndustryService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IndustryServiceImpl implements IndustryService {

      
   

	@Autowired
	private IndustryRepo repo;
	
	@Override
	public List<Industry> getAll() {
		return repo.findAll();
	}

	@Override
	public Industry getById(Integer id) {
		
		Optional<Industry> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Industry save(Industry todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Industry todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
