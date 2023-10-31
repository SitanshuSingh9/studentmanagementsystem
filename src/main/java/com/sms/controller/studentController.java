package com.sms.controller;

import com.sms.entity.Student;
import com.sms.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class studentController {
@Autowired
private studentService service;
       @GetMapping("students")
       public  String liststudent(Model model){
           model.addAttribute("student",service.getallStudent());
            return "students";
       }

       @GetMapping("/students/new")
       public  String creatstudentform(Model model){
           Student student= new Student();

           model.addAttribute("student",student);
            return  "creat_student";


       }
       @PostMapping("/students")
       public  String savestudent(@ModelAttribute("student")Student student){
          service.savestudent(student);

          return  "redirect:students";
       }
       @GetMapping("/students/edit/{id}")
       public  String editstudent(@PathVariable Long id ,Model model){
              model.addAttribute("student",service.getstudentbyid(id));
              return "edit_student";
       }
       @PostMapping("/students/{id}")
       public  String  updateStudent(@PathVariable Long id ,
                       @ModelAttribute("student")Student student,
                                       Model model){
           Student  exixtingStudent= service.getstudentbyid(id);
           exixtingStudent.setId(student.getId());
           exixtingStudent.setFirstName(student.getFirstName());
           exixtingStudent.setLastName(student.getLastName());
           exixtingStudent.setEmail(student.getEmail());

           service.updatestudent(exixtingStudent);
           return "redirect:/students";
       }
       @GetMapping("/students/{id}")
       public  String deleteStudent(@PathVariable Long id){
                service.deleteStudentbyid(id);
            return "redirect:/students";
       }

}
