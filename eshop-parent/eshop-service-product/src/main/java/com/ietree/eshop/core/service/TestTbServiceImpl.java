package com.ietree.eshop.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ietree.eshop.core.bean.TestTb;
import com.ietree.eshop.core.dao.TestTbDao;

@Service("testTbService")
public class TestTbServiceImpl implements TestTbService {

	@Autowired
	private TestTbDao testTbDao;

	@Override
	public List<TestTb> getAllBrands() {
		return testTbDao.getAllBands();
	}

}
