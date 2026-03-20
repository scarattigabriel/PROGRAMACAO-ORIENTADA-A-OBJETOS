/*2) Dado o código da classe abaixo, implemente o método carregaDoTeclado(), que, quando for chamado, faz a
leitura do teclado de uma string e um inteiro cujos valores são colocados nos atributos do objeto executando o
método.
class Autor {​
​
String nome;​
​
int id;​
}*/
package Lista01.EX_02;
import java.util.Scanner;
public class Autor {
    String nome;
    int id;
    Scanner sc = new Scanner(System.in);

    void carregaDoTeclado()
    {

        System.out.println("Digite seu nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite o ID ");
        this.id = sc.nextInt();
        return;
    }
}
