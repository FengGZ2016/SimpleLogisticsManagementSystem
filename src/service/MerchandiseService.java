package service;

import java.util.List;

import entity.Merchandise;

public class MerchandiseService implements IMerchandiseService{

	private IMerchandiseService merchandiseService;
	
	//提供一个set注入的方法
	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}
	
	/**
	 * 增加商品
	 * */
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		merchandiseService.saveMerchandise(merchandise);
	}

	/**
	 * 更新商品
	 * */
	@Override
	public void updateMerchandise(Merchandise merchandise) {
		merchandiseService.updateMerchandise(merchandise);
	}

	/**
	 * 查询商品
	 * */
	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		return merchandiseService.findMerchandise(merchandise);
	}

}
