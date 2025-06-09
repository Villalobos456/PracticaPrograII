package Practica4.java;
public class main {
    public static void main(String[] args) {
        Area calc = new Area();
        System.out.println("Área del círculo: " + calc.area(5)); 
        System.out.println("Área del rectángulo: " + calc.area(4.0, 6.0));
        System.out.println("Área del triángulo: " + calc.area(3, 8));
        System.out.println("Área del trapecio: " + calc.area(4.0, 6.0, 5.0));
        System.out.println("Área del polígono: " + calc.area(4, 6));
    }
}
