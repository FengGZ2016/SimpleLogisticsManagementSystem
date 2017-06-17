package entity;

/**
 * @author 国富小哥
 * @Create by Administrator
 * @DateTime 2017年6月17日 上午10:37:23 订货单的实体类
 */
public class Stockorder {
	private Integer id;// 订货单ID
	private Merchandise merchandise;// 商号编号
	private Client client;// 客户编号
	private Employee employee;// 员工编号
	private String code;// 订货单编号
	private int merchandisenumber;// 订货数量
	private String orderdate;// 订货日期

	public Stockorder() {
	}

	public Stockorder(Merchandise merchandise, Client client, Employee employee, String code, int merchandisenumber,
			String orderdate) {
		this.merchandise = merchandise;
		this.client = client;
		this.employee = employee;
		this.code = code;
		this.merchandisenumber = merchandisenumber;
		this.orderdate=orderdate;
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

	public int getMerchandisenumber() {
		return merchandisenumber;
	}

	public void setMerchandisenumber(int merchandisenumber) {
		this.merchandisenumber = merchandisenumber;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		if(null!=orderdate&&orderdate.length()>=10){
			//从第0位开始截取，到第10位结束
			orderdate=orderdate.substring(0,10);
		}
		this.orderdate = orderdate;
	}
	
	
	
}
