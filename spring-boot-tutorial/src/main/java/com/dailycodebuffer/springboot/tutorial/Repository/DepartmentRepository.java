package com.dailycodebuffer.springboot.tutorial.Repository;


import com.dailycodebuffer.springboot.tutorial.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
