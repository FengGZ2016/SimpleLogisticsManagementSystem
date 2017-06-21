package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Merchandise;

public class MerchandiseDao extends HibernateDaoSupport implements IMerchandiseDao{

	/**
	 * 增加商品档案
	 * */
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		this.getHibernateTemplate().save(merchandise);
	}

	/**
	 * 更新商品档案
	 * */
	@Override
	public void updateMerchandise(Merchandise merchandise) {
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		Integer mid = merchandise.getId();
		// 根据id加载Merchandise对象
		Merchandise perstMerchandise = (Merchandise) hibernateTemplate.load(
				Merchandise.class, mid);
		perstMerchandise.setName(merchandise.getName());// 名称
		perstMerchandise.setPrice(merchandise.getPrice());// 价格
		// 更新
		hibernateTemplate.update(perstMerchandise);
	}
	

}
