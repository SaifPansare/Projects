package com.example.ATDevExercise.controller;

import com.example.ATDevExercise.entity.Employee;
import com.example.ATDevExercise.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/{id}")
    Optional<Employee> getById(@PathVariable Long id){
        return this.empService.getEmpById(id);
    }

    @GetMapping
    List<Employee> getAll(){
        return this.empService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    HttpStatus addEmp(@RequestBody Employee employee){
        this.empService.addEmployee(employee);
        return HttpStatus.ACCEPTED;
    }

    @DeleteMapping("/{id}")
    HttpStatus deleteEmp(@PathVariable Long id){
        this.empService.deleteEmp(id);
        return HttpStatus.OK;
    }

}
