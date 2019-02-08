package discount;

import java.util.Date;

public class test {

	public static void main(String[] args) {
		Customer c1=new Customer("pavan");
		c1.setMember(true);
		c1.setMemberType("Premium");
		
		Vistit v=new Vistit(c1,new Date());
		v.setProductExpence(1000);
		v.setServiceExpence(1000);
		
		System.out.println(v.totalExpense());
		
		
		
		

	}

}
