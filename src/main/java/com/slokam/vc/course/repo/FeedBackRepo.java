package com.slokam.vc.course.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.vc.course.entity.FeedBack;
				@Repository
				public interface FeedBackRepo extends JpaRepository<FeedBack, Integer> {

				}
