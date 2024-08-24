package com.utility.persist.dao;

import com.utility.persist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<User, Long>{

	@Query(value = "CALL utility.new_procedure()",nativeQuery = true)
	public List<User> getallUserss();
}
