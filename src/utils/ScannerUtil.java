package utils;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    private ScannerUtil() {
        // Construtor privado para evitar instância
    }

    public static int getInt(String mensagem) {
        System.out.print(mensagem);
        while (!SCANNER.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            SCANNER.next(); // Limpa a entrada inválida
        }
        return SCANNER.nextInt();
    }

    public static String getString(String mensagem) {
        System.out.print(mensagem);
        return SCANNER.next();
    }

    public static void close() {
        SCANNER.close();
    }
}