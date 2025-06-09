class Juego {
    int nroVida;
    int record;
    public void reiniciaPartida() {
        nroVida = 3;
    }
    public void actualizaRecord() {
        record++;
    }
    public boolean quitaVida() {
        nroVida--;
        return nroVida > 0;
    }
}