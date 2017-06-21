package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entity.Merchandise;
import service.IMerchandiseService;

public class MerchandiseAction extends ActionSupport {
	private IMerchandiseService merchandiseService;// 商品档案业务处理接口
	private Merchandise merchandise;// 作为条件的对象
	private List<Merchandise> merchandises;// 查询结果
	private String finish_Url;// 操作完成跳转的地址
	private String[] merchandiseId;// 要删除商品的Id

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
	 * 增加商品
	 */
	public String saveMerchandise() {
		merchandiseService.saveMerchandise(merchandise);
		// 添加成功页面显示完后跳转的页面，显示Merchandise表中所有信息
		finish_Url = "merchandiseAction!findMerchandise.action";
		merchandise = null;
		return "finish";
	}

	/**
	 * 更新商品
	 */
	public String updateMerchandise() {
		merchandiseService.updateMerchandise(merchandise);
		// 添加成功页面显示完后跳转的页面，显示Merchandise表中所有信息
		finish_Url = "merchandiseAction!findMerchandise.action";
		merchandise = null;
		return "finish";
	}

	/**
	 * 查询商品
	 */
	public String findMerchandise() {
		merchandises = merchandiseService.findMerchandise(merchandise);
		return "findMerchandise";
	}

	/**
	 * 删除商品
	 */
	public String deleteMerchandise() {
		merchandiseService.deleteMerchandise(merchandiseId);
		// 删除成功页面显示完后跳转的页面，显示Merchandise表中所有信息
		finish_Url = "merchandiseAction!findMerchandise.action";
		return "finish";
	}
	
	/**
	 * 商品档案更新前查询
	 */
	public String preUpdateMerchandise() {
		merchandise = merchandiseService.findMerchandise(merchandise).get(0);
		return "updateMerchandise";
	}

	
	/**
	 * 根据编号查询商品档案
	 */
	public int findMerchandiseByCode(String code) {
		merchandise = new Merchandise();
		merchandise.setCode(code);
		merchandises = merchandiseService.findMerchandise(merchandise);
		return merchandises.size();
	}
}
