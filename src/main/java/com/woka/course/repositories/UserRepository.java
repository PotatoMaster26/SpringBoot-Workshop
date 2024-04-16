package com.woka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woka.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
		
	}

