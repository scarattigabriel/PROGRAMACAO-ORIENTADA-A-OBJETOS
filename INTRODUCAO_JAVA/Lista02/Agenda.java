/*/*3) Implemente um sistema de Agenda de Contatos que contenha as classes Data (com dia, mês e ano), Contato
(indicando se é Whatsapp e/ou Telegram e armazenando um número em string) e Pessoa (com nome, data de
nascimento e até quatro contatos), incluindo métodos para cadastrar e listar contatos. Crie ainda a classe Agenda,
capaz de armazenar até quinze pessoas, permitindo cadastrar, listar todas e buscar uma pessoa pelo nome. No
programa principal, instancie a agenda, cadastre 15 pessoas com seus dados e contatos, liste todas as cadastradas e
possibilite a pesquisa por nome para exibir as informações completas da pessoa encontrada. */ 
package Lista02;

public class Agenda {
    Pessoa[] pessoas = new Pessoa[15];
    int numPessoas;
    
    void cadastraPessoa(Pessoa p)
    {
        if(numPessoas == 15)
        {
            System.out.println("Lista de pessoas cheia!");
        }
        else
        {
            for (int i = 0; i < 15; i++){
                if(pessoas[i] == null)
                {
                    pessoas[i] = p;
                    numPessoas++;
                }
        }
        }

        return;
    }

    void listaPessoas()
    {
        System.out.println("Listando pessoas: ");
        for(int i = 0; i < numPessoas; i++)
            {
                System.out.println("Nome: " + pessoas[i].nome);
                System.out.println("Data de nascimento: " + pessoas[i].data_nasc);
                System.out.println("Número de contatos: " + pessoas[i].numContatos);
                pessoas[i].listarContatos();
            } 
    }


}

