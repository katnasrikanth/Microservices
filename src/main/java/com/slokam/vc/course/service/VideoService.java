package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Video;
import com.slokam.vc.course.repo.VideoRepo;

import java.util.*;

public interface VideoService {
	
	public List<Video> getAll();
	public Video getById(Integer id);
	public Video save(Video Video);
	public void remove(Video Video);
    public void remove(Integer id);
}
