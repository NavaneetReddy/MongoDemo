package com.example.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Pets;

public interface PetsRepositoryInterface extends MongoRepository<Pets, String>{
	
	Pets findBy_id(ObjectId _id);
		
}
