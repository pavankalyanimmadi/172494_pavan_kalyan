package junitTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import service.DateDifferenceProvider;
import service.support.MyDate;

public class DateDifferenceTest1 {
	public DateDifferenceProvider dd;
	@Before
	public void init() {
		dd=new DateDifferenceProvider();
	}

	
	@Test
	public void Considering_Feb_Month_but_non_leap_year() {
		MyDate startDate=new MyDate(06, 01, 2011);
		MyDate endDate=new MyDate(06, 03, 2011);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(59, actualResult);
		
		
	}
	
	@Test
	public void Considering_Feb_Month_but_Its_leap_year() {
		MyDate startDate=new MyDate(06, 01, 2012);
		MyDate endDate=new MyDate(06, 03, 2012);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(60, actualResult);
		
		
	}
	
	@Test
	public void getDateDifferenceTest14() {
		MyDate startDate=new MyDate(22, 01, 2012);
		MyDate endDate=new MyDate(15, 11, 2012);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(298, actualResult);
		
		
	}
	
	@Test
	public void getDateDifferenceTest15() {
		MyDate startDate=new MyDate(6, 2, 2012);
		MyDate endDate=new MyDate(6, 12, 2012);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(304, actualResult);
		
		
	}
}
