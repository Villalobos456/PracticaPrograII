public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(-2, 1, 0);
        Vector p = a.proyeccion(b);
        System.out.println("Proyección de A sobre B: (" + p.x + ", " + p.y + ", " + p.z + ")");
        System.out.println("Componente de A en B: " + a.componentes(b));
        System.out.println("El escalar es: "+ a.productoEscalar(b));
        System.out.println("El producto vectorial: "+ a.cruz(b).x + a.cruz(b).y + a.cruz(b).z);
    }
}
