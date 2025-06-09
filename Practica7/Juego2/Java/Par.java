class Par extends AdivinaJuego {
    public boolean validaNumero(int n) {
        if (n >= 0 && n <= 10 && n % 2 == 0) {
            return true;
        } else {
            System.out.println("solo del 1 al 10 viejo");
            return false;
        }
    }
}