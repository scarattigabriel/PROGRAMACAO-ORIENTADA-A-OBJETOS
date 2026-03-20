/*/*3) Implemente um sistema de Agenda de Contatos que contenha as classes Data (com dia, mês e ano), Contato
(indicando se é Whatsapp e/ou Telegram e armazenando um número em string) e Pessoa (com nome, data de
nascimento e até quatro contatos), incluindo métodos para cadastrar e listar contatos. Crie ainda a classe Agenda,
capaz de armazenar até quinze pessoas, permitindo cadastrar, listar todas e buscar uma pessoa pelo nome. No
programa principal, instancie a agenda, cadastre 15 pessoas com seus dados e contatos, liste todas as cadastradas e
possibilite a pesquisa por nome para exibir as informações completas da pessoa encontrada. */
package Lista02;

public class Pessoa {
    String nome;
    Data data_nasc;
    Contato[] contatos = new Contato[4];
    int numContatos = 0;

    void cadastraContato(Contato c)
    {
        if(numContatos == 4)
        {
            System.out.println("Lista de contatos cheia!");
        }
        else
        {    
            for (int i = 0; i < 4; i++)
            {
                if(contatos[i] == null)
                {
                    contatos[i] = c;
                    numContatos++;
                }
            }
        }
        return;
    }

    void listarContatos()
    {
        for(int i = 0; i < numContatos; i++){
            contatos[i].imprimeContato();
        }
        return;
    }
        

}
