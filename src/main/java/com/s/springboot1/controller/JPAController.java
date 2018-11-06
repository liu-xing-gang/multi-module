package com.s.springboot1.controller;

import com.s.springboot1.model.Student;
import com.s.springboot1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JPAController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStuList(){
        return studentRepository.findAll();
    }

    @PostMapping("/students/add")
    public Student addStu(@RequestParam("name") String name, @RequestParam("age") Integer age){
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        return studentRepository.save(stu);
    }

    @GetMapping("/students/{id}")
    public Student getStu(@PathVariable("id") Integer id){
        // 2.0以前版本
        //return studentRepository.findOne(id);
        return studentRepository.findById(id).get();
    }

    // 更新数据库记录
    @PutMapping("/students/{id}")
    public Student updateStu(@PathVariable("id") Integer id,
                              @RequestParam("name") String name,
                              @RequestParam("age") Integer age){
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);

        return studentRepository.save(stu);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStu(@PathVariable("id") Integer id){
        studentRepository.deleteById(id);
    }

    // 根据年龄查询
    @GetMapping("/students/age/{age}")
    public List<Student> getStuList(@PathVariable("age") Integer age){
        return studentRepository.findByAge(age);
    }
}
