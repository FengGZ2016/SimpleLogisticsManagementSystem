package dao;

import java.util.List;

import entity.Employee;

public interface IEmployeeDao {
		// Ա��������ѯ
		public List<Employee> findEmployee(Employee employee);
		//����Ա������
		public void saveEmployee(Employee employee);
		// ����Ա������
		public void updateEmployee(Employee employee);

}
