
/*5.​ Faça um programa em Java que peça ao usuário uma string e retorne o número de
vogais que existem nesta string.​
Dica: Utilize os métodos length e charAt da string.​ */
import java.util.Scanner;
import java.text.Normalizer;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite para verificar o número de vogais presentes: ");
        String strUsuario = sc.nextLine();
        sc.close();

        // Normaliza: decompõe os caracteres acentuados e remove os diacríticos
        String normalizada = Normalizer.normalize(strUsuario, Normalizer.Form.NFD)
                                       .replaceAll("\\p{InCombiningDiacriticalMarks}", "")
                                       .toLowerCase();

        int ctdVogais = 0;
        for (int i = 0; i < normalizada.length(); i++) {
            if ("aeiou".indexOf(normalizada.charAt(i)) != -1) {
                ctdVogais++;
            }
        }

        System.out.println("Total de vogais: " + ctdVogais);
    }
}