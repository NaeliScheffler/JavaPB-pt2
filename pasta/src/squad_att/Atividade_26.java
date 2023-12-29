package squad_att;

import java.util.Scanner;

//Desenvolva um programa que conte o número de palavras em uma
//string.
public class Atividade_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a frase desejada: ");
        String frase = scanner.nextLine();

        int numeroPalavras = contarPalavras(frase);

        System.out.println("Número de palavras da String: " + numeroPalavras);
    }

    public static int contarPalavras(String frase) {
        if (frase == null || frase.isEmpty()) {
            System.out.println("A String está vazia");
            return 0;
        }

        // Dividir a string por espaços em branco
        String[] palavras = frase.split("\\s+");

        return palavras.length;
    }
}
