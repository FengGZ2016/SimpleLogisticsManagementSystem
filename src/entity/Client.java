package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Client implements Serializable{
	private Integer id;// �ͻ�ID
	private String code;// �ͻ����
	private String name;// �ͻ�����
	private String address;// ��ַ
	private String telephone;// �绰
	private String email;// ��������
	private Set stockins=new HashSet(0);
	private Set stockorders=new HashSet(0);
	
	public Client(){
		
	}
	public Client(String code,String name,String address,String telephone){
		this.code=code;
		this.name=name;
		this.address=address;
		this.telephone=telephone;
	}
	public Client(String code,String name,String address,String telephone,String email,Set stockins,Set stockorders){
		this.code=code;
		this.name=name;
		this.address=address;
		this.telephone=telephone;
		this.email=email;
		this.stockins=stockins;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public Set getStockins() {
		return stockins;
	}
	public void setStockins(Set stockins) {
		this.stockins = stockins;
	}
	public Set getStockorders() {
		return stockorders;
	}
	public void setStockorders(Set stockorders) {
		this.stockorders = stockorders;
	}
	
	
	

}
