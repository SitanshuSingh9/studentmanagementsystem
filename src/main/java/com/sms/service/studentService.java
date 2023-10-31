package com.sms.service;

import com.sms.entity.Student;

import java.util.List;

public interface studentService {

    List<Student>getallStudent();

    Student savestudent(Student student);

    Student getstudentbyid(Long id);
    Student updatestudent(Student student);

    void deleteStudentbyid(Long id);
}
