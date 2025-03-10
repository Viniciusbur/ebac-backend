import carro.Carro;
import fabrica.FabricaDeCarro;
import fabrica.FabricaDeHatch;
import fabrica.FabricaDeSUV;
import fabrica.FabricaDeSedan;
import motor.Motor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de carro para montar:");
        System.out.println("1 - Sedan");
        System.out.println("2 - SUV");
        System.out.println("3 - Hatch");
        System.out.print("Digite sua escolha: ");
        int escolha = scanner.nextInt();

        FabricaDeCarro fabrica;
        switch (escolha) {
            case 1:
                fabrica = new FabricaDeSedan();
                break;
            case 2:
                fabrica = new FabricaDeSUV();
                break;
            case 3:
                fabrica = new FabricaDeHatch();
                break;
            default:
                System.out.println("Escolha inválida! Saindo...");
                return;
        }

        Carro carro = fabrica.criarCarro();
        Motor motor = fabrica.criarMotor();
        carro.montar();
        motor.fabricar();

        scanner.close();
    }
}