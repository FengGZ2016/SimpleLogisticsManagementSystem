package dao;

import entity.Merchandise;

public interface IMerchandiseDao {
		// 新增商品档案
		public void saveMerchandise(Merchandise merchandise);
		//更新商品档案
		public void updateMerchandise(Merchandise merchandise);

}
