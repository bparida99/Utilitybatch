package com.utility.persist.api;

import com.utility.persist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService us;
	
	@GetMapping("/execute")
	public String execute() {
		us.execute();
		return "Success";
	}

}
