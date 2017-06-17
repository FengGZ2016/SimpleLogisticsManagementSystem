package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ����С��
 * @Create by Administrator
 * @DateTime 2017��6��17�� ����10:25:05
 * ��Ʒ������ʵ����
 */
public class Merchandise {
	private Integer id;// ��ƷID
	private String code;// ��Ʒ���
	private String name;// ��Ʒ����
	private float price;// ��Ʒ�۸�
	private Set stokins = new HashSet(0);
	private Set stockorders = new HashSet(0);
	
	public Merchandise() {
		
	}
	
	public Merchandise(String code,String name,float price) {
		this.code=code;
		this.name=name;
		this.price=price;
	}
	
	public Merchandise(String code,String name,float price,Set stokins,Set stockorders) {
		this.code=code;
		this.name=name;
		this.price=price;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
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
