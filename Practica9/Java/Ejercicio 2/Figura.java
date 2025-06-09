import java.awt.*;
abstract class Figura {
    String color;

    Figura(String c) {
        color = c;
    }

    String getColor() {
        return color;
    }

    abstract double area();
    abstract double perimetro();
    abstract void dibujar(Graphics g, int x, int y);
}