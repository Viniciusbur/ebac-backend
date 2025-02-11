import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opção de entrada:");
        System.out.println("1 - Leitura e ordenação de nomes: ");
        System.out.println("2 - Leitura e ordenação de nomes e sexo:");
        int opcao = scanner.nextInt();
        scanner.nextLine();// Limpar o scanner

        switch (opcao) {
            case 1:
                ordenarNomes(scanner);
                break;
            case 2:
                ordenarNomesESexo(scanner);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }

    }

    public static void ordenarNomes(Scanner scanner) {
        String input = scanner.nextLine();
        String[] nomes = input.split(",");

        if (nomes.length != 10) {
            System.out.println("Por favor, insira exatamente 10 nomes.");
            return;
        }

        System.out.println("Nomes sem ordenação:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Arrays.sort(nomes);
        System.out.println();

        System.out.println("Nomes ordenados por ordem alfabetica:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void ordenarNomesESexo(Scanner scanner) {
        System.out.println("Digite 10 nomes e sexos no formato Nome-Sexo: ");
        String input = scanner.nextLine();
        String[] nomesSexos = input.split(",");

        if (nomesSexos.length != 10) {
            System.out.println("Por favor, insira exatamente 10 nomes no formato Nome-Sexo.");
            return;
        }

        HashMap<String, String> mapaNomesSexos = new HashMap<>();

        for (String item : nomesSexos) {
            String[] partes = item.split("-");
            if (partes.length == 2) {
                String nome = partes[0];
                String sexo = partes[1].toUpperCase();
                mapaNomesSexos.put(nome, sexo);
            } else {
                System.out.println("Formato inválido. Use o formato Nome-Sexo (ex: Vinicius-M).");
                return;
            }
        }

        System.out.println("Nomes e sexos sem ordenação:");
        exibirHashMap(mapaNomesSexos);

        List<String> nomesOrdenados = new ArrayList<>(mapaNomesSexos.keySet());
        Collections.sort(nomesOrdenados);

        System.out.println("\nNomes e sexos ordenados por ordem alfabética:");
        for (String nome : nomesOrdenados) {
            System.out.println(nome + " - " + mapaNomesSexos.get(nome));
        }

        List<String> femininos = new ArrayList<>();
        List<String> masculinos = new ArrayList<>();

        for (Map.Entry<String, String> entry : mapaNomesSexos.entrySet()) {
            if (entry.getValue().equals("F")) {
                femininos.add(entry.getKey());
            } else {
                masculinos.add(entry.getKey());
            }
        }

        Collections.sort(femininos);
        Collections.sort(masculinos);

        System.out.println("\nNomes femininos ordenados:");
        for (String nome : femininos) {
            System.out.println(nome + " - " + mapaNomesSexos.get(nome));
        }

        System.out.println("\nNomes masculinos ordenados:");
        for (String nome : masculinos) {
            System.out.println(nome + " - " + mapaNomesSexos.get(nome));
        }
    }

    public static void exibirHashMap(HashMap<String, String> mapa) {
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}