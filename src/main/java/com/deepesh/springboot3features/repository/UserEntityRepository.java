package com.deepesh.springboot3features.repository;


import com.deepesh.springboot3features.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,String> {

	
}
