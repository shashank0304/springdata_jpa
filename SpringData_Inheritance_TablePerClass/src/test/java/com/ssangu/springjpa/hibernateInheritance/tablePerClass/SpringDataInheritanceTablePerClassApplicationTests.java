package com.ssangu.springjpa.hibernateInheritance.tablePerClass;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.hibernateInheritance.tablePerClass.entities.Cheque;
import com.ssangu.springjpa.hibernateInheritance.tablePerClass.entities.CreditCard;
import com.ssangu.springjpa.hibernateInheritance.tablePerClass.repos.PaymentRepository;

@SpringBootTest
class SpringDataInheritanceTablePerClassApplicationTests {
	
	@Autowired
	PaymentRepository repos;
	
	@Test
	public void testCreateCreditCardPayment() {
		
		CreditCard cc = new CreditCard();
		//cc.setId(1);
		cc.setCardNumber("7338457394753");
		cc.setAmount(300d);
		repos.save(cc);
	}
	
	@Test
	public void testCreateChequeNumber() {
		
		Cheque ch = new Cheque();
		//ch.setId(1);
		ch.setChequeNumber("83952304852095");
		ch.setAmount(300d);
		repos.save(ch);
	}

}
