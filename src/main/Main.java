package main;

import exercicios.*;
import utils.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        boolean executando = true;

        try {
            while (executando) {
                exibirMenu();
                int opcao = ScannerUtil.getInt("Escolha uma opção: ");
                executando = executarOpcao(opcao);
            }
        } finally {
            ScannerUtil.close();
        }
    }

    private static void exibirMenu() {
        System.out.println("===================================");
        System.out.println("         MENU DE EXERCÍCIOS        ");
        System.out.println("===================================");
        System.out.println("| 1  - Soma de Números            |");
        System.out.println("| 2  - Fatorial                   |");
        System.out.println("| 3  - Contagem de Dígitos        |");
        System.out.println("| 4  - Números Primos             |");
        System.out.println("| 5  - Inversão de Número         |");
        System.out.println("| 6  - Potência                   |");
        System.out.println("| 7  - Palíndromo                 |");
        System.out.println("| 8  - Múltiplos de um Número     |");
        System.out.println("| 9  - Conversão Binário-Decimal  |");
        System.out.println("| 10 - Série de Fibonacci         |");
        System.out.println("| 0  - Sair                       |");
        System.out.println("===================================");
    }

    private static boolean executarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> SomaNumeros.executar();
            case 2 -> Fatorial.executar();
            case 3 -> ContagemDigitos.executar();
            case 4 -> NumeroPrimo.executar();
            case 5 -> InversaoNumero.executar();
            case 6 -> Potencia.executar();
            case 7 -> Palindromo.executar();
            case 8 -> Multiplos.executar();
            case 9 -> BinarioParaDecimal.executar();
            case 10 -> Fibonacci.executar();
            case 0 -> {
                System.out.println("Saindo...");
                return false;
            }
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
        return true;
    }
}