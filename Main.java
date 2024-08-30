import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas do ponto (x y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("1º Quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2º Quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3º Quadrante");
        } else {
            System.out.println("4º Quadrante");
        }
    }
              }