package week3.day3;

public class Calculator {
	public void additionTwonumbers(int a,int b) {
		    int c= a+b;
		    System.out.println(c);	    
	}
		    
	public void SubractionTwoNumbers(int e,int f) {
		int g= e-f;
		System.out.println(g);
		
	}
	public void multipleTwoNumbers(double i, double j) {
		double k=i*j;
		System.out.println(k);
		
	}
	public void divideTwoNumber(float x, float y)  {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator calCi=new Calculator();
		calCi.additionTwonumbers(10,10);
		calCi.SubractionTwoNumbers(200,50);
		calCi.multipleTwoNumbers(37,45);
		calCi.divideTwoNumber(56.6f,11.1F);
	}
		
		
		
		
		
		
}
				
	

	


