package assignment1;

public abstract class test {

	public static void main(String[] args) {
		ArithmaticOper addition=(a,b)->a+b;
		ArithmaticOper multiplicaion=(a,b)->a*b;
		ArithmaticOper subtraction=(a,b)->a-b;
		ArithmaticOper divison=(a,b)->a/b;
		
		
		System.out.println("subtracton result: "+subtraction.operation(5, 6));
		System.out.println("multiplication result: "+multiplicaion.operation(5, 6));
		System.out.println("division result: "+divison.operation(5, 2));
		System.out.println("addition result: "+addition.operation(5, 6));
		
		

		

	}

}
