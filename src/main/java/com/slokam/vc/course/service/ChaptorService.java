package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Chaptor;
import com.slokam.vc.course.repo.ChaptorRepo;

import java.util.*;

public interface ChaptorService {
	
	public List<Chaptor> getAll();
	public Chaptor getById(Integer id);
	public Chaptor save(Chaptor Chaptor);
	public void remove(Chaptor Chaptor);
    public void remove(Integer id);
}
