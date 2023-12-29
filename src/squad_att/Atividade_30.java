package squad_att;

import java.util.Scanner;

//Crie um programa que verifique se uma string é um palíndromo
//ignorando espaços em branco e maiúsculas/minúsculas.

public class Atividade_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma frase para verificar se é um palíndromo ou não: ");
        String frase = scanner.nextLine();

        if (palindromo(frase))
            System.out.println("A frase fornecida é um palíndromo ");
        else System.out.println("A frase fornecida não é um palíndromo ");

    }
    public static boolean palindromo(String frase) {
        // Remove espaços em branco e converte a frase para minúsculas
        String semEspacosMinuscula = frase.replaceAll("\\s", "").toLowerCase();

        // Verifica se a string invertida é igual à original
        String invertida = new StringBuilder(semEspacosMinuscula).reverse().toString();
        return semEspacosMinuscula.equals(invertida);
    }
}
