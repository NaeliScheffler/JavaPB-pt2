package squad_att;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Crie um programa que encontre o segundo maior elemento em um
//vetor.

public class Atividade_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Quantos números deseja inserir?");
            int n = sc.nextInt();

            if (n < 2) {
                System.out.println("O vetor precisa ter pelo menos dois elementos. Programa encerrado!!!");
                return; // Encerra o programa
            }

            int[] vetor = new int[n];

            for (int i = 1; i <= n; i++) {
                System.out.printf("Número %d: ", i);
                vetor[i - 1] = sc.nextInt();
            }

            int segundoElementoMaior = encontrarSegundoElementoMaior(vetor);

            System.out.println("O segundo elemento maior no vetor é: " + segundoElementoMaior);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número válido. Programa encerrado!!!!");
        }

        sc.close();
    }

    public static int encontrarSegundoElementoMaior(int[] vetor) {
        // Ordenamos o vetor em ordem descrescente
        Arrays.sort(vetor);

        // O segundo maior elemento estará na penúltima posição do vetor, por isso o -2
        return vetor[vetor.length - 2];

    }
}

