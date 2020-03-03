package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Document;
import com.slokam.vc.course.repo.DocumentRepo;

import java.util.*;

public interface DocumentService {
	
	public List<Document> getAll();
	public Document getById(Integer id);
	public Document save(Document Document);
	public void remove(Document Document);
    public void remove(Integer id);
}
