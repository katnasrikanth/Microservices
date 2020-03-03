package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Course;
import com.slokam.vc.course.repo.CourseRepo;

import java.util.*;

public interface CourseService {
	
	public List<Course> getAll();
	public Course getById(Integer id);
	public Course save(Course Course);
	public void remove(Course Course);
    public void remove(Integer id);
}
