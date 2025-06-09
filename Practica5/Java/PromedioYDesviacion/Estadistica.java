package Practica5.Java.PromedioYDesviacion;
public class Estadistica {
    public static double calcularPromedio(double[] n) {
        double s = 0;
        for (double m : n) {
            s += m;
        }
        return s / n.length;
    }
    public static double calcularDesviacion(double[] n, double p) {
        double s = 0;
        for (double m : n) {
            s += Math.pow(m - p, 2);
        }
        return Math.sqrt(s / (n.length - 1));
    }
}
