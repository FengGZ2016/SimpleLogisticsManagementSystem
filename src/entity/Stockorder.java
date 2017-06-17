package entity;

/**
 * @author ����С��
 * @Create by Administrator
 * @DateTime 2017��6��17�� ����10:37:23 ��������ʵ����
 */
public class Stockorder {
	private Integer id;// ������ID
	private Merchandise merchandise;// �̺ű��
	private Client client;// �ͻ����
	private Employee employee;// Ա�����
	private String code;// ���������
	private int merchandisenumber;// ��������
	private String orderdate;// ��������

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
			//�ӵ�0λ��ʼ��ȡ������10λ����
			orderdate=orderdate.substring(0,10);
		}
		this.orderdate = orderdate;
	}
	
	
	
}
