package exercicio_hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static exercicio_hash.AlunoMetodo.lerAlunosDoCurso;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> alunosCursoA = lerAlunosDoCurso("A", scanner);
        Set<Integer> alunosCursoB = lerAlunosDoCurso("B", scanner);
        Set<Integer> alunosCursoC = lerAlunosDoCurso("C", scanner);

        Set<Integer> totalAlunos = new HashSet<>(alunosCursoA);
        totalAlunos.addAll(alunosCursoB);
        totalAlunos.addAll(alunosCursoC);

        System.out.println("Número total de alunos do instrutor Alex: " + totalAlunos.size());

        scanner.close();
    }
}
