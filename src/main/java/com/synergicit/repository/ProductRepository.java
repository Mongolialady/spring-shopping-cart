package com.synergicit.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.synergicit.dao.Product;

public interface ProductRepository extends MongoRepository<Product, Long>, ProductRepositoryCustom {

}
