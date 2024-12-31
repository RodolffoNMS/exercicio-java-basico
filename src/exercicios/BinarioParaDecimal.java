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