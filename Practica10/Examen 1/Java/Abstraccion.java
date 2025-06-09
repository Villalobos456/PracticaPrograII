class Comunidad {
    private String nombre;
    private String departamento;
    private String contaminacion;
    private int nroHabitantes;
    public Comunidad(String nombre, String departamento, String contaminacion, int nroHabitantes) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.contaminacion = contaminacion;
        this.nroHabitantes = nroHabitantes;
    }
    public void reportarContaminacion() {
        System.out.println("La comunidad " + nombre + " reporta contaminación con " + contaminacion);
    }
    public void mostrar() {
        System.out.println(nombre + " " + departamento + " " + contaminacion + " " + nroHabitantes);
    }
}
class Gobierno {
    private String presidente;
    private String ministerio;
    private double presupuesto;
    private boolean inaccion;
    public Gobierno(String presidente, String ministerio, double presupuesto, boolean inaccion) {
        this.presidente = presidente;
        this.ministerio = ministerio;
        this.presupuesto = presupuesto;
        this.inaccion = inaccion;
    }
    public void denuncia() {
        System.out.println("Gobierno no responde a las denuncias.");
    }
    public void mostrar() {
        System.out.println(presidente + " " + ministerio + " " + presupuesto + " " + inaccion);
    }
}
class Minera {
    private String nombre;
    private String tipoMineral;
    private String concesion;
    private int multas;
    public Minera(String nombre, String tipoMineral, String concesion, int multas) {
        this.nombre = nombre;
        this.tipoMineral = tipoMineral;
        this.concesion = concesion;
        this.multas = multas;
    }
    public void compensacion() {
        System.out.println(nombre + " está pagando compensación");
    }
    public void mostrar() {
        System.out.println(nombre + " " + tipoMineral + " " + concesion + " " + multas);
    }
}

public class Abstraccion {
    public static void main(String[] args) {
        Comunidad c = new Comunidad("Río Verde", "Potosí", "Alta", 1200);
        c.reportarContaminacion();
        c.mostrar();
        Gobierno g = new Gobierno("Luis Arce", "Medio Ambiente", 5000000, true);
        g.denuncia();
        g.mostrar();
        Minera m = new Minera("San Cristóbal", "Plomo y Plata", "Activa", 3);
        m.compensacion();
        m.mostrar();
    }
}