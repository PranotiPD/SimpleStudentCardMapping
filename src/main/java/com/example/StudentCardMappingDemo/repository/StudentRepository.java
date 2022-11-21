package com.example.StudentCardMappingDemo.repository;

import com.example.StudentCardMappingDemo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
