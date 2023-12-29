package squad_att;

import java.util.Scanner;

//Elabore um programa que substitua todas as vogais em uma string
//por asteriscos.

public class Atividade_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a frase desejada: ");
        String frase = scanner.nextLine();

        String fraseModificada = substituiVogais(frase);
        System.out.println("Frase modificada: " + fraseModificada);
    }
        public static String substituiVogais(String frase){
            frase = frase.replace('a','*');
            frase = frase.replace('e','*');
            frase = frase.replace('i','*');
            frase = frase.replace('o','*');
            frase = frase.replace('u','*');

            return frase;
        }
}
