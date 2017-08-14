import java.util.Scanner;

public class SomaFatoriais{
	public static int fatorial(int x){
		//Função para calcular o fatorial.
		if(x <= 1){
			return 1;
		}
		else{
			return (x * fatorial(x - 1));
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num1, num2, resultado;
		
		num1 = in.nextInt();
		num2 = in.nextInt();
		resultado = fatorial(num1) + fatorial(num2);
		
		System.out.printf("Num1 = %d, Num2 = %d ", num1, num2);
		System.out.printf("Soma dos Fatoriais = %d",resultado);
		
		in.close();
	}
}