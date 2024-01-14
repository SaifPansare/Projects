package com.example.ATDevExercise.repository;

import com.example.ATDevExercise.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
