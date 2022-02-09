package com.ssangu.springjpa.jpql.repos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ssangu.springjpa.jpql.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	@Query("from Student")
	List<Student> findAll();
	
	@Query("select st.firstName, st.lastName from Student st")
	List<Object[]> findAllStudentsPartialData();
	
	@Query("from Student where firstName=:fName")
	List<Student> findStudentsByFirstName(@Param("fName") String firstName);
	
	@Query("from Student where score between :min and :max")
	List<Student> findStudentsByScore(@Param("min") int min, @Param("max")int max);
	
	@Modifying
	@Query("DELETE FROM Student WHERE firstName = :firstName")
	void deleteStudentsByFirstName(@Param("firstName")String firstName);
	
	
	@Query("from Student")
	List<Student> findAllStudents(Pageable pageable);
	
	@Query(value="select * from student_jpql", nativeQuery = true)
	List<Student> findAllStudents();
	
	@Query(value="select * from student_jpql where fname = :firstName", nativeQuery = true)
	List<Student> findStudentsByFirstNameNQ(@Param("firstName")String firstName);
}
