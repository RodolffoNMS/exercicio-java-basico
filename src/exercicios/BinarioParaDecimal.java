package exercicios;

import utils.ScannerUtil;

public class BinarioParaDecimal {
    public static void executar() {
        String binario = ScannerUtil.getString("Digite um número binário: ");
        int decimal = converterParaDecimal(binario);
        System.out.println("O número binário " + binario + " em decimal é: " + decimal);
    }

    private static int converterParaDecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }
}

/*<---
Se eu fosse implementar esse algorítimo manualmente:

public class BinarioParaDecimal {


    public static void executar() {
        String binario = ScannerUtil.getString("Digite um número binário: ");
        int decimal = converterParaDecimal(binario);
        System.out.println("O número binário " + binario + " em decimal é: " + decimal);
    }

    private static int converterParaDecimal(String binario) {
        int decimalNumber = 0;
        int power = 0;

        // Converte a string binária para um número inteiro
        int binaryNumber = Integer.parseInt(binario);

        while (binaryNumber > 0) {
            int bit = binaryNumber % 10; // Obtém o último dígito (bit)
            decimalNumber += bit * Math.pow(2, power); // Calcula o valor decimal
            binaryNumber = binaryNumber / 10; // Remove o último dígito
            power++;
        }

        /*<---
        Exemplo prático (manual):
        *Disclaimer, preciso assumir que o núemro é positivo, pois não uso aqui, complemento de 2
        decimal = Σ (bit * 2^posição)

        Para o número binário 111010:
        Último bit: 0 → decimal = 0 + (0 * 2^0) = 0
        Próximo bit: 1 → decimal = 0 + (1 * 2^1) = 2
        Próximo bit: 0 → decimal = 2 + (0 * 2^2) = 2
        Próximo bit: 1 → decimal = 2 + (1 * 2^3) = 10
        Próximo bit: 1 → decimal = 10 + (1 * 2^4) = 26
        Próximo bit: 1 → decimal = 26 + (1 * 2^5) = 58
        Resultado final: 58.
    --->*/
/*<---
        return decimalNumber;
    }
    //Uso para testes
    public static void main(String[] args) {
        System.out.println("Decimal value is: " + converterParaDecimal("111010"));
        System.out.println("Decimal value is: " + converterParaDecimal("001010"));
    }
}
--->*/