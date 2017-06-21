package dao;

import java.util.List;

import entity.Merchandise;

public interface IMerchandiseDao {
		// ������Ʒ����
		public void saveMerchandise(Merchandise merchandise);
		//������Ʒ����
		public void updateMerchandise(Merchandise merchandise);
		// ��Ʒ������ѯ
		public List<Merchandise> findMerchandise(Merchandise merchandise);
		// ɾ����Ʒ����
		public void deleteMerchandise(String[] merchandiseId);

}
