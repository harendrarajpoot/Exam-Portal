package com.exam.servicesimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.exceptions.UserAlreadyExistException;
import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRoleAssign;
import com.exam.repositories.RoleRepository;
import com.exam.repositories.UserRespository;
import com.exam.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRepo;

	@Autowired
	private RoleRepository roleRepo;
	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User save(User user, Set<UserRoleAssign> roles) {
		log.info("UserServiceImpl:save:{}", user);

		User email = this.userRepo.findByEmail(user.getemail());
		if (email != null) {
			System.out.println("user alredy present");
			throw new UserAlreadyExistException("User alredy present");
		} else {
			System.out.println("else----------"+roles);
			for (UserRoleAssign role : roles) {
				System.out.println("for----------");
				log.info("UserServiceImpl:save:{}", role.getRole());
				this.roleRepo.save(role.getRole());
				System.out.println("for end----------");
			}
			user.getRoles().addAll(roles);
			this.userRepo.save(user);

		}
return email;
	}

}
