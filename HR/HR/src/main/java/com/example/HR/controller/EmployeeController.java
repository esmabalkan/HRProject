package com.example.HR.controller;

import com.example.HR.model.employee;
import com.example.HR.service.employeeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired

    private employeeService employeeServices;

    @PostMapping("/hire")
    @Operation(summary = "Yeni personal kaydı yapar. ")
    public employee hireEmployee(@RequestBody employee employee) {
        return employeeServices.hireEmployee(employee);
    }

    @GetMapping
    @Operation(summary = "Tüm personelleri getirip listeler.")
    public List<employee> getAllEmployees(){
        return employeeServices.getAllEmployees();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Belirli bir personalin ID numarasına göre getirir.")
    public Optional<employee> getEmployeeById(@PathVariable Long id){
        return employeeServices.getEmployeeById(id);
    }

    @PutMapping("/{id}") /* belirtilen kimlikteki çaalışan bilgileri bu metot ile update ile güncelliyoruz */
    @Operation(summary = "Bir personalin bilgilerini günceller")
    public employee updateEmployee(@PathVariable long id, @RequestBody employee employeeDetails) {
        return employeeServices.updateEmployee(id,employeeDetails);
    }

    @DeleteMapping("/fire/{id}")
    @Operation(summary = "Bir personali siler.")
    public void fireEmployees(@PathVariable Long id){
        employeeServices.fireEmployees(id);
    }




}
