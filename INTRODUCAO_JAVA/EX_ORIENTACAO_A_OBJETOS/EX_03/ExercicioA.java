/*) Informe o que o programa abaixo imprimirá na tela, mostrando a representação de memória que o programa
terá ao final da execução da main.
class Main {
public static void main(String[] args) {
Quadrado q1, q2;
int i = 3, a = 4;
q1 = new Quadrado();
q1.x = 8;
q1.y = 5;
q2 = q1;
a = i;
q1.lado = 10;
q2.x = 2;
q2.y = 3;
q2.imprime();
q1.imprime();
}
} */
package EX_ORIENTACAO_A_OBJETOS.EX_03;

public class ExercicioA {
        public static void main(String[] args) {
            //Cria duas variáveis (q1 e q2) do objeto Quadrado;
            Quadrado q1, q2;
            //Atribui valor nas duas varáveis i && a
            int i = 3, a = 4;
            //instancia um objeto (Quadrado) na variavel q1
            q1 = new Quadrado();
            //Atribui valores no objeto q1
            q1.x = 8;
            q1.y = 5;
            //q2 aponta pro mesmo lugar que q1
            q2 = q1;
            //a recebe o mesmo valor de i
            a = i;
            //atribui valores em q1 e q2, no caso os dois alteram o mesmo objeto instanciado
            q1.lado = 10;
            q2.x = 2;
            q2.y = 3;
            q2.imprime();
            q1.imprime();
            //lado == 10
            // x == 2
            // y == 3

            //Impressão:
            //x = 2
            //y = 3
            //mesma impressão nos dois
        }
    }


