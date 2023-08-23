package com.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exam.models.User;

public interface UserRespository extends JpaRepository<User, Integer> {

	@Query()
	public User findByEmail(String emailId);

}