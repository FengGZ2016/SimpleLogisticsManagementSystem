package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
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

	/**
	 * ��ѯ��Ʒ����
	 * */
	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		//�����������
		DetachedCriteria criteria=DetachedCriteria.forClass(Merchandise.class);
		if(merchandise!=null){
			if(merchandise.getId()!=null&&String.valueOf(merchandise.getId()).trim().length()>0){
				criteria.add(Restrictions.eq("id", merchandise.getId()));
			}if(merchandise.getCode()!=null&&String.valueOf(merchandise.getCode()).trim().length()>0){
				criteria.add(Restrictions.eq("code", merchandise.getCode()));
			}if(merchandise.getName()!=null&&String.valueOf(merchandise.getName()).trim().length()>0){
				criteria.add(Restrictions.like("name", merchandise.getName()),MatchMode.ANYWHERE);
			}
		}
		return this.getHibernateTemplate().findByCriteria(criteria);
	}

	/**
	 * ɾ����Ʒ
	 * */
	@Override
	public void deleteMerchandise(String[] merchandiseId) {
		List<Merchandise> entities = new ArrayList<Merchandise>();
		HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		for (String mid : merchandiseId) {
			Merchandise merchandise=(Merchandise) hibernateTemplate.load(Merchandise.class, Integer.valueOf(mid));
			entities.add(merchandise);
		}
		// ����ɾ��
		hibernateTemplate.deleteAll(entities);
		
	}
	

}
