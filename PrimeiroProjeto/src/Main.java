import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Pessoa");
        System.out.println("Escolha o tipo: ");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();
W
        if (opcao == 1) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            Pessoa pessoa = new PessoaFisica(nome, cpf);
            pessoa.exibirDados();
            return;
        } else if (opcao == 2) {
            System.out.print("Digite o nome da empresa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CNPJ: ");
            String cnpj = scanner.nextLine();

            Pessoa pessoa = new PessoaJuridica(nome, cnpj);
            pessoa.exibirDados();
            return;
        }

        System.out.println("Opção inválida!");
        scanner.close();
    }
}