package com.simplesolutions.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.simplesolutions.models.User;

public interface UsersRepository extends MongoRepository<User, Integer>{

}
