package Practica5.Java.EcuacionCuadratica;
public class EcuacionesCuadraticas {
    public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    public static double getRaiz1(double a, double b, double d) {
        return (-b + Math.sqrt(d)) / (2 * a);
    }
    public static double getRaiz2(double a, double b, double d) {
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}
