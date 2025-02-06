import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você deseja calcular? ");
        int quantidadeNotas = scanner.nextInt();

        float media = calcularMedia(quantidadeNotas, scanner);

        System.out.println("A média do aluno é: " + media);

        if (media >= 7) {
            System.out.println("Parabéns, você passou!");
        } else if (media >= 5) {
            System.out.println("Você está em recuperação.");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }

        scanner.close();
    }

    public static float calcularMedia(int quantidadeNotas, Scanner scanner) {
        float soma = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.println("Digite a nota " + i + ": ");
            float nota = scanner.nextFloat();
            soma += nota;
        }
        return soma / quantidadeNotas;
    }
}