package com.utility.persist.dao;

import com.utility.persist.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DetailsDao extends JpaRepository<Details, Long>{

	@Query(value = "select * from utility.user u\r\n"
			+ "inner join utility.details d\r\n"
			+ "on u.user_id = d.user_id\r\n"
			+ "where u.user_id = ?1 "
			  , nativeQuery = true)
	List<Map<Object,Object>> findByCustomer(Long id);
	
}
