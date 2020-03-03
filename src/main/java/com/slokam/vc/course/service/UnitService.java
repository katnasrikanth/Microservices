package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Unit;
import com.slokam.vc.course.repo.UnitRepo;

import java.util.*;

public interface UnitService {
	
	public List<Unit> getAll();
	public Unit getById(Integer id);
	public Unit save(Unit Unit);
	public void remove(Unit Unit);
    public void remove(Integer id);
}
