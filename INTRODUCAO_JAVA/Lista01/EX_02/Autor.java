/*2) Dado o código da classe abaixo, implemente o método carregaDoTeclado(), que, quando for chamado, faz a
leitura do teclado de uma string e um inteiro cujos valores são colocados nos atributos do objeto executando o
método.
class Autor {​
​
String nome;​
​
int id;​
}*/
package EX_ORIENTACAO_A_OBJETOS.EX_02;
import java.util.Scanner;
public class Autor {
    String nome;
    int id;   

    void carregaDoTeclado()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite o ID ");
        this.id = sc.nextInt();
    }
}
