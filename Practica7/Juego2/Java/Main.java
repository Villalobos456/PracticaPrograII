public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Juego normal ---");
        AdivinaJuego j1 = new AdivinaJuego();
        j1.juega();
        System.out.println("\n--- Juego solo pares ---");
        Par j2 = new Par();
        j2.juega();
        System.out.println("\n--- Juego solo impares ---");
        Impar j3 = new Impar();
        j3.juega();
    }
}