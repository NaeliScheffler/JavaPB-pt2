package exercicio_hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlunoMetodo {

    static Set<Integer> lerAlunosDoCurso(String curso, Scanner scanner) {
        Set<Integer> alunos = new HashSet<>();

        System.out.print("Informe os alunos do curso " + curso + " (digite -1 para encerrar): ");
        int aluno;
        while (true) {
            try {
                aluno = scanner.nextInt();
                if (aluno == -1) {
                    break;
                }
                alunos.add(aluno);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next();
            }
        }

        return alunos;
    }
}
