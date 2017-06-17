package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 国富小哥
 * @Create by Administrator
 * @DateTime 2017年6月17日 上午9:50:08 员工档案的实体类
 */
public class Employee {
	private Integer id;// 员工ID
	private String code;// 员工编号
	private String name;// 员工名称
	private String birthday;// 出生日期
	private boolean sex;// 性别(0-女，1-男)
	private String telephone;// 电话
	private String email;// 电子邮箱
	private Set stokins = new HashSet(0);
	private Set stockorders = new HashSet(0);
	
	
	public Employee() {
		
	}

	public Employee(String code, String name, String birthday, boolean sex, String telephone) {
		this.code = code;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.telephone = telephone;
	}

	public Employee(String code, String name, String birthday, boolean sex, String telephone, String email,
			Set stokins,Set stockorders) {
		this.code = code;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.telephone = telephone;
		this.email=email;
		this.stokins=stokins;
		this.stockorders=stockorders;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		if(null!=birthday&&birthday.length()>=10){
			birthday=birthday.substring(0,10);
		}
		this.birthday = birthday;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getStokins() {
		return stokins;
	}

	public void setStokins(Set stokins) {
		this.stokins = stokins;
	}

	public Set getStockorders() {
		return stockorders;
	}

	public void setStockorders(Set stockorders) {
		this.stockorders = stockorders;
	}
	
	

}
