package exercicios;

import utils.ScannerUtil;

public class Fibonacci {
    public static void executar() {
        int termos = ScannerUtil.getInt("Digite a quantidade de termos da sequência de Fibonacci: ");
        exibirFibonacci(termos);
    }

    private static void exibirFibonacci(int termos) {
        int a = 0, b = 1;
        System.out.println("Sequência de Fibonacci até " + termos + " termos:");
        for (int i = 0; i < termos; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();
    }
}

/*
public class Fibonacci {
    public static void executar() {
        int termos = ScannerUtil.getInt("Digite a quantidade de termos da sequência de Fibonacci: ");
        exibirFibonacci(termos);
    }

    private static void exibirFibonacci(int termos) {
        int a = 0, b = 1;

        // Exemplo: Para termos = 6, a sequência será:
        // 0, 1, 1, 2, 3, 5
        System.out.println("Sequência de Fibonacci até " + termos + " termos:");
        for (int i = 0; i < termos; i++) {
            System.out.print(a + " "); // Exibe o número atual
            int proximo = a + b; // Calcula o próximo número
            a = b; // Atualiza o valor de 'a'
            b = proximo; // Atualiza o valor de 'b'
        }
        System.out.println();
    }

    public static void main(String[] args) {
        executar();
    }
}
 */