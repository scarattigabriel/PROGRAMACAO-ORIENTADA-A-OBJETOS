/*
2) Dado o código da classe abaixo, implemente o método carregaDoTeclado(), que, quando for chamado, faz a
leitura do teclado de uma string e um inteiro cujos valores são colocados nos atributos do objeto executando o
método.
class Autor {​
​
String nome;​
​
int id;​
}
*/
package Lista01.EX_02;

public class Main {
    public static void main(String[] args) {
    Autor aut;
    aut = new Autor();
    aut.carregaDoTeclado();
    System.out.println("Nome: " + aut.nome + "\nId: " + aut.id);

    }
}
