package com.ciyama.request.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciyama.request.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
