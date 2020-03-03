package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Cat;
import com.slokam.vc.course.repo.CatRepo;

import java.util.*;

public interface CatService {
	
	public List<Cat> getAll();
	public Cat getById(Integer id);
	public Cat save(Cat Cat);
	public void remove(Cat Cat);
    public void remove(Integer id);
}
