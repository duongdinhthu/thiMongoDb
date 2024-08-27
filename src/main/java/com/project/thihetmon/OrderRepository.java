package com.project.thihetmon;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
    Order findByOrderid(int orderid);
}
