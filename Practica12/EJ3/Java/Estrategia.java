interface Estrategia {
    void ejecutar();
}
class EstrategiaA implements Estrategia {
    public void ejecutar() {
        System.out.println("Estrategia A ejecutada.");
    }
}
class EstrategiaB implements Estrategia {
    public void ejecutar() {
        System.out.println("Estrategia B ejecutada.");
    }
}
class Contexto {
    private Estrategia estrategia;
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    public void ejecutarEstrategia() {
        estrategia.ejecutar();
    }
    public static void main(String[] args) {
        Contexto c = new Contexto();
        c.setEstrategia(new EstrategiaA());
        c.ejecutarEstrategia();
        c.setEstrategia(new EstrategiaB());
        c.ejecutarEstrategia();
    }
}
