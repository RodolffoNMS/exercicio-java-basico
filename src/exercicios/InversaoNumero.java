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