package com.myfirst.customapp.Services;

import com.myfirst.customapp.Entity.Employee;
import com.myfirst.customapp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public String addEmployee(Employee employee){
        if(employee != null) {
            employeeRepository.save(employee);
            return "Employee details saved successfully!";
        }else return "Employee data not saved.";
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
