class Vector {
    double x;
    double y;
    double z;
    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Vector añadir(Vector o) {
        return new Vector(x + o.x, y + o.y, z + o.z);
    }
    Vector restaVector(Vector o) {
        return new Vector(x - o.x, y - o.y, z - o.z);
    }
    Vector multiplicaVector(double s) {
        return new Vector(x * s, y * s, z * s);
    }
    double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    double productoEscalar(Vector o) {
        return x * o.x + y * o.y + z * o.z;
    }
    Vector cruz(Vector o) {
        return new Vector(
            y * o.z - z * o.y,
            z * o.x - x * o.z,
            x * o.y - y * o.x
        );
    }
    boolean perpendicular(Vector o) {
        return productoEscalar(o) == 0 || añadir(o).magnitude() == restaVector(o).magnitude();
    }
    boolean paralelo(Vector o) {
        return cruz(o).magnitude() == 0;
    }
    Vector proyeccion(Vector o) {
        double f = productoEscalar(o) / o.productoEscalar(o);
        return o.multiplicaVector(f);
    }
    double componentes(Vector o) {
        return productoEscalar(o) / o.magnitude();
    }
}