package com.example.ATDevExercise.service;

import com.example.ATDevExercise.entity.Employee;
import com.example.ATDevExercise.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        this.employeeRepository.save(employee);
    }

    public void deleteEmp(Long id){
        this.employeeRepository.deleteById(id);
    }


    public Optional<Employee> getEmpById(Long id){
        return this.employeeRepository.findById(id);
    }

    public List<Employee> getAll(){
        return this.employeeRepository.findAll();
    }
}
