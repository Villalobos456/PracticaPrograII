interface Objetivo {
    void metodo();
}
class Adapter {
    void metodoIncompatible() {
        System.out.println("Metodo del Adapter");
    }
}
class Adaptador implements Objetivo {
    private Adapter adaptee;
    public Adaptador(Adapter adaptee) {
        this.adaptee = adaptee;
    }
    public void metodo() {
        adaptee.metodoIncompatible();
    }
}
public class Cliente {
    public static void main(String[] args) {
        Adapter adaptee = new Adapter();
        Objetivo objetivo = new Adaptador(adaptee);
        objetivo.metodo();
    }
}
