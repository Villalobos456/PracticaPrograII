package Practica4.java;
public class Area {
    public double area(double radio) {
        return Math.PI * radio * radio;
    }
    public double area(double base, double altura) {
        return base * altura;
    }
    public double area(int base, int altura) {
        return (base * altura) / 2.0;
    }
    public double area(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }
    public double area(int perimetro, int apotema) {
        return (perimetro * apotema) / 2.0;
    }
}
