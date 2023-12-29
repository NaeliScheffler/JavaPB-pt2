package squad_att;

import java.util.Arrays;
import java.util.Scanner;

//Escreva um programa que inverta a ordem dos elementos em um
//vetor.

public class Atividade_29 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Insira o número de elementos do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        int aux;

        for(int i = 1; i <= n; i++){
            System.out.printf("Elemento %d ",i);
            vetor[i-1] = aux = sc.nextInt();
        }

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        inverterVetor(vetor);

        System.out.println("Vetor invertido: " + Arrays.toString(vetor));
    }

    public static void inverterVetor(int[] vetor) {
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho / 2; i++) {
            // Trocar os elementos percorrendo a metade do vetor, primeiro pelo último, segundo pelo antepenúltimo...
            int aux2 = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = aux2;
        }
    }
}
