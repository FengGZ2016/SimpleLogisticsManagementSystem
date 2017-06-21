package dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Merchandise;

public class MerchandiseDao extends HibernateDaoSupport implements IMerchandiseDao{

	/**
	 * ������Ʒ����
	 * */
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		this.getHibernateTemplate().save(merchandise);
	}
	

}
