package service1;

import service.support.MyDate;

public class DateDifference {
	private static int[] month_days1={31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int daysDifference(MyDate startDate,MyDate endDate) {
		int noOfDays=0;
	    do {
	    	if(startDate.getMm()==endDate.getMm() && startDate.getYy()==endDate.getYy()) {
	    		noOfDays+=endDate.getDd()-startDate.getDd();
	    		break;
	    		
	    	}
	    	else {
	    		if(startDate.getMm()==2) {
	    			if((startDate.getYy()%400==0)||(startDate.getYy()%4==0 && startDate.getYy()%100!=0))
	    				noOfDays++;
	    		}
	    		
	    		noOfDays+=month_days1[startDate.getMm()-1]-startDate.getDd();
	    	}
	    	
	    	startDate.setDd(0);
	    	startDate.setMm(startDate.getMm()+1);
	    	if(startDate.getMm()>12) {
	    		startDate.setYy(startDate.getYy()+1);
	    		startDate.setMm(1);
	    	}
	    }while(true);
		return noOfDays;
		
		
	}

}
