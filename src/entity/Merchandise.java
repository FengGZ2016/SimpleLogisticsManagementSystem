package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 国富小哥
 * @Create by Administrator
 * @DateTime 2017年6月17日 上午10:25:05
 * 商品档案的实体类
 */
public class Merchandise {
	private Integer id;// 商品ID
	private String code;// 商品编号
	private String name;// 商品名称
	private float price;// 商品价格
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
