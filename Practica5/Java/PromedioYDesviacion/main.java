package Practica5.Java.PromedioYDesviacion;
import java.util.Scanner;
import static Practica5.Java.PromedioYDesviacion.Estadistica.calcularPromedio;
import static Practica5.Java.PromedioYDesviacion.Estadistica.calcularDesviacion;
public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] n = new double[10];
        System.out.println("meta 10 numeros");
        for (int i = 0; i < 10; i++) {
            n[i] = s.nextDouble();
        }
        double p = calcularPromedio(n);
        double d = calcularDesviacion(n, p);
        System.out.printf("El ppromedio es %.2f%n", p);
        System.out.printf("La desviación estándar es %.5f%n", d);
        s.close();
    }
}
