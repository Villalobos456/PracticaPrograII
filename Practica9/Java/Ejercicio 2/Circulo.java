import java.awt.*;
class Circulo extends Figura {
    double radio;

    Circulo(double r, String c) {
        super(c);
        radio = r;
    }

    double area() {
        return Math.PI * radio * radio;
    }

    double perimetro() {
        return 2 * Math.PI * radio;
    }

    void dibujar(Graphics g, int x, int y) {
        g.setColor(Color.decode(color));
        g.fillOval(x, y, (int)(2*radio), (int)(2*radio));
    }
}