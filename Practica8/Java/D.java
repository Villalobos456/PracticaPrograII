class D {
    A a;
    B b;
    public D(int x, int y, int z) {
        a = new A(x, z);
        b = new B(y, z);
    }
    public void incrementaXYZ() {
        a.x++;
        b.y++;
        a.z++;
        b.z = a.z;
    }
    public void mostrar() {
        System.out.println("x: " + a.x + " y: " + b.y + " z: " + a.z);
    }
}
