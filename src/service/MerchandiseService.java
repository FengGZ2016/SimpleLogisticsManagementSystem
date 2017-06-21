package service;

import java.util.List;

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

	/**
	 * ������Ʒ
	 * */
	@Override
	public void updateMerchandise(Merchandise merchandise) {
		merchandiseService.updateMerchandise(merchandise);
	}

	/**
	 * ��ѯ��Ʒ
	 * */
	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		return merchandiseService.findMerchandise(merchandise);
	}

}
