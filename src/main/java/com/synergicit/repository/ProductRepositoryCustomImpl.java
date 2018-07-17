package com.synergicit.repository;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.synergicit.dao.Product;

@Repository
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Product> getProductsByCategoryAndPrice(String category, Double min, Double max) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").exists(true));
		if(!StringUtils.isBlank(category)) {
			query.addCriteria(Criteria.where("category").is(category));
		}
		if(min != null && max != null) {
			query.addCriteria(Criteria.where("price").gte(min).lte(max));
		}
		else if(min != null) {
			query.addCriteria(Criteria.where("price").gte(min));
		}
		else if(max != null) {
			query.addCriteria(Criteria.where("price").lte(max));
		}
		List<Product> list =  mongoTemplate.find(query, Product.class);
		return list;
	}
}
