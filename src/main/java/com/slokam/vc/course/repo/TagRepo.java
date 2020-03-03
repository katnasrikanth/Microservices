package com.slokam.vc.course.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.vc.course.entity.Tag;
				@Repository
				public interface TagRepo extends JpaRepository<Tag, Integer> {

				}
