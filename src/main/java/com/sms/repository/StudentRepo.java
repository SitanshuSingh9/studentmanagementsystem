package com.sms.repository;

import com.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepo extends JpaRepository<Student,Long> {

}
