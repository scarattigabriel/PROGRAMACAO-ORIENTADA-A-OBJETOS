public class Exercicio11 {
    public static void main(String[] args) {
        int total_primos = 0;
        int i = 2; 
        int k = 0;
        int[] primos = new int[15];

        while (total_primos < 15) {
            int num_divisores = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num_divisores++;
                }
            }

            if (num_divisores == 2) {
                primos[k] = i;
                k++;
                total_primos++; 
            }
            i++;
        }
        System.out.println("Os primeiros 15 números primos são: \n");
       for(i = 0; i < primos.length; i++)
       {
            System.out.println(primos[i] + " ");
       }
    }
}