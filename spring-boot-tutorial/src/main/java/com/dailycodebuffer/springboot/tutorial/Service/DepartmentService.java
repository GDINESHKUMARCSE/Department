package com.dailycodebuffer.springboot.tutorial.Service;

import com.dailycodebuffer.springboot.tutorial.Entity.Department;

import java.util.List;



public interface DepartmentService {


   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();


   public Department fetchDepartmentById(Long departmentId);


}
