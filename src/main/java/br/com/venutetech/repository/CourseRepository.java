package br.com.venutetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.venutetech.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    
	
}
