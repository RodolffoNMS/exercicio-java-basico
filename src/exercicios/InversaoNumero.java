package exercicios;

import utils.ScannerUtil;

public class InversaoNumero {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        int invertido = inverterNumero(numero);
        System.out.println("Número invertido: " + invertido);
    }

    private static int inverterNumero(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }
}

/*

Para uso sem bibliotecas:
public class InversaoNumero {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        int invertido = inverterNumero(numero);
        System.out.println("Número invertido: " + invertido);
    }

    private static int inverterNumero(int numero) {
        int invertido = 0;

        // Exemplo: Para número = 1234, o cálculo será:
        // Último dígito: 4 → invertido = 0 * 10 + 4 = 4
        // Próximo dígito: 3 → invertido = 4 * 10 + 3 = 43
        // Próximo dígito: 2 → invertido = 43 * 10 + 2 = 432
        // Próximo dígito: 1 → invertido = 432 * 10 + 1 = 4321
        while (numero != 0) {
            int digito = numero % 10; // Obtém o último dígito
            invertido = invertido * 10 + digito; // Adiciona o dígito ao número invertido
            numero /= 10; // Remove o último dígito
        }

        return invertido;
    }

    public static void main(String[] args) {
        executar();
    }
}
 */