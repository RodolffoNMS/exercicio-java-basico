package exercicios;

import utils.ScannerUtil;

public class Multiplos {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        int limite = ScannerUtil.getInt("Digite o limite: ");
        exibirMultiplos(numero, limite);
    }

    private static void exibirMultiplos(int numero, int limite) {
        System.out.println("Múltiplos de " + numero + " até " + limite + ":");
        for (int i = numero; i <= limite; i += numero) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}