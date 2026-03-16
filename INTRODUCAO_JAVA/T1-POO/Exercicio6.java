/*6.​ Faça um programa em Java que leia um número inteiro e mostre o mesmo número
escrito de trás para frente. Você não pode converter o número lido para uma string e
imprimi-lo de maneira invertida diretamente. */
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int invertido = 0;
        int temp = Math.abs(numero); // retorna o módulo do número para numeros negativos

        while (temp != 0) {
            int digito = temp % 10;      // %10 pega o último dígito
            invertido = invertido * 10 + digito; // constrói o número invertido
            temp /= 10;                  // /10 remove o último dígito
        }

        if (numero < 0) invertido = -invertido;

        System.out.println("Número invertido: " + invertido);
        sc.close();
    }
}