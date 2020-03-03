package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Tag;
import com.slokam.vc.course.repo.TagRepo;
import com.slokam.vc.course.service.TagService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TagServiceImpl implements TagService {

      
   

	@Autowired
	private TagRepo repo;
	
	@Override
	public List<Tag> getAll() {
		return repo.findAll();
	}

	@Override
	public Tag getById(Integer id) {
		
		Optional<Tag> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Tag save(Tag todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Tag todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
