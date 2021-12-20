package com.Ecommerce.Repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.Ecommerce.Entity.User;

@ComponentScan("com.Ecommerce")
public interface userRepository extends MongoRepository<User, Integer>{

}
