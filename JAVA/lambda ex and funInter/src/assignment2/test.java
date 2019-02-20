package assignment2;

public class test {

	public static void main(String[] args) {
		Order o1=(p,s)->{
			if(p>10000) {
				return s;
			}
			return null;
		
			};
			
		System.out.println(o1.checkStatus(1000, "Completed"));

	}

}
