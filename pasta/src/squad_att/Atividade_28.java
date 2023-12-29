package squad_att;

import java.util.Scanner;

//Implemente um programa que calcule o fatorial de um número usando
//recursividade.

public class Atividade_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial dele: ");
        int numero = scanner.nextInt();

        double resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
}
public static double calcularFatorial(int n) {
    // Fatorial de 0 = 1
    if (n == 0) return 1;

    // Chamada recursiva
    return n * calcularFatorial(n - 1);
}
}

