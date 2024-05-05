package com.example.CrudOperations.service;

import com.example.CrudOperations.entity.Student;
import com.example.CrudOperations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
	}

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Long id, Student updatedStudent) {
		if (!studentRepository.existsById(id)) {
			return null;
		}
		updatedStudent.setId(id);
		return studentRepository.save(updatedStudent);
	}

	public boolean deleteStudent(Long id) {
		if (!studentRepository.existsById(id)) {
			return false;
		}
		studentRepository.deleteById(id);
		return true;
	}
}