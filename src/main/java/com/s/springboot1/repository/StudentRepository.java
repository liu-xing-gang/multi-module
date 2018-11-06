package com.s.springboot1.repository;

import com.s.springboot1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // 根据年龄查询数据
    public List<Student> findByAge(Integer age);
}
