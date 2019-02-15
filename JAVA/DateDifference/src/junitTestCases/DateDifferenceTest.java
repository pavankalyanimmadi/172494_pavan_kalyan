package junitTestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import service.DateDifferenceProvider;
import service.support.MyDate;

public class DateDifferenceTest {
	public DateDifferenceProvider dd;
	@Before
	public void init() {
		dd=new DateDifferenceProvider();
	}
	
	@Test
	public void Same_Date_Month_Year() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(06,04,2011);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(0, actualResult);
		
		
	}
	
	@Test
	public void Different_Date_but_Same_Month_Year() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18,04,2011);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(12, actualResult);
		
		
		
	}
	
	@Test
	public void Different_Date_Month_but_Same_Year() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18,05,2011);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(42, actualResult);
		
		
		
	}
	
	@Test
	public void Interving_Month_But_Same_Year(){
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18, 06, 2011);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(73, actualResult);
		
		
		
	}
	
	@Test
	public void More_than_Six_Month_Difference_But_Same_Year(){
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18, 12, 2011);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(256, actualResult);
		
		
		
	}
	
	@Test
	public void getDateDifferenceTest6() {
		MyDate startDate=new MyDate(06,02,2012);
		MyDate endDate=new MyDate(06,03,2012);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(29, actualResult);
		
		
		
	}
	
	@Test
	public void Year_Differnce() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18, 12, 2012);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(622, actualResult);
		
		
		
	}
	
	@Test
	public void Interving_Year() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18, 12, 2013);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(987, actualResult);
		
		
		
	}
	
	@Test
	public void Interving_century() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18, 12, 2113);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(37511, actualResult);
		
		
		
	}
	
	@Test
	public void Interving_400_century() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18, 12, 2413);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals( 147084, actualResult);
		
		
		
	}
	
	@Test
	public void Interving_800_century() {
		MyDate startDate=new MyDate(06,04,2011);
		MyDate endDate=new MyDate(18, 12, 2813);
		long actualResult=dd.getDateDifference(startDate, endDate);
		assertEquals(293181, actualResult);
		
		
	}
	
	
	
	

}
