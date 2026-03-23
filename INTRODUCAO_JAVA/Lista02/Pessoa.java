/*Pessoa (com nome, data de
nascimento e até quatro contatos), incluindo métodos para cadastrar e listar contatos.  */
package Lista02;

import java.util.Scanner;

class Pessoa {
    String nome;
    Data data_nasc;
    Contato[] contatos = new Contato[4];
    int numContatos = 0;

    void cadastraContato(Scanner sc) {
        if (numContatos >= 4) {
            System.out.println("Lista de contatos cheia!");
            return;
        }
        Contato c = new Contato();
        c.criaContato(sc);
        contatos[numContatos] = c; 
        numContatos++;
    }

    void criaPessoa(Scanner sc) {
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        
        data_nasc = new Data();
        data_nasc.criaData(sc);
        
        boolean continuar;
        do {
            System.out.println("Adicionando contato");
            cadastraContato(sc);
            if (numContatos < 4) {
                System.out.println("Deseja cadastrar mais contatos? Y/N");
                continuar = sc.nextLine().equalsIgnoreCase("Y");
            } else {
                continuar = false;
            }
        } while (continuar);
    }   

    void listarContatos() {
        for (int i = 0; i < numContatos; i++) {
            contatos[i].imprimeContato();
        }
    }

    void listarPessoas() {
        System.out.println("Nome: " + nome);
        System.out.print("Data de nascimento: ");
        data_nasc.imprimeData();
        System.out.println("Contatos: ");
        listarContatos();
    }
}