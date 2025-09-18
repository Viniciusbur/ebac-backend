import domain.Carro;
import domain.Ford;
import domain.Honda;
import domain.Toyota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        carros.add(new Honda());
        carros.add(new Toyota());
        carros.add(new Ford());

        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Carros na lista:");
            for (Carro carro : carros) {
                System.out.println(carro.getMarca());
            }

            System.out.print("\nDeseja adicionar um novo carro? (s/n): ");
            continuar = scanner.nextLine();

            if (continuar.equalsIgnoreCase("s")) {
                System.out.print("Digite a marca do carro (Honda, Toyota, Ford): ");
                String marca = scanner.nextLine();
                Carro novoCarro = null;
                if (marca.equalsIgnoreCase("Honda")) {
                    novoCarro = new Honda();
                } else if (marca.equalsIgnoreCase("Toyota")) {
                    novoCarro = new Toyota();
                } else if (marca.equalsIgnoreCase("Ford")) {
                    novoCarro = new Ford();
                } else {
                    System.out.println("Marca de carro inválida.");
                }

                if (novoCarro != null) {
                    carros.add(novoCarro);
                    System.out.println("Carro adicionado com sucesso!");
                }
            }
        }
        scanner.close();
        System.out.println("\nLista final de carros:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}
