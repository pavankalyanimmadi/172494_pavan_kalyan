
public class test {

	public static void main(String[] args) {
		Account a=new Account("111","pavan");
		a.credit(5000);
		System.out.println(a.getBalance());
		
		Account a1=new Account("222","venkatesh",2000);
		System.out.println(a1.getBalance());
		
		System.out.println("remaining balance "+a.transfer(a1,2000));
		System.out.println("final balance of venkatesh "+ a1.getBalance());
		
		System.out.println(a);
		
		
		

	}

}
