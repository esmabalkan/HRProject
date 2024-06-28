package com.example.HR.repository;

import com.example.HR.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpoleyeeRepository extends JpaRepository<employee, Long > {
}
