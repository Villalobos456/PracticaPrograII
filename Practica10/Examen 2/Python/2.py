class Ministerio:
    def __init__(self, nombre, direccion):
        self.nombre = nombre
        self.direccion = direccion
        self.nro_empleados = 0
        self.empleados = []
        self.edades = []
        self.sueldos = []
    def agregar(self, nombre, apellido1, apellido2, edad, sueldo):
        self.empleados.append([nombre, apellido1, apellido2])
        self.edades.append(edad)
        self.sueldos.append(sueldo)
        self.nro_empleados += 1
    def elimina(self, nombre):
        for i in range(len(self.empleados)):
            if self.empleados[i][0] == nombre:
                self.empleados.pop(i)
                self.edades.pop(i)
                self.sueldos.pop(i)
                self.nro_empleados -= 1
                break
    def transfiere(self, otro, i):
        self.empleados.append(otro.empleados[i])
        self.edades.append(otro.edades[i])
        self.sueldos.append(otro.sueldos[i])
        self.nro_empleados += 1
        otro.empleados = otro.empleados[:i] + otro.empleados[i+1:]
        otro.edades = otro.edades[:i] + otro.edades[i+1:]
        otro.sueldos = otro.sueldos[:i] + otro.sueldos[i+1:]
        otro.nro_empleados -= 1
    def menor(self):
        menor = min([e for e in self.edades if e > 0])
        i = self.edades.index(menor)
        print("Menor edad:", self.empleados[i])
    def menorSueldo(self):
        menor = min([s for s in self.sueldos if s > 0])
        i = self.sueldos.index(menor)
        print("Menor sueldo:", self.empleados[i])
    def mostrar(self):
        print ("El ministerio se llama: ", self.nombre, "su direccion es: ", self.direccion, "cuenta con: ", self.nro_empleados, "empleados")
        for i in range (self.nro_empleados):
            print ("sus empleados son: ", self.empleados[i], "con la edad de: ", self.edades[i], "con un sueldo de: ", self.sueldos[i])
m1 = Ministerio("Ministerio de Salud", "Av. Arce 1234")
m2 = Ministerio("Ministerio de Educación", "Av. Camacho 5678")
m1.agregar("Carlos", "Rojas", "Fernández", 45, 5000)
m1.agregar("Ana", "Pérez", "Gómez", 32, 4500)
m1.agregar("Luis", "Mamani", "Choque", 29, 4000)
m2.agregar("María", "García", "Flores", 41, 4800)
m2.agregar("José", "Vargas", "López", 34, 4200)
m1.elimina("Ana")
m1.transfiere(m2, 0)
m1.menor()
m1.menorSueldo()
m1.mostrar()
m2.mostrar()