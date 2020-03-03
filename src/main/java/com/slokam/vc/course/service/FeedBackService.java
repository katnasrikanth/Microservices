package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.FeedBack;
import com.slokam.vc.course.repo.FeedBackRepo;

import java.util.*;

public interface FeedBackService {
	
	public List<FeedBack> getAll();
	public FeedBack getById(Integer id);
	public FeedBack save(FeedBack FeedBack);
	public void remove(FeedBack FeedBack);
    public void remove(Integer id);
}
