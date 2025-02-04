import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, soma;

        System.out.print("Nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        nota3 = scanner.nextDouble();

        System.out.print("Nota 4: ");
        nota4 = scanner.nextDouble();

        soma = calculaSoma(nota1,nota2,nota3,nota4);

        scanner.close();

        System.out.println("Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Nota 3: " + nota3 + "\n" +
                "Nota 4: " + nota4 +  "\n" +
                "Soma: " + soma + "\n" +
                "Media " + calculaMedia(soma));
                }

    public static double calculaSoma(double num1,double num2,double num3,double num4){
        return num1 + num2 + num3 + num4;
    }

    public static double calculaMedia(double num){
        return num / 4;
    }
}