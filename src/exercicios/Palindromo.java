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