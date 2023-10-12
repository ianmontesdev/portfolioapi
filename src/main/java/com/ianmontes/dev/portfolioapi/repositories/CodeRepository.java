package com.ianmontes.dev.portfolioapi.repositories;

import com.ianmontes.dev.portfolioapi.models.Code;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends MongoRepository<Code, ObjectId> {
}
