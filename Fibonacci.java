import javax.swing.JOptionPane;

public class Fibonacci{
	public static void main(String[] args){
		int a = 1, b = 1, c, limit = Integer.parseInt(JOptionPane.showInputDialog("Limit of the Fibonacci sequence."));
		
		for(int i = 0; i < limit; i++){
			System.out.println(a);
			c = a;
			a = b;
			b += c;
		}
	}
}