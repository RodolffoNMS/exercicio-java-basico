package exercicios;

import utils.ScannerUtil;

public class NumeroPrimo {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

/*
Para uso de código sem depender de biblitecas:
public class NumeroPrimo {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) return false; // Números menores ou iguais a 1 não são primos

        // Exemplo: Para número = 7, verificamos:
        // 7 % 2 != 0, 7 % 3 != 0, ..., até √7
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) { // Se for divisível por 'i', não é primo
                return false;
            }
        }

        return true; // Se não encontrou divisores, é primo
    }

    public static void main(String[] args) {
        executar();
    }
}
 */