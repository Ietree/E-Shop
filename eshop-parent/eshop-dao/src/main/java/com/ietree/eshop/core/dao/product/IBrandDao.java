package com.ietree.eshop.core.dao.product;

import java.util.List;

import com.ietree.eshop.core.bean.product.Brand;
import com.ietree.eshop.core.bean.product.BrandQuery;

/**
 * 品牌查询DAO
 *
 * @author Root
 */
public interface IBrandDao {
	public List<Brand> selectBrandListByQuery(BrandQuery query);
}
