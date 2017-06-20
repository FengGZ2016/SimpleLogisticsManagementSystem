package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entity.Employee;
import service.IEmployeeService;

public class EmployeeAction extends ActionSupport{

	private IEmployeeService employeeService;// Ա������ҵ����ӿ�
	private Employee employee;// ��Ϊ�����Ķ���
	private List<Employee> employees;// ��ѯ���
	private String finish_Url;// ���������ת�ĵ�ַ
	private String[] employeeId;// Ҫɾ��Ա����Id
	
	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getFinish_Url() {
		return finish_Url;
	}

	public void setFinish_Url(String finish_Url) {
		this.finish_Url = finish_Url;
	}

	public String[] getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String[] employeeId) {
		this.employeeId = employeeId;
	}
	
	/**
	 * ��ѯԱ������
	 * */
	public void findEmployee(){
		employeeService=(IEmployeeService) employeeService.findEmployee(employee);
	}
	
	/**
	 * ����Ա������
	 * */
	public String saveEmployee(){
		employeeService.saveEmployee(employee);
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}
	
	/**
	 * ����Ա������
	 * */
	public String updateEmployee(){
		employeeService.updataEmployee(employee);
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}
	
	
}
