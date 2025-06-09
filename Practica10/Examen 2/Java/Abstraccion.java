class Planta {
    private String nombre;
    private String  clima;
    private String  dispersion;
    private String  zona;
    public Planta(String nombre, String clima, String dispersion, String zona) {
        this.nombre = nombre;
        this.clima = clima;
        this.dispersion = dispersion;
        this.zona = zona;
    }
    public void mostrar() {
        System.out.println(nombre + " " + clima + " " + dispersion + " " + zona);
    }
    public void crecer() {
        System.out.println("La planta " + nombre + " está creciendo en zona " + zona);
    }
}
class Clima {
    private String tipo;
    private int humedad;
    private int temperatura;
    private int altitud;
    public Clima(String tipo, int humedad, int temperatura, int altitud) {
        this.tipo = tipo;
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.altitud = altitud;
    }
    public void crecimiento() {
        System.out.println("El clima afecta al crecimiento de las plantas");
    }
    public void mostrar() {
        System.out.println(tipo + " " + humedad + " " + temperatura + " " + altitud);
    }
}
class BarreraGeografica {
    private String tipo;
    private String ubicacion;
    private int altura;
    private int longitud;
    public BarreraGeografica(String tipo, String ubicacion, int altura, int longitud) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.altura = altura;
        this.longitud = longitud;
    }
    public void expansion() {
        System.out.println("La barrera impide expansión de especies");
    }
    public void mostrar() {
        System.out.println(tipo + " " + ubicacion + " " + altura + " " + longitud);
    }
}
public class Abstraccion {
    public static void main(String[] args) {
        Planta p = new Planta("Kantuta", "Templado", "Viento", "Andina");
        p.mostrar();
        p.crecer();
        Clima c = new Clima("Húmedo", 85, 22, 3000);
        c.mostrar();
        c.crecimiento();
        BarreraGeografica b = new BarreraGeografica("Montaña", "Cordillera Real", 4500, 120);
        b.mostrar();
        b.expansion();
    }
}
