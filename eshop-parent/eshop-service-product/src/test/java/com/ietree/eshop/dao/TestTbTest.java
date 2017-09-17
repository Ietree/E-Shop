package com.ietree.eshop.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ietree.eshop.core.bean.TestTb;
import com.ietree.eshop.core.dao.TestTbDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class TestTbTest {

	@Autowired
	private TestTbDao testTbDao;

	@Test
	public void testGetAllBrands() {
		List<TestTb> allBands = testTbDao.getAllBands();
		for (TestTb brand : allBands) {
			System.out.println(brand.toString());
		}
	}

}
