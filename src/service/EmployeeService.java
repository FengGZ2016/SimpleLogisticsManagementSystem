package service;

import java.util.List;

import dao.IEmployeeDao;
import entity.Employee;

public class EmployeeService implements IEmployeeService{

	private IEmployeeDao employeeDao;
	/**
	 * ��ѯԱ������
	 * */
	@Override
	public List<Employee> findEmployee(Employee employee) {
		return employeeDao.findEmployee(employee);
	}

	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	/**
	 * ����Ҫ�õ�setע��
	 * */
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
}