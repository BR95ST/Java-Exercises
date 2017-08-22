import java.util.Random;
import java.util.Scanner;

public class DrawNumber{
	
	public static void main(String[] args){
		
		Random gerarNumero = new Random();
		Scanner in = new Scanner(System.in);
		
		int sorteado;
		int entrada, cont = 0;
		
		sorteado = gerarNumero.nextInt(101);
		
		do{
			System.out.println("Enter a number between 0 and 100.");
			entrada = in.nextInt();
			
			if(entrada == sorteado){
				System.out.println("Congratulations, you got it right!\n");
				cont++;
			}
			else{
				if(entrada > sorteado){
					System.out.println("Number typed is bigger than drawn.\n");
					cont++;
				}
				else{
					System.out.println("Number typed is smaller than drawn.\n");
					cont++;
				}
			}
		}while(entrada != sorteado);
		
		System.out.println("Attempts = "+ cont);
		
	}
}
