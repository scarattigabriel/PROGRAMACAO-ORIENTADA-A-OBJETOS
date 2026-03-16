/*1) Dado o código da classe abaixo, faça um programa que instancie um objeto Autor e leia do teclado os dados
necessários para preencher todos os atributos do objeto instanciado.
class Autor {
String nome;
int id;
} */
package EX_ORIENTACAO_A_OBJETOS.EX_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Autor aut;
        aut = new Autor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");    
        aut.nome = sc.nextLine();
        System.out.println("Digite o id: ");    
        aut.id = sc.nextInt();
        System.out.println("Nome: " + aut.nome + "\nId: " + aut.id);

        sc.close();
    }
    
}
