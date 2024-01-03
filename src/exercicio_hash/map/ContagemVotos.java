package exercicio_hash.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemVotos {

    public static void main(String[] args) {
        String caminhoArquivo = "caminho/do/arquivo.csv";

        try {
            Map<String, Integer> totaisVotos = lerRegistros(caminhoArquivo);
            gerarRelatorio(totaisVotos);
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        }
    }

    private static Map<String, Integer> lerRegistros(String caminhoArquivo) throws FileNotFoundException {
        Map<String, Integer> totaisVotos = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(",");

                if (partes.length == 2) {
                    String nomeCandidato = partes[0];
                    int votos = Integer.parseInt(partes[1]);

                    // Atualiza o total de votos para o candidato
                    totaisVotos.put(nomeCandidato, totaisVotos.getOrDefault(nomeCandidato, 0) + votos);
                } else {
                    System.err.println("Formato inválido na linha: " + linha);
                }
            }
        }

        return totaisVotos;
    }

    private static void gerarRelatorio(Map<String, Integer> totaisVotos) {
        System.out.println("Relatório de Votos:");

        for (Map.Entry<String, Integer> entry : totaisVotos.entrySet()) {
            String nomeCandidato = entry.getKey();
            int totalVotos = entry.getValue();
            System.out.println(nomeCandidato + ": " + totalVotos + " votos");
        }
    }
}

