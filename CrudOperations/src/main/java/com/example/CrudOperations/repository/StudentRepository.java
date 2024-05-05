package com.example.CrudOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudOperations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}