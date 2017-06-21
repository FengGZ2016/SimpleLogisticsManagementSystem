package service;

import entity.Merchandise;

public class MerchandiseService implements IMerchandiseService{

	private IMerchandiseService merchandiseService;
	
	//�ṩһ��setע��ķ���
	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}
	
	/**
	 * ������Ʒ
	 * */
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		merchandiseService.saveMerchandise(merchandise);
	}

}
