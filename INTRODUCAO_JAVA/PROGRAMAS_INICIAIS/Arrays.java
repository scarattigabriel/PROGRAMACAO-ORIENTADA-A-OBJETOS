
public class Arrays {
    public static void main(String args[]){
        /*em C
        int vet[15];*/

        //em Java
        int[] vet = new int[15];
        // ||
        int vet2[];
        vet2 = new int[15];

        //Atribuindo valor a uma posição específica
        vet2[2]=27;
        
        //length pra verificar o tamanho do array
        for (int i=0; i < vet2.length; i++){
            System.out.println("vet2[_]: " + vet2[i]);
        }

        //Atribuição de valores em arrays utilizando  for
        for (int i=0; i< vet2.length; i++){
            vet2[i] = i;
        }

        //Outra opção de impressão de array utilizando for. Dessa forma, não é possível imprimir o índice
        for (int v : vet2){
            System.out.println("vet2[_]: " + v);
        }

    }    
}
