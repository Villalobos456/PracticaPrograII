import java.util.Scanner;
import java.util.Random;
class AdivinaNumero extends Juego {
    int nroAdivina;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    public void juega() {
        reiniciaPartida();
        nroAdivina = r.nextInt(11);
        System.out.println("el numero esta entre 0 y 10");
        while (true) {
            System.out.print("n: ");
            int n = sc.nextInt();
            if (n == nroAdivina) {
                System.out.println("Boeeee, hacker w, ganaste");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (n < nroAdivina) {
                        System.out.println("mas grande");
                    } else {
                        System.out.println("mas peque");
                    }
                } else {
                    System.out.println("XDDDDD, PERDISTE, WUJAJAJAJ 😂");
                    break;
                }
            }
        }
    }
}
