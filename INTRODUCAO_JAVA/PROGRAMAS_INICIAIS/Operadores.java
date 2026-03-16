public class Operadores {
	public static void main(String[] args){
		double d1 = 9.0;
		double d2 = 17.0;
		
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		System.out.println();
		
		//Operadores aritméticos
		// + - * / %
		System.out.println("Adição: " + (d1 + d2));
		System.out.println("Subtração: " + (d1 - d2));
		System.out.println("Multiplicação: " + (d1 * d2));
		System.out.println("Divisão: " + (d1 / d2));
		System.out.println("Resto da divisão: " + (d1 % d2));

		System.out.println();
		
		//Operadores Relacionais
		//<> <= => == !=
		System.out.println("d1 == d2: " + (d1 == d2));
		System.out.println("d1 != d2: " + (d1 != d2));
		System.out.println("d1 > d2: " + (d1 > d2));
		System.out.println("d1 <= d2: " + (d1 <= d2));
		 
	}
}

