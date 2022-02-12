package com.ssangu.springjpa.hibernateInheritance.singleTableStrategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.hibernateInheritance.singleTableStrategy.entities.Cheque;
import com.ssangu.springjpa.hibernateInheritance.singleTableStrategy.entities.CreditCard;
import com.ssangu.springjpa.hibernateInheritance.singleTableStrategy.repos.PaymentRepository;

@SpringBootTest
class SpringDataInheritanceSingleTableStrategyApplicationTests {
	
	@Autowired
	PaymentRepository repos;
	
	@Test
	public void testCreateCreditCardPayment() {
		
		CreditCard cc = new CreditCard();
		cc.setCardNumber("123482323");
		cc.setAmount(400d);
		repos.save(cc);
	}
	
	
	@Test
	public void testCreateChequePayment() {
		
		Cheque ch = new Cheque();
		ch.setChequeNumber("ch1234823");
		ch.setAmount(400d);
		repos.save(ch);
	}

}
