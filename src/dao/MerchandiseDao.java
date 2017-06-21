package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
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

	/**
	 * ������Ʒ����
	 * */
	@Override
	public void updateMerchandise(Merchandise merchandise) {
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		Integer mid = merchandise.getId();
		// ����id����Merchandise����
		Merchandise perstMerchandise = (Merchandise) hibernateTemplate.load(
				Merchandise.class, mid);
		perstMerchandise.setName(merchandise.getName());// ����
		perstMerchandise.setPrice(merchandise.getPrice());// �۸�
		// ����
		hibernateTemplate.update(perstMerchandise);
	}
	

}
