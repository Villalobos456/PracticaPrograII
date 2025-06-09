import java.util.*;
class Ministerio {
    private String nombre;
    private String direccion;
    private int nroEmpleados = 0;
    private ArrayList<String[]> empleados = new ArrayList<>();
    private ArrayList<Integer> edades = new ArrayList<>();
    private ArrayList<Integer> sueldos = new ArrayList<>();
    public Ministerio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void agregar(String nombre, String apellido1, String apellido2, int edad, int sueldo) {
        empleados.add(new String[]{nombre, apellido1, apellido2});
        edades.add(edad);
        sueldos.add(sueldo);
        nroEmpleados++;
    }
    public void elimina(String nombre) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i)[0].equals(nombre)) {
                empleados.remove(i);
                edades.remove(i);
                sueldos.remove(i);
                nroEmpleados--;
                break;
            }
        }
    }
    public void transfiere(Ministerio otro, int i) {
        this.empleados.add(otro.empleados.get(i));
        this.edades.add(otro.edades.get(i));
        this.sueldos.add(otro.sueldos.get(i));
        this.nroEmpleados++;
        otro.empleados.remove(i);
        otro.edades.remove(i);
        otro.sueldos.remove(i);
        otro.nroEmpleados--;
    }
    public void menor() {
        int menorEdad = Integer.MAX_VALUE;
        int indice = -1;
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) > 0 && edades.get(i) < menorEdad) {
                menorEdad = edades.get(i);
                indice = i;
            }
        }
        if (indice >= 0)
            System.out.println("Menor edad: " + Arrays.toString(empleados.get(indice)));
    }
    public void menorSueldo() {
        int menor = Integer.MAX_VALUE;
        int indice = -1;
        for (int i = 0; i < sueldos.size(); i++) {
            if (sueldos.get(i) > 0 && sueldos.get(i) < menor) {
                menor = sueldos.get(i);
                indice = i;
            }
        }
        if (indice >= 0)
            System.out.println("Menor sueldo: " + Arrays.toString(empleados.get(indice)));
    }
    public void mostrar() {
        System.out.println("El ministerio se llama: " + nombre + ", su dirección es: " + direccion + ", cuenta con: " + nroEmpleados + " empleados");
        for (int i = 0; i < nroEmpleados; i++) {
            String[] emp = empleados.get(i);
            System.out.println("Sus empleados son: " + emp[0] + " " + emp[1] + " " + emp[2] + ", con la edad de: " + edades.get(i) + ", con un sueldo de: " + sueldos.get(i));
        }
    }
    
}

public class Ministerioo {
    public static void main(String[] args) {
        Ministerio m1 = new Ministerio("Salud", "Av. Arce 1234");
        Ministerio m2 = new Ministerio("Educación", "Av. Camacho 5678");
        m1.agregar("Carlos", "Rojas", "Fernández", 45, 5000);
        m1.agregar("Ana", "Pérez", "Gómez", 32, 4500);
        m1.agregar("Luis", "Mamani", "Choque", 29, 4000);
        m2.agregar("María", "García", "Flores", 41, 4800);
        m2.agregar("José", "Vargas", "López", 34, 4200);
        m1.elimina("Ana");
        m1.transfiere(m2, 0);
        m1.menor();
        m1.menorSueldo();
        m1.mostrar();
        m2.mostrar();
    }
}
