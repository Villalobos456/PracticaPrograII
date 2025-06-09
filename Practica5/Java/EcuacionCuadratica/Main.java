package Practica5.Java.EcuacionCuadratica;
import static Practica5.Java.EcuacionCuadratica.EcuacionesCuadraticas.getDiscriminante;
import static Practica5.Java.EcuacionCuadratica.EcuacionesCuadraticas.getRaiz1;
import static Practica5.Java.EcuacionCuadratica.EcuacionesCuadraticas.getRaiz2;
import java.util.Scanner;
public class Main {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        double d = getDiscriminante(a, b, c);
        if (d > 0) {
            System.out.println("tiene 2 raices " + getRaiz1(a, b, d) + " y " + getRaiz2(a, b, d));
        } else if (d == 0) {
            System.out.println("tiene 1 raiz" + getRaiz1(a, b, d));
        } else {
            System.out.println("no tiene XD");
        }
        scanner.close();
    }
}
