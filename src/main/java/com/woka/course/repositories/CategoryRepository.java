package com.woka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woka.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
		
	}

