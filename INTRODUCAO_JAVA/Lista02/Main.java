/*No
programa principal, instancie a agenda, cadastre 15 pessoas com seus dados e contatos, liste todas as cadastradas e
possibilite a pesquisa por nome para exibir as informações completas da pessoa encontrada. */

package Lista02;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Agenda ag = new Agenda();
        System.out.println("Bem-vindo à nova Agenda!");
        boolean nova_pessoa;
        do { 
            System.out.println("\n--- Cadastrando uma nova pessoa ---");
            ag.cadastraPessoa(sc);
            
            if (ag.numPessoas < 15) {
                System.out.println("Deseja cadastrar outra pessoa? Y/N");
                nova_pessoa = sc.nextLine().equalsIgnoreCase("Y");
            } else {
                System.out.println("Limite de 15 pessoas atingido.");
                nova_pessoa = false;
            }
        } while (nova_pessoa);

        ag.listaPessoas();

        boolean buscar_y_n;
        System.out.println("\nDeseja buscar uma pessoa específica pelo nome? Y/N");
        buscar_y_n = sc.nextLine().equalsIgnoreCase("Y");
        
        while (buscar_y_n) {
            ag.buscaNome(sc);
            System.out.println("\nDeseja buscar por outro nome? Y/N");
            buscar_y_n = sc.nextLine().equalsIgnoreCase("Y");
        }
        
        System.out.println("Encerrando programa...");
        sc.close();
    }
}