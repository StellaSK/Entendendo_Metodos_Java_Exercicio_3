import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RETORNOS");
        System.out.println("========================");

        System.out.println("QUADRADO");
        System.out.println("Digite o lado do quadrado:");
        double lado = sc.nextDouble();
        double areaQuadrado = Quadrilateros.area(lado);
        System.out.println("Area do quadrado:" + areaQuadrado);
        System.out.println("------------------------");

        System.out.println("RETANGULO");
        System.out.println("Digite o lado 1 do retangulo:");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o lado 2 do retangulo:");
        double lado2 = sc.nextDouble();
        double areaRetangulo = Quadrilateros.area(lado1,lado2);
        System.out.println("Area do retangulo:" + areaRetangulo);
        System.out.println("------------------------");

        System.out.println("TRAPEZIO");
        System.out.println("Digite a base maior do trapezio:");
        double baseMaior = sc.nextDouble();
        System.out.println("Digite a base menor do trapezio:");
        double baseMenor = sc.nextDouble();
        System.out.println("Digite a altura do trapezio:");
        double altura = sc.nextDouble();
        double areaTrapezio = Quadrilateros.area(baseMaior,baseMenor,altura);
        System.out.println("Area do trapezio:" + areaTrapezio);
    }
}