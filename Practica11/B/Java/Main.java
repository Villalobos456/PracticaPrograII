import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Artista a1 = new Artista("Carlos", "111", 7), a2 = new Artista("Diana", "222", 6);
        Artista a3 = new Artista("Elena", "333", 4), a4 = new Artista("Hugo", "444", 11);
        Anuncio an1 = new Anuncio(1, 1200.0), an2 = new Anuncio(2, 1700.0);
        Pintura p1 = new Pintura("Montaña", "óleo", a1, a2, an1, "realismo");
        Pintura p2 = new Pintura("Mar", "acrílico", a3, a4, an2, "marino");
        System.out.println("Artistas registrados:");
        Artista[] artistas = {a1, a2, a3, a4};
        for (Artista a : artistas)
            System.out.println("- " + a.nombre + " (CI: " + a.ci + ", Años: " + a.añosExperiencia + ")");
        double prom = (a1.añosExperiencia + a2.añosExperiencia + a3.añosExperiencia + a4.añosExperiencia) / 4.0;
        System.out.println("\nPromedio de añoss de experiencia: " + prom);
        System.out.print("\nIngrese el nombre del artista para incrementar precio: ");
        String nombre = sc.nextLine();
        System.out.print("Monto a incrementar: ");
        double incremento = sc.nextDouble();
        for (Pintura p : new Pintura[]{p1, p2}) {
            if (p.a1.nombre.equals(nombre) || p.a2.nombre.equals(nombre)) {
                double antes = p.anuncio.precio;
                p.anuncio.precio += incremento;
                System.out.println("Pintura '" + p.titulo + "': antes = " + antes + ", después = " + p.anuncio.precio + ", diferencia = " + (p.anuncio.precio - antes));
            }
        }
    }
}