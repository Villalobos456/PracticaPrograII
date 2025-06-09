public class Main {
    public static void main(String[] args) {
        Artista a1 = new Artista("Luis", "123", 10), a2 = new Artista("Ana", "456", 5);
        Artista a3 = new Artista("Mario", "789", 8), a4 = new Artista("Lucía", "321", 12);
        Anuncio an1 = new Anuncio(1, 1000.0);
        Pintura p1 = new Pintura("Atardecer", "óleo", a1, a2, an1, "paisaje");
        Pintura p2 = new Pintura("Aurora", "acrílico", a3, a4, null, "abstracto");
        System.out.println("Artistas registradoss:");
        Artista[] artistas = {a1, a2, a3, a4};
        for (Artista art : artistas)
            System.out.println("- " + art.nombre + " (CI: " + art.ci + ", Años: " + art.añosExperiencia + ")");
        Artista mayor = a1;
        for (Artista art : artistas)
            if (art.añosExperiencia > mayor.añosExperiencia) mayor = art;
        System.out.println("\nArtista con más experiencia: " + mayor.nombre);
        p2.anuncio = new Anuncio(2, 1500.0);
        double total = p1.anuncio.precio + p2.anuncio.precio;
        System.out.println("Monto total de venta: " + total);
    }
}