/*3) Implemente um sistema de Agenda de Contatos que contenha as classes Data (com dia, mês e ano), Contato
(indicando se é Whatsapp e/ou Telegram e armazenando um número em string) e Pessoa (com nome, data de
nascimento e até quatro contatos), incluindo métodos para cadastrar e listar contatos. Crie ainda a classe Agenda,
capaz de armazenar até quinze pessoas, permitindo cadastrar, listar todas e buscar uma pessoa pelo nome. No
programa principal, instancie a agenda, cadastre 15 pessoas com seus dados e contatos, liste todas as cadastradas e
possibilite a pesquisa por nome para exibir as informações completas da pessoa encontrada. */
package Lista02;

import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;

    void imprimeData()
    {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    void criaData(Scanner sc) {
        System.out.println("Digite o dia do seu nascimento: ");
        dia = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento: ");
        mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        ano = sc.nextInt();
        sc.nextLine(); 
    }

}
