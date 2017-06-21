package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entity.Merchandise;
import service.IMerchandiseService;

public class MerchandiseAction extends ActionSupport{
	private IMerchandiseService merchandiseService;// ��Ʒ����ҵ����ӿ�
	private Merchandise merchandise;// ��Ϊ�����Ķ���
	private List<Merchandise> merchandises;// ��ѯ���
	private String finish_Url;// ���������ת�ĵ�ַ
	private String[] merchandiseId;// Ҫɾ����Ʒ��Id
	
	
	public IMerchandiseService getMerchandiseService() {
		return merchandiseService;
	}
	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}
	public Merchandise getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	public List<Merchandise> getMerchandises() {
		return merchandises;
	}
	public void setMerchandises(List<Merchandise> merchandises) {
		this.merchandises = merchandises;
	}
	public String getFinish_Url() {
		return finish_Url;
	}
	public void setFinish_Url(String finish_Url) {
		this.finish_Url = finish_Url;
	}
	public String[] getMerchandiseId() {
		return merchandiseId;
	}
	public void setMerchandiseId(String[] merchandiseId) {
		this.merchandiseId = merchandiseId;
	}
	
	/**
	 * ������Ʒ
	 * */
	public String saveMerchandise() {
		merchandiseService.saveMerchandise(merchandise);
		// ��ӳɹ�ҳ����ʾ�����ת��ҳ�棬��ʾMerchandise����������Ϣ
		finish_Url = "merchandiseAction!findMerchandise.action";
		merchandise = null;
		return "finish";
	}


}
