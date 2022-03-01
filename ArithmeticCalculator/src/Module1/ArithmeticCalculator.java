package Module1;
import java.util.Scanner;


public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose a number 1 for addition 2 for subtraction 3 for mul and 4 for div");
		int choose=sc.nextInt();
		
		if(choose==1) {
			System.out.println("Enter a number");
			double a=sc.nextDouble();
			System.out.println("Enter another number");
			double b=sc.nextDouble();
			System.out.println("Answer is "+add(a,b));
		}
		else if(choose==2) {
			System.out.println("Enter a number");
			double a=sc.nextDouble();
			System.out.println("Enter another number");
			double b=sc.nextDouble();
			System.out.println("Answer is "+sub(a,b));
		}
		else if(choose==3) {
			System.out.println("Enter a number");
			double a=sc.nextDouble();
			System.out.println("Enter another number");
			double b=sc.nextDouble();
			System.out.println("Answer is "+mul(a,b));
		}
		else if(choose==4) {
			System.out.println("Enter a number");
			double a=sc.nextDouble();
			System.out.println("Enter another number");
			double b=sc.nextDouble();
			System.out.println("Answer is "+div(a,b));
		}else {
			System.out.println("choose 1 or 2 or 3 or 4");
		}
		
		
	}
	public static double add(double a, double b) {
		double n;
		n=a+b;
		return n;
		
	}
    public static double sub(double a, double b) {
    	double n;
    	n=a-b;
    	return n;
		
	}
    public static double mul(double a,double b) {
    	double n;
    	n=a*b;
    	return n;
		
	}
    public static double div(double a, double b) {
    	double n;
    	n=a/b;
    	return n;
		
		
	}
}	
		
				