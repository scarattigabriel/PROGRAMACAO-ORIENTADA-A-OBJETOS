/*/*3) Implemente um sistema de Agenda de Contatos que contenha as classes Data (com dia, mês e ano), Contato
(indicando se é Whatsapp e/ou Telegram e armazenando um número em string) e Pessoa (com nome, data de
nascimento e até quatro contatos), incluindo métodos para cadastrar e listar contatos. Crie ainda a classe Agenda,
capaz de armazenar até quinze pessoas, permitindo cadastrar, listar todas e buscar uma pessoa pelo nome. No
programa principal, instancie a agenda, cadastre 15 pessoas com seus dados e contatos, liste todas as cadastradas e
possibilite a pesquisa por nome para exibir as informações completas da pessoa encontrada. */ 
package Lista02;
import java.util.Scanner;

class Contato {
    boolean whatsapp;
    boolean telegram;
    String numero;

    void imprimeContato() {
        System.out.println("Número: " + numero);
        System.out.println("WhatsApp: " + (whatsapp ? "Sim" : "Não"));
        System.out.println("Telegram: " + (telegram ? "Sim" : "Não"));
    }

    void criaContato(Scanner sc) {
        System.out.println("Digite o seu número: ");
        numero = sc.nextLine();
        System.out.println("Possui WhatsApp? Y/N");
        whatsapp = sc.nextLine().equalsIgnoreCase("Y");
        System.out.println("Possui Telegram? Y/N");
        telegram = sc.nextLine().equalsIgnoreCase("Y");
    }
}