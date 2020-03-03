package com.slokam.vc.course.service.impl;

import com.slokam.vc.course.entity.Document;
import com.slokam.vc.course.repo.DocumentRepo;
import com.slokam.vc.course.service.DocumentService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DocumentServiceImpl implements DocumentService {

      
   

	@Autowired
	private DocumentRepo repo;
	
	@Override
	public List<Document> getAll() {
		return repo.findAll();
	}

	@Override
	public Document getById(Integer id) {
		
		Optional<Document> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Document save(Document todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Document todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
