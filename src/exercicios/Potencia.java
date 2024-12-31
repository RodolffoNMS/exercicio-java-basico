package exercicios;

import utils.ScannerUtil;

public class Potencia {
    public static void executar() {
        int base = ScannerUtil.getInt("Digite a base: ");
        int expoente = ScannerUtil.getInt("Digite o expoente: ");
        long resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }

    private static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}

/*

Para desenvolvimento sem uso de bibliotecas:
public class Potencia {
    public static void executar() {
        int base = ScannerUtil.getInt("Digite a base: ");
        int expoente = ScannerUtil.getInt("Digite o expoente: ");
        long resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }

    private static long calcularPotencia(int base, int expoente) {
        long resultado = 1;

        // Exemplo: Para base = 2 e expoente = 3, o cálculo será:
        // resultado = 1 * 2 * 2 * 2 = 8
        for (int i = 0; i < expoente; i++) {
            resultado *= base; // Multiplica a base pelo acumulador
        }

        return resultado;
    }

    public static void main(String[] args) {
        executar();
    }
}
 */