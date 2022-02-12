package com.ssangu.springjpa.hibernateInheritance.tablePerClass.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.hibernateInheritance.tablePerClass.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
