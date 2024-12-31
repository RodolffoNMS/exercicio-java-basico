package exercicios;

import utils.ScannerUtil;

public class ContagemDigitos {
    public static void executar() {
        int numero = ScannerUtil.getInt("Digite um número: ");
        int quantidadeDigitos = contarDigitos(numero);
        System.out.println("O número possui " + quantidadeDigitos + " dígitos.");
    }

    private static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
}