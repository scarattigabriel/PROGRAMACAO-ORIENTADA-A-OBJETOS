
/*​Faça um programa em Java que funciona como a seguir. O programa sorteia um
número aleatório entre 1 e 100. O usuário tenta adivinhar o número sorteado. O
programa informa se o palpite é maior ou menor que o número sorteado. Este processo
é repetido até que o usuário acerte o número sorteado.​
Dica: Pesquise como utilizar a biblioteca java.util.Random. */
import java.util.Random;
import java.util.Scanner;

public class Exercico12 {
    public static void main(String[] args){
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int numeroSorteado = random.nextInt(100) + 1;
    int numeroUsuario;
    System.out.println("Tente adivinhar o número sorteado: ");
    numeroUsuario = sc.nextInt();
    while(numeroUsuario != numeroSorteado)
    {
        if(numeroSorteado < numeroUsuario)
        {
            System.out.println("Tente um número menor: ");
            numeroUsuario = sc.nextInt();
        }
        if(numeroSorteado > numeroUsuario)
        {
            System.out.println("Tente um número maior: ");
            numeroUsuario = sc.nextInt();
        }
    }
    System.out.println("Acertou!!");
    sc.close();
    }
}
