package com.exam.services;

import java.util.List;
import java.util.Set;

import com.exam.models.User;
import com.exam.models.UserRoleAssign;

public interface UserService {

	public List<User> getUser();

	public User save(User user,Set<UserRoleAssign>roles);

	public User findById(Integer id);

	public void delete(User user);

}