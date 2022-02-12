package com.ssangu.springjpa.hibernateInheritance.tablePerSubClass;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.hibernateInheritance.tablePerSubClass.entities.Cheque;
import com.ssangu.springjpa.hibernateInheritance.tablePerSubClass.entities.CreditCard;
import com.ssangu.springjpa.hibernateInheritance.tablePerSubClass.repos.PaymentRepository;

@SpringBootTest
class SpringDataInheritanceTablePerSubClassApplicationTests {

	@Autowired
	PaymentRepository repos;
	
	@Test
	public void createCreditCardPayment() {
			
		CreditCard cc = new CreditCard();
		cc.setAmount(125d);
		cc.setCardNumber("cc234832094");
		repos.save(cc);
	}
	
	@Test
	public void createChequePayment() {
			
		Cheque ch = new Cheque();
		ch.setAmount(325d);
		ch.setChequeNumber("ch234832094");
		repos.save(ch);
	}
}
