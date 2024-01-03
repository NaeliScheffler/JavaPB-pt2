package exercicio_lambda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Funcionario {
    String nome;
    String email;
    double salario;

    public Funcionario(String nome, String email, double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }
}

public class LerDadosFuncionarios {
    public static void main(String[] args) {
        String caminhoArquivo = "//caminho.csv";

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        try {
            lerDadosFuncionarios(caminhoArquivo, funcionarios);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor do salário para a filtragem: ");
            double salarioLimite = scanner.nextDouble();

            mostrarEmailsOrdenadosPorSalario(funcionarios, salarioLimite);

            double somaSalariosM = calcularSomaSalariosComInicial(funcionarios);
            System.out.println("Soma dos salários dos funcionários com nome começando com 'M': " + somaSalariosM);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }

    private static void lerDadosFuncionarios(String caminhoArquivo, ArrayList<Funcionario> funcionarios) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(",");

                if (partes.length == 3) {
                    String nome = partes[0];
                    String email = partes[1];
                    double salario = Double.parseDouble(partes[2]);

                    funcionarios.add(new Funcionario(nome, email, salario));
                } else {
                    System.err.println("Formato inválido na linha: " + linha);
                }
            }
        }
    }

    private static void mostrarEmailsOrdenadosPorSalario(ArrayList<Funcionario> funcionarios, double salarioLimite) {
        funcionarios.stream()
                .filter(funcionario -> funcionario.salario > salarioLimite)
                .sorted(Comparator.comparing(funcionario -> funcionario.email))
                .forEach(funcionario -> System.out.println("Email: " + funcionario.email));
    }

    private static double calcularSomaSalariosComInicial(ArrayList<Funcionario> funcionarios) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.nome.toUpperCase().charAt(0) == Character.toUpperCase('M'))
                .mapToDouble(funcionario -> funcionario.salario)
                .sum();
    }
}
