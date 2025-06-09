import java.awt.*;
class Cuadrado extends Figura implements Coloreado {
    double lado;

    Cuadrado(double l, String c) {
        super(c);
        lado = l;
    }

    double area() {
        return lado * lado;
    }

    double perimetro() {
        return 4 * lado;
    }

    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    void dibujar(Graphics g, int x, int y) {
        g.setColor(Color.decode(color));
        g.fillRect(x, y, (int)lado, (int)lado);
    }
}
