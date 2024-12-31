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

/* <---
Se eu fosse implementar sem usar bibliotecas:


    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        int limite = ScannerUtil.getInt("Digite o limite: ");
        exibirMultiplos(numero, limite);
    }

    private static void exibirMultiplos(int numero, int limite) {
        // Exemplo: Para número = 3 e limite = 10, os múltiplos serão:
        // 3, 6, 9
        System.out.println("Múltiplos de " + numero + " até " + limite + ":");
        for (int i = numero; i <= limite; i += numero) {
            System.out.print(i + " "); // Exibe o múltiplo atual
        }
        System.out.println();
    }

    //Uso para testar somente a classe;
    public static void main(String[] args) {
        executar();
    }
}
--->*/