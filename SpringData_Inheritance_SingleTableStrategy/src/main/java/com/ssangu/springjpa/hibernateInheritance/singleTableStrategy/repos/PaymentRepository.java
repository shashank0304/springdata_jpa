package com.ssangu.springjpa.hibernateInheritance.singleTableStrategy.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.hibernateInheritance.singleTableStrategy.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {

}
