package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entity.Employee;
import service.IEmployeeService;

public class EmployeeAction extends ActionSupport{

	private IEmployeeService employeeService;// 员工档案业务处理接口
	private Employee employee;// 作为条件的对象
	private List<Employee> employees;// 查询结果
	private String finish_Url;// 操作完成跳转的地址
	private String[] employeeId;// 要删除员工的Id
	
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
	 * 查询员工档案
	 * */
	public void findEmployee(){
		employeeService=(IEmployeeService) employeeService.findEmployee(employee);
	}
	
	/**
	 * 增加员工档案
	 * */
	public String saveEmployee(){
		employeeService.saveEmployee(employee);
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}
	
	/**
	 * 更新员工档案
	 * */
	public String updateEmployee(){
		employeeService.updataEmployee(employee);
		finish_Url = "employeeAction!findEmployee.action";
		employee = null;
		return "finish";
	}
	
	
}
