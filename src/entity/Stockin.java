package entity;

/**
 * @author 国富小哥
 * @Create by Administrator
 * @DateTime 2017年6月17日 下午12:52:23 进货单的实体类
 */
public class Stockin {
	private Integer id;// 进货单ID
	private Merchandise merchandise;// 商号编号
	private Client client;// 客户编号
	private Employee employee;// 员工编号
	private String code;// 进货单编号
	private int amount;// 进货数量
	private float price;// 进货单价
	private float money;// 进货总额
	private String stockindate;// 进货日期

	public Stockin() {
	}

	public Stockin(Merchandise merchandise, Client client, Employee employee, String code, int amount, float price,
			float money,String stockindate) {
		this.merchandise=merchandise;
		this.client=client;
		this.employee=employee;
		this.code=code;
		this.amount=amount;
		this.price=price;
		this.amount=amount;
		this.price=price;
		this.money=money;
		this.stockindate=stockindate;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Merchandise getMerchandise() {
		return merchandise;
	}

	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getStockindate() {
		return stockindate;
	}

	public void setStockindate(String stockindate) {
		if(null!=stockindate&&stockindate.length()>=10){
			stockindate=stockindate.substring(0,10);
		}
		this.stockindate = stockindate;
	}
	
	
}
