package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Video;
import com.slokam.vc.course.repo.VideoRepo;
import com.slokam.vc.course.service.VideoService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VideoServiceImpl implements VideoService {

      
   

	@Autowired
	private VideoRepo repo;
	
	@Override
	public List<Video> getAll() {
		return repo.findAll();
	}

	@Override
	public Video getById(Integer id) {
		
		Optional<Video> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Video save(Video todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Video todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
