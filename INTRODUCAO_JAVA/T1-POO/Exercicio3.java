/*Faça um programa em Java que percorre um vetor de doubles e apresenta a média e
a mediana dos valores do vetor.​
Dica: Utilize a biblioteca java.util.Arrays e o método Arrays.sort.​
​ */
import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args)
    {
        double[] vetor = {1, 2, 9, 8, 14, 15 };
        Arrays.sort(vetor);
        
        double som_vetor = 0;
        for(int i = 0; i < vetor.length; i++)
        {
            som_vetor += vetor[i];
        }
        
        double mediana = 0;

        if (vetor.length % 2 != 0) 
        {
            mediana = vetor[vetor.length / 2];
        }
        else
        {
            mediana = ((vetor[(vetor.length / 2 )- 1]) + (vetor[(vetor.length / 2 )])) / 2;
        }



        System.out.println("Média: " + (som_vetor / vetor.length));
        System.out.println("Mediana: " + mediana);

    }
}
