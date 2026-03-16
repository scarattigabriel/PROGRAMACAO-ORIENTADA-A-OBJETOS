/*8.​ Faça um programa em Java que leia uma string e diga se esta é um palíndromo.​ */
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args)
    {
        String palavra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra para descobrir se é um palíndromo: ");
        palavra = sc.nextLine();
        int j = palavra.length() - 1;
        int palindromo = 1;
        for(int i = 0; i < palavra.length(); i++ )
        {
            if(palavra.charAt(i) != palavra.charAt(j))
            {
                palindromo = 0;
                break;
            }
            else
            {
                j--;
            }
        }

        switch (palindromo) {
            case 0:
                System.out.println("A palavra " + palavra + " não é um palíndromo");
                break;
            case 1:
                System.out.println("A palavra " + palavra + " é um palíndromo");
                break;
            default:
                break;
        }
        sc.close();
    }
}

