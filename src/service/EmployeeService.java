package service;

import java.util.List;

import dao.IEmployeeDao;
import entity.Employee;

public class EmployeeService implements IEmployeeService{

	private IEmployeeDao employeeDao;
	/**
	 * 查询员工档案
	 * */
	@Override
	public List<Employee> findEmployee(Employee employee) {
		return employeeDao.findEmployee(employee);
	}

	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	/**
	 * 这里要用到set注入
	 * */
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	/**
	 * 增加员工
	 * */
	@Override
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	/**
	 * 更新员工数据
	 * */
	@Override
	public void updataEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}
}
