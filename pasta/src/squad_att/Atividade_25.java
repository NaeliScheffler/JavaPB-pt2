package squad_att;

import java.util.Arrays;
import java.util.Scanner;

//Crie um programa que encontre o segundo maior elemento em um
//vetor.

public class Atividade_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja inserir?");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int aux;

        for(int i = 1; i <= n; i++){
            System.out.printf("Número %d ",i);
            vetor[i-1] = aux = sc.nextInt();
        }

        int segundoElementoMaior = encontrarSegundoElementoMaior(vetor);

        System.out.println("O segundo elemento maior no vetor é: " + segundoElementoMaior);
    }

    public static int encontrarSegundoElementoMaior(int[] vetor) {
        if (vetor.length < 2) {
            System.out.println("O vetor precisa ter dois elementos para que exista um segundo maior.");
            return -1;
        }
        //Ordenamos o vetor em ordem descrescente
        Arrays.sort(vetor);

        // O segundo maior elemento estará na na penúltima posição do vetor, por isso o -2
        return vetor[vetor.length - 2];

    }
}

