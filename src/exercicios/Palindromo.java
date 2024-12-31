package exercicios;

import utils.ScannerUtil;

public class Palindromo {
    public static void executar() {
        String palavra = ScannerUtil.getString("Digite uma palavra: ");
        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }

    private static boolean ehPalindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }
}

/*
    Se eu fosse desenvolver sem usar bibliotecas:

    public static void executar() {
        String palavra = ScannerUtil.getString("Digite uma palavra: ");
        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }

    private static boolean ehPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        // Exemplo: Para palavra = "arara", verificamos:
        // 'a' == 'a', 'r' == 'r', ..., até o meio da palavra
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false; // Se os caracteres não forem iguais, não é palíndromo
            }
            inicio++;
            fim--;
        }

        return true; // Se passou por todos os caracteres, é palíndromo
    }

    public static void main(String[] args) {
        executar();
    }
}
 */