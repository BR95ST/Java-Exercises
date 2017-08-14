import java.util.Scanner;

public class DecimalToBinaryConverter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int numDecimal, choice; 
		String numBinary;
		
		System.out.println("[1] - Decimal");
		System.out.println("[2] - Binary");
		do{
			choice = in.nextInt();		
			switch(choice){
				case 1: 
					System.out.print("Decimal: ");
					numDecimal = in.nextInt();
					System.out.println("Binary: "+ Integer.toBinaryString(numDecimal));
					break;
				case 2:
					System.out.print("Binary: ");
					numBinary = in.next();
					System.out.println("Decimal: "+ Integer.parseInt(numBinary, 2));
					break;
				default:
					System.out.println("Error!");
				
					
			}
		}while(choice >= 1 && choice <= 2);
		
	}
}