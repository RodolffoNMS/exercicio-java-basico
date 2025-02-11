package exercicios;

import utils.ScannerUtil;

public class Fatorial {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número para calcular o fatorial: ");
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }

    private static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}

/*
public class Fatorial {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número para calcular o fatorial: ");
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }

    private static long calcularFatorial(int numero) {
        long fatorial = 1;

        // Exemplo: Para número = 5, o cálculo será:
        // fatorial = 1 * 2 * 3 * 4 * 5 = 120
        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // Multiplica o acumulador pelo número atual
        }

        return fatorial;
    }

    public static void main(String[] args) {
        executar();
    }
}

 */