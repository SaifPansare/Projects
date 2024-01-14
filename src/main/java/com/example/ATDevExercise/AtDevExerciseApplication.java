package com.example.ATDevExercise;

import com.example.ATDevExercise.entity.Employee;
import com.example.ATDevExercise.repository.EmployeeRepository;
import com.example.ATDevExercise.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AtDevExerciseApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(AtDevExerciseApplication.class, args);

    }


}
