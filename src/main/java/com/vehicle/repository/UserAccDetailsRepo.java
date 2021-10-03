package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.pojo.UserAccDetails;

@Repository
public interface UserAccDetailsRepo extends JpaRepository<UserAccDetails, Integer>{

	UserAccDetails findByAccNo(String tempAccNo);
}
