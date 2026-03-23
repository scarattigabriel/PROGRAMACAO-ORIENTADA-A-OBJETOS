/*/*3) Implemente um sistema de Agenda de Contatos que contenha as classes Data (com dia, mês e ano), Contato
(indicando se é Whatsapp e/ou Telegram e armazenando um número em string) e Pessoa (com nome, data de
nascimento e até quatro contatos), incluindo métodos para cadastrar e listar contatos. Crie ainda a classe Agenda,
capaz de armazenar até quinze pessoas, permitindo cadastrar, listar todas e buscar uma pessoa pelo nome. No
programa principal, instancie a agenda, cadastre 15 pessoas com seus dados e contatos, liste todas as cadastradas e
possibilite a pesquisa por nome para exibir as informações completas da pessoa encontrada. */ 
package Lista02;
import java.util.Scanner;
class Agenda {
    Pessoa[] pessoas = new Pessoa[15];
    int numPessoas = 0;
    
    void cadastraPessoa(Scanner sc) {
        if (numPessoas >= 15) {
            System.out.println("Lista de pessoas cheia!");
        } else {
            pessoas[numPessoas] = new Pessoa(); // Instanciando o objeto antes de usar
            pessoas[numPessoas].criaPessoa(sc);
            numPessoas++;
        }
    }


    void listaPessoas() {
        System.out.println("\n--- Listando todas as pessoas ---");
        if (numPessoas == 0) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }
        for (int i = 0; i < numPessoas; i++) {
            pessoas[i].listarPessoas();
        } 
    }


    void buscaNome(Scanner sc) {
        System.out.println("Digite o nome a ser buscado: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("\n--- Cadastro Encontrado ---");
                pessoas[i].listarPessoas();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma pessoa encontrada com o nome: " + nomeBusca);
        }
    }
}