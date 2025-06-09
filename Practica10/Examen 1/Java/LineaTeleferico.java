import java.util.*;
class Linea {
    private String color;
    private String tramo;
    private int nroCabinas;
    private int  nroEmpleados = 0;
    private ArrayList<String[]> empleados = new ArrayList<>();
    private ArrayList<Integer> edades = new ArrayList<>();
    private ArrayList<Integer> sueldos = new ArrayList<>();
    public Linea(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
    }
    public void agregar(String nombre, String apellido1, String apellido2, int edad, int sueldo) {
        empleados.add(new String[]{nombre, apellido1, apellido2});
        edades.add(edad);
        sueldos.add(sueldo);
        nroEmpleados++;
    }
    public void elimina(String apellido) {
        for (int i = 0; i < empleados.size(); i++) {
            String[] emp = empleados.get(i);
            if (emp[1].equals(apellido) || emp[2].equals(apellido)) {
                empleados.remove(i);
                edades.remove(i);
                sueldos.remove(i);
                nroEmpleados--;
                break;
            }
        }
    }    
    public void transfiere(Linea otro, int i) {
        this.empleados.add(otro.empleados.get(i));
        this.edades.add(otro.edades.get(i));
        this.sueldos.add(otro.sueldos.get(i));
        this.nroEmpleados++;
        otro.empleados.remove(i);
        otro.edades.remove(i);
        otro.sueldos.remove(i);
        otro.nroEmpleados--;
    }
    public void mayor() {
        int mayor = Collections.max(edades);
        int i = edades.indexOf(mayor);
        System.out.println("Mayor edad: " + Arrays.toString(empleados.get(i)));
    }
    public void menor() {
        int mayorSueldo = Collections.max(sueldos);
        int i = sueldos.indexOf(mayorSueldo);
        System.out.println("Mayor sueldo: " + Arrays.toString(empleados.get(i)));
    }
    public void mostrar() {
        System.out.println("El color es: " + color + ", su tramo es: " + tramo + ", cuenta con: " + nroCabinas + " cabinas con: " + nroEmpleados + " empleados");
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println("Sus empleados son: " + Arrays.toString(empleados.get(i)) + ", con la edad de: " + edades.get(i) + ", con un sueldo de: " + sueldos.get(i));
        }
    }
    
}
public class LineaTeleferico {
    public static void main(String[] args) {
        Linea l1 = new Linea("Roja", "Centro - 16 de Julio", 30);
        Linea l2 = new Linea("Amarilla", "Obrajes - Satélite", 25);
        l1.agregar("Ana", "Pérez", "Gómez", 35, 3500);
        l1.agregar("Luis", "Martínez", "Flores", 42, 4000);
        l1.agregar("Carla", "Ramírez", "Pérez", 28, 3200);
        l2.agregar("Mario", "García", "López", 50, 4500);
        l2.agregar("Lucía", "Fernández", "Rojas", 30, 3000);
        l1.elimina("Pérez");
        l1.transfiere(l2, 0);
        l1.mayor();
        l1.menor();
        l1.mostrar();
        l2.mostrar();
    }
}