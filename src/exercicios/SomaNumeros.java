package exercicios;

import utils.ScannerUtil;

public class SomaNumeros {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        int somaTotal = calcularSoma(numero);
        System.out.println("A soma dos números de 1 até " + numero + " é: " + somaTotal);
    }

    private static int calcularSoma(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        return soma;
    }
}