public class DecisaoRepeticao{
	public static void main(String[] args){
		double d1 = 18.0, d2=15.0;
		
		System.out.println("d1: " + d1 + "d2: " + d2);
		System.out.println();
		System.out.println("Testanto if e else");
		if(d1 < d2){
			System.out.println("d1 < d2" + (d1 < d2));
		}
		else{
			System.out.println("d1 => d2" + (d1 >= d2));
		}
		
		System.out.println();
		System.out.println("Testando laço for");
		for(int i=1; i < 10; i++){
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Testando repetição com while");
		int i = 10;
		while(i > 0){
			System.out.println(i);
			i--;	
		}
	}
}

