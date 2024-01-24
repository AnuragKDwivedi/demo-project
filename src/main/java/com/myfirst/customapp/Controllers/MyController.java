package com.myfirst.customapp.Controllers;

import com.myfirst.customapp.Entity.Employee;
import com.myfirst.customapp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    EmployeeService empService;

    @GetMapping("/firstApi")
    public String firstApi(){
        return "Hello World!";
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return new ResponseEntity(empService.getEmployeeById(id).get(), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/getAllEmployees")
    public ResponseEntity<Employee> getAllEmployees(){
        return new ResponseEntity(empService.getAllEmployees(), HttpStatusCode.valueOf(200));
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return empService.addEmployee(employee);
    }
}
