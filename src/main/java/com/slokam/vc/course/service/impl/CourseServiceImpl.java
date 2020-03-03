package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Course;
import com.slokam.vc.course.repo.CourseRepo;
import com.slokam.vc.course.service.CourseService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CourseServiceImpl implements CourseService {

      
   

	@Autowired
	private CourseRepo repo;
	
	@Override
	public List<Course> getAll() {
		return repo.findAll();
	}

	@Override
	public Course getById(Integer id) {
		
		Optional<Course> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Course save(Course todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Course todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
