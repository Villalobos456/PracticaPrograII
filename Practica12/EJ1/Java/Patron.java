public class Patron {
    private static Patron instancia;
    private Patron() {
    }
    public static Patron getInstancia() {
        if (instancia == null) {
            instancia = new Patron();
        }
        return instancia;
    }
    public void operacion() {
        System.out.println("ejecutando operación del Patron");
    }
    public static void main(String[] args) {
        Patron s1 = Patron.getInstancia();
        Patron s2 = Patron.getInstancia();
        s1.operacion();
        System.out.println(s1 == s2);
    }
}
