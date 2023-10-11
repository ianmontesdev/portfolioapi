package com.ianmontes.dev.portfolioapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends MongoRepository<Code, ObjectId> {
}
