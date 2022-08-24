
package com.samples.SpringJDBC.dao;

import java.util.List;

import com.samples.SpringJDBC.dto.Employee;

public interface EmployeeDAO {

	int create(Employee employee);
    int update(Employee employee);
	
	int delete(int id);
	List<Employee> read();
	Employee read(int id);
	
}