import java.util.Scanner;

public class Bhaskara{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Enter the values for A, B, and C");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
				
		System.out.println("Delta = "+ delta(a, b, c));
		System.out.println("x1 = "+ raizX1(a, b, c));
		System.out.println("x2 = "+ raizX2(a, b, c));		
	}
	
	public static double delta(double a, double b, double c){
		return Math.pow(b,2) - 4 * a * c;
	}
	
	public static double raizX1(double a, double b, double c){
		return (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);
	}
	
	public static double raizX2(double a, double b, double c){
		return (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);
	}	
}