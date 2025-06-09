class Galeria extends Boleto {
    Galeria(int n, int d) {
        numero = n;
        precio = d > 10 ? 25 : 30;
    }
}