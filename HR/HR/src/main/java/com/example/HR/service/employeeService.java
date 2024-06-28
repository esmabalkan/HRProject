package com.example.HR.service;

import com.example.HR.model.employee;
import com.example.HR.repository.EmpoleyeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class employeeService {

    @Autowired
    private EmpoleyeeRepository empoleyeeRepository;

    public employee hireEmployee(employee employee){
        return empoleyeeRepository.save(employee);
    }

    public List<employee> getAllEmployees(){
        return empoleyeeRepository.findAll();
    }

    public Optional<employee> getEmployeeById(Long id){
        return empoleyeeRepository.findById(id);
    }

    public employee updateEmployee (Long id, employee employeeDetails){
        // belirtilen id deki çalısanı güncelleyen metod
        employee employee = empoleyeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Çalışan bulunamadı"));
        // orElse yani if döngüsünün else kısmı gibi çalışır. Aradığımız çalışan bulunamadığı zamanlarda buyanıtı kullanıcıya döndürür.

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setPosition(employeeDetails.getPosition());

        return empoleyeeRepository.save(employee);



    }

    public void fireEmployees(Long id) {
    }
}
