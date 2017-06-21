package service;

import java.util.List;

import entity.Merchandise;

public interface IMerchandiseService {
				// 新增商品档案
			public void saveMerchandise(Merchandise merchandise);
			//更新商品档案
			public void updateMerchandise(Merchandise merchandise);
			// 商品档案查询
			public List<Merchandise> findMerchandise(Merchandise merchandise);
			
}
