import java.util.Scanner;

public class Bhaskara{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.println("Enter the values for A, B, and C");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		delta = delta(a, b, c);
		
		System.out.println("Delta = "+ delta);
		System.out.println("x1 = "+ raizX1(delta, a, b));
		System.out.println("x2 = "+ raizX2(delta, a, b));		
	}
	
	public static double delta(double a, double b, double c){
		double delta = Math.pow(b,2) - 4 * a * c;
		return delta;
	}
	
	public static double raizX1(double d, double a, double b){
		double x1 = (-b + Math.sqrt(d))/(2 * a);
		return x1;
	}
	
	public static double raizX2(double d, double a, double b){
		double x2 = (-b - Math.sqrt(d))/(2 * a);
		return x2;
	}	
}