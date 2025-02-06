import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaMasculino = new ArrayList<>();
        ArrayList<String> listaFeminino = new ArrayList<>();

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int numeroPessoas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("\nCadastro da pessoa " + (i + 1) + ":");

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();

            if (sexo == 'M' || sexo == 'm') {
                listaMasculino.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                listaFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Use M para Masculino ou F para Feminino.");
                i--;
            }
        }

        Collections.sort(listaMasculino);
        Collections.sort(listaFeminino);

        System.out.println("\nPessoas do sexo masculino:");
        for (String nome : listaMasculino) {
            System.out.println("Nome: " + nome + " | Sexo: Masculino");
        }

        System.out.println("\nPessoas do sexo feminino:");
        for (String nome : listaFeminino) {
            System.out.println("Nome: " + nome + " | Sexo: Feminino");
        }
    }
}