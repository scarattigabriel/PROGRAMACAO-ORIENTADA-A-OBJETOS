/*2.​ Faça um programa em Java que receba um número N e mostre o N primeiros números
da sequência de Fibonacci.​ */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int tam_seq, proximo, a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para a sequência Fibonacci: ");
        tam_seq = sc.nextInt();
        for(int i = 0; i <= tam_seq; i++)
        {   
            System.out.println(a + " ");
            proximo =  a + b;
            a = b;
            b = proximo;
            
        }
        sc.close();
    }
}
