package com.myRetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRetailApplication
{

//	@Autowired
//	private UserServiceImpl userServiceImpl;
//
//	@Autowired
//	private RoleServiceImpl roleServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(MyRetailApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception{
//
//		Role role = new Role();
//		role.setRoleName("admin");
//		roleServiceImpl.saveOrUpdate(role);
//
//		User user = new User();
//		user.setUsername("user");
//		user.setPassword(new BCryptPasswordEncoder().encode("1234"));
//		user.setRole(roleServiceImpl.findById(1L).get());
//		userServiceImpl.saveOrUpdate(user);
//	}
}
