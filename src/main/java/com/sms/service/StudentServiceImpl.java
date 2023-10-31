package com.sms.service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  studentService{

    @Autowired
    private StudentRepo repo;

    @Override
    public List<Student> getallStudent() {
        return repo.findAll();
    }

    @Override
    public Student savestudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student getstudentbyid(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Student updatestudent(Student student) {
        return repo.save(student);
    }

    @Override
    public void deleteStudentbyid(Long id) {
         repo.deleteById(id);
    }
}
