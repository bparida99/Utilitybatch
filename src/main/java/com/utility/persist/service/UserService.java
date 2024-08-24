package com.utility.persist.service;

import com.utility.persist.dao.DetailsDao;
import com.utility.persist.dao.UserDao;
import com.utility.persist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private DetailsDao detailsDao;
	
	
	public void execute() {
		
		User u = new User();
		u.setName("Biswo");
		u.setEmail("dont know");
		u.setAddmissionOn(new Date());
		u.setAddmissionOnTime(new Date());
		userDao.saveAndFlush(u);
		userDao.getallUserss().forEach(u1->{
			System.out.println(u1.getName());
		});;
		
	}

	@Async("threadPoolTaskExecutor")
	 public void compute(int i) throws InterruptedException {
		 Thread.sleep(50000);
		 System.out.println("Entered in method " +i + " Calling from Thread  :" +Thread.currentThread());
	 }

}
