package dao;

import java.util.List;

import entity.Employee;

public interface IEmployeeDao {
		// 员工档案查询
		public List<Employee> findEmployee(Employee employee);
		//增加员工档案
		public void saveEmployee(Employee employee);
		// 更新员工档案
		public void updateEmployee(Employee employee);
		// 删除员工档案
		public void deleteEmployee(String[] employeeId);

}
