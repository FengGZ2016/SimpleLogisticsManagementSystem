package dao;

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
	

}
