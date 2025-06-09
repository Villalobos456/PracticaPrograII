import java.util.Scanner;
import java.util.Random;
class AdivinaJuego extends Juego {
    int nroAdivina;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    public boolean validaNumero(int n) {
        return n >= 0 && n <= 10;
    }
    public void juega() {
        reiniciaPartida();
        nroAdivina = r.nextInt(11);
        System.out.println("el numero esta entre 0 y 10");

        while (true) {
            System.out.print("n: ");
            if (!sc.hasNextInt()) {
                System.out.println("solo enteros viejo, porque decimas 😡");
                sc.next();
                continue;
            }
            int n = sc.nextInt();
            if (!validaNumero(n)) {
                System.out.println("tas down w");
                continue;
            }
            if (n == nroAdivina) {
                System.out.println("boeee, la hiciste bien weon");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (n < nroAdivina) {
                        System.out.println("mas grande w");
                    } else {
                        System.out.println("mas peque w");
                    }
                } else {
                    System.out.println("WUAJJAJAJ, perdiste XDDD 😂");
                    break;
                }
            }
        }
    }
}