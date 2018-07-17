package com.synergicit.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.synergicit.dao.Product;

@Repository
public interface ProductRepositoryCustom {
	List<Product> getProductsByCategoryAndPrice(String category, Double min, Double max);
}
