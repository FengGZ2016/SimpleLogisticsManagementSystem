package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ����С��
 * @Create by Administrator
 * @DateTime 2017��6��17�� ����9:50:08 Ա��������ʵ����
 */
public class Employee {
	private Integer id;// Ա��ID
	private String code;// Ա�����
	private String name;// Ա������
	private String birthday;// ��������
	private boolean sex;// �Ա�(0-Ů��1-��)
	private String telephone;// �绰
	private String email;// ��������
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
