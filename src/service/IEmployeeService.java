package service;

import java.util.List;

import entity.Employee;

public interface IEmployeeService {

	// 员工档案查询
	public List<Employee> findEmployee(Employee employee);
	//增加员工档案
	public void saveEmployee(Employee employee);
}
