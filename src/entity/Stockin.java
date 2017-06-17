package entity;

/**
 * @author ����С��
 * @Create by Administrator
 * @DateTime 2017��6��17�� ����12:52:23 ��������ʵ����
 */
public class Stockin {
	private Integer id;// ������ID
	private Merchandise merchandise;// �̺ű��
	private Client client;// �ͻ����
	private Employee employee;// Ա�����
	private String code;// ���������
	private int amount;// ��������
	private float price;// ��������
	private float money;// �����ܶ�
	private String stockindate;// ��������

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
