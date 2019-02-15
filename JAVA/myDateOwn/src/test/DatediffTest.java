package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import service.support.MyDate;
import service1.DateDifference;



public class DatediffTest {
	public DateDifference service;
	@Before
	public void init() {
		service=new DateDifference();
	}

	@Test
	public void test1() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(06, 04, 2011);
		assertEquals(0, service.daysDifference(startDate,endDate));

	}

	@Test
	public void test2() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 04, 2011);
		assertEquals(12, service.daysDifference(startDate,endDate));

	}

	@Test
	public void test3() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 05, 2011);
		assertEquals(42, service.daysDifference(startDate,endDate));

	}

	@Test
	public void test4() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 06, 2011);
		assertEquals(73, service.daysDifference(startDate,endDate));

	}

	@Test
	public void test5() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2011);
		assertEquals(256,service.daysDifference(startDate,endDate));

	}

	@Test
	public void test6() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2012);
		assertEquals(622, service.daysDifference(startDate,endDate));

	}

	@Test
	public void test7() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2013);
		assertEquals(987, service.daysDifference(startDate,endDate));

	}

}
