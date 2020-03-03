package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Language;
import com.slokam.vc.course.repo.LanguageRepo;
import com.slokam.vc.course.service.LanguageService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LanguageServiceImpl implements LanguageService {

      
   

	@Autowired
	private LanguageRepo repo;
	
	@Override
	public List<Language> getAll() {
		return repo.findAll();
	}

	@Override
	public Language getById(Integer id) {
		
		Optional<Language> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Language save(Language todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Language todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
