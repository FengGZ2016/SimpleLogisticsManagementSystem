package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entity.Employee;


/**
 * @author 国富小哥
 * @Create by Administrator
 * @DateTime 2017年6月17日 下午11:28:18
 * 
 * 继承HibernateDaoSupport
 */
public class EmployeeDao extends HibernateDaoSupport implements IEmployeeDao{

	/**
	 * 查询员工档案
	 * */
	@Override
	public List<Employee> findEmployee(Employee employee) {
						// 对象查找条件
				DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
				if (employee != null) {
					if (employee.getId() != null
							&& String.valueOf(employee.getId()).trim().length() > 0) {
						criteria.add(Restrictions.eq("id", employee.getId()));
					}
					if (employee.getCode() != null
							&& String.valueOf(employee.getCode()).trim().length() > 0) {
						criteria.add(Restrictions.eq("code", employee.getCode()));
					}
					if (employee.getName() != null
							&& String.valueOf(employee.getName()).trim().length() > 0) {
						criteria.add(Restrictions.like("name", employee.getName(),
								MatchMode.ANYWHERE));
					}
				}
				return this.getHibernateTemplate().findByCriteria(criteria);
				
			
	}

	/**
	 * 增加员工档案
	 * */
	@Override
	public void saveEmployee(Employee employee) {
		this.getHibernateTemplate().save(employee);
	}

}
