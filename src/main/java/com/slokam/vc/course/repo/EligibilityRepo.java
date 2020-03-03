package com.slokam.vc.course.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.vc.course.entity.Eligibility;
				@Repository
				public interface EligibilityRepo extends JpaRepository<Eligibility, Integer> {

				}
