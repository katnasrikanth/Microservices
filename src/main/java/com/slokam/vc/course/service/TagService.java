package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Tag;
import com.slokam.vc.course.repo.TagRepo;

import java.util.*;

public interface TagService {
	
	public List<Tag> getAll();
	public Tag getById(Integer id);
	public Tag save(Tag Tag);
	public void remove(Tag Tag);
    public void remove(Integer id);
}
