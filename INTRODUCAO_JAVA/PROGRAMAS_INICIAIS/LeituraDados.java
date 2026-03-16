import java.util.Scanner;

public class LeituraDados{
	public static void main(String[] args){
		//Entrada
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int al = sc.nextInt();
		
		System.out.println("al: " + al);
		
		sc.close();
	}
}
