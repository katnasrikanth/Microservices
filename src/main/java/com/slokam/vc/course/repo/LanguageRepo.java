package com.slokam.vc.course.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.vc.course.entity.Language;
				@Repository
				public interface LanguageRepo extends JpaRepository<Language, Integer> {

				}
