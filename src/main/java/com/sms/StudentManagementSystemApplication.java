package com.sms;


import com.sms.entity.Student;
import com.sms.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }
@Autowired
    private StudentRepo repo;
    @Override
    public void run(String... args) throws Exception {

//
//        Student st1=new Student("Sitanshu","Thakur","sitanshu@gmail.com");
//               repo.save(st1);
//        Student st2=new Student("Raghav","Thakur","raghav@gmail.com");
//               repo.save(st2);
//        Student st3=new Student("Avneesh","yadav","avaneesh@gmail.com");
//        repo.save(st3);
    }
}
