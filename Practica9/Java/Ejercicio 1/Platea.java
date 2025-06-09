class Platea extends Boleto {
    Platea(int n, int d) {
        numero = n;
        precio = d > 10 ? 50 : 60;
    }
}