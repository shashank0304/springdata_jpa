package com.ssangu.springjpa.pagingSorting.repos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ssangu.springjpa.pagingSorting.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
	
	List<Product> findByProductDescriptionContains(Pageable pageable, String productDesc);
	
	
}
