package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Status;
import com.slokam.vc.course.repo.StatusRepo;

import java.util.*;

public interface StatusService {
	
	public List<Status> getAll();
	public Status getById(Integer id);
	public Status save(Status Status);
	public void remove(Status Status);
    public void remove(Integer id);
}
