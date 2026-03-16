import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha = sc.nextLine();

        // Inicializamos o mapa com 'false' para garantir que todos os critérios existam
        Map<String, Boolean> check = new HashMap<>();
        check.put("Maiuscula", false);
        check.put("Minuscula", false);
        check.put("Numero", false);
        check.put("Especial", false);
        check.put("Tamanho", senha.length() >= 8);

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) check.put("Maiuscula", true);
            else if (Character.isLowerCase(c)) check.put("Minuscula", true);
            else if (Character.isDigit(c)) check.put("Numero", true);
            // Se não for letra nem número, tratamos como especial (simplificado)
            else if (!Character.isWhitespace(c)) check.put("Especial", true);
        }

        // Verifica se todos os valores no mapa são 'true'
        boolean ehForte = !check.containsValue(false);

        System.out.println("--- Relatório de Segurança ---");
        check.forEach((criterio, passou) -> System.out.println(criterio + ": " + (passou ? "✅" : "❌")));
        
        if (ehForte) {
            System.out.println("\nResultado: Senha Forte!");
        } else {
            System.out.println("\nResultado: Senha Fraca. Melhore os critérios marcados com ❌.");
        }
        
        sc.close();
    }
}