package com.ssangu.springjpa.generators.customGenerator.idGenerator;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		Random random = null;
		int id = 0;
		random = new Random();
		id = random.nextInt(100000);
		return id;
	}

}
