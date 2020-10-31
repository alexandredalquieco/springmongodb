package com.example.coursemongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.coursemongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
