package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
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

	@Override
	public void updateEmployee(Employee employee) {
		HibernateTemplate template=this.getHibernateTemplate();
		Integer employeeId=employee.getId();
		//载入已经被持久化了的对象然后再进行修改
		Employee em=(Employee) template.load(Employee.class, Integer.valueOf(employeeId));
		em.setName(employee.getName());
		em.setEmail(employee.getEmail());
		em.setSex(employee.isSex());
		em.setBirthday(employee.getBirthday());
		em.setTelephone(employee.getTelephone());
		//更新
		template.update(em);
	}

}
