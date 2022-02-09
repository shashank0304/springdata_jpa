package com.ssangu.springjpa.jpql;

import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.ssangu.springjpa.jpql.entities.Student;
import com.ssangu.springjpa.jpql.repos.StudentRepository;

@SpringBootTest
class SpringDataJpqlApplicationTests {
	
	@Autowired
	StudentRepository repos;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testStudentCreate() {
			
		Student student = new Student();
		student.setFirstName("Justin");
		student.setLastName("Campbell");
		student.setScore(71);
		
		Student student1 = new Student();
		student1.setFirstName("Joe");
		student1.setLastName("Bank");
		student1.setScore(65);
		
		Student student2 = new Student();
		student2.setFirstName("Arnold");
		student2.setLastName("Camp");
		student2.setScore(81);
		
		repos.save(student);
		repos.save(student1);
		repos.save(student2);
		
	}
	
	@Test
	public void testFindAllStudents() {
			
		repos.findAll().forEach(p->System.out.println(p.getFirstName()+ " "+p.getScore()));
	}
	
	@Test
	public void testFindAllStudentsPartialData() {
			
		List<Object[]> partialData = repos.findAllStudentsPartialData();
		for(Object[] obj: partialData) {
			System.out.println(obj[0]+" "+obj[1]);
		}
	}
	
	@Test
	public void testFindStudentsByFirstName() {
		
		repos.findStudentsByFirstName("Ben").forEach(p->System.out.println(p.getId()+" "+p.getFirstName()));
	}
	
	@Test
	public void testFindStudentsByScore() {
		repos.findStudentsByScore(90, 100).forEach(p -> System.out.println(p.getFirstName()+" "+p.getScore()));
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteStudentsByFirstName() {
		repos.deleteStudentsByFirstName("Joe");
	}
	
	@Test
	public void testFindAllStudentsPageable() {
		Pageable pageable = PageRequest.of(1, 2, Sort.by(Order.desc("score"),Order.asc("firstName")));
		repos.findAllStudents(pageable).forEach(p->System.out.println(p.getFirstName()+" "+p.getScore()));
	}
	
	@Test
	public void testFindAllStudentsNQ() {
		
		repos.findAllStudents().forEach(p->System.out.println(p));
	}
	
	@Test
	public void testFindStudentsByFirstNameNQ() {
		repos.findStudentsByFirstNameNQ("Kim").forEach(p->System.out.println(p));
	}
}
