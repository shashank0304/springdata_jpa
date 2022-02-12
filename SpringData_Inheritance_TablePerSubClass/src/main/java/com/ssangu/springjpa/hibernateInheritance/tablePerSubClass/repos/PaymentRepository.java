package com.ssangu.springjpa.hibernateInheritance.tablePerSubClass.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.hibernateInheritance.tablePerSubClass.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
