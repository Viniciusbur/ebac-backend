import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantas pessoas deseja adicionar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            String genero;
            while (true) {
                System.out.println("Digite o gênero da pessoa (M/F):");
                genero = scanner.nextLine().toUpperCase();
                if (genero.equals("M") || genero.equals("F")) {
                    break;
                } else {
                    System.out.println("Gênero inválido! Por favor, digite 'M' para Masculino ou 'F' para Feminino.");
                }
            }

            pessoas.add(new Pessoa(nome, genero));
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> "F".equalsIgnoreCase(p.getGenero()))
                .collect(Collectors.toList());

        System.out.println("\nLista completa de pessoas:");
        pessoas.forEach(System.out::println);

        System.out.println("\nLista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}