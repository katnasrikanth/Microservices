package com.slokam.vc.course.service;

import com.slokam.vc.course.entity.Language;
import com.slokam.vc.course.repo.LanguageRepo;

import java.util.*;

public interface LanguageService {
	
	public List<Language> getAll();
	public Language getById(Integer id);
	public Language save(Language Language);
	public void remove(Language Language);
    public void remove(Integer id);
}
