/*10.​Faça um programa em Java que leia um valor inteiro e calcule o menor número de
notas necessárias para representar esse valor usando notas de 100, 50, 20, 10, 5, 2 e
1. */
import java.util.Scanner;
public class Exercicio10 {
  public static void main(String[] args)
  {
    int num, num2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor a ser pago: ");
    num = sc.nextInt();
    int[] notas = {100, 50, 20, 10, 5, 2, 1};
    int[] num_notas;
    num_notas = new int[7];
    for(int i = 0; i < num_notas.length; i++)
    {
        num_notas[i]=0;
    }
    num2 = num;
    while(num != 0)
    {
        for(int i = 0; i < notas.length; i++)
        {
            if (notas[i] <= num)
            {
                num_notas[i]++;
                num = num - notas[i];
                break;
            }
        }
    }

    System.out.println("O menor número de notas para representar o valor: " + num2 + "\n");
    System.out.println(num_notas[0] + " - Nota(s) de 100\n");
    System.out.println(num_notas[1] + " - Nota(s) de 50\n");
    System.out.println(num_notas[2] + " - Nota(s) de 20\n");
    System.out.println(num_notas[3] + " - Nota(s) de 10\n");
    System.out.println(num_notas[4] + " - Nota(s) de 5\n");
    System.out.println(num_notas[5] + " - Nota(s) de 2\n");
    System.out.println(num_notas[6]+ " - Nota(s) de 1\n");

    sc.close();
  }  
}