class LineaTeleferico:
    def __init__(self, color, tramo, nroCabina):
        self.color = color
        self.tramo = tramo
        self.nroCabina = nroCabina
        self.nroEmpleado = 0
        self.empleados = []
        self.edades = []
        self.sueldos = []
    def agregar(self, nombre, apellido1, apellido2, edad, sueldo):
        self.empleados.append([nombre, apellido1, apellido2])
        self.edades.append(edad)
        self.sueldos.append(sueldo)
        self.nroEmpleado += 1
        print ("Se agrego empleados correctamente: ")
    def elimina(self, apellido):
        for i in range(self.nroEmpleado):
            if self.empleados[i][1] == apellido or self.empleados[i][2] == apellido:
                self.empleados = self.empleados[:i] + self.empleados[i+1:]
                self.edades = self.edades[:i] + self.edades[i+1:]
                self.sueldos = self.sueldos[:i] + self.sueldos[i+1:]
                self.nroEmpleado -= 1
                break
    def transfiere(self, otro, i):
        self.empleados.append(otro.empleados[i])
        self.edades.append(otro.edades[i])
        self.sueldos.append(otro.sueldos[i])
        self.nroEmpleado += 1
        otro.empleados = otro.empleados[:i] + otro.empleados[i+1:]
        otro.edades = otro.edades[:i] + otro.edades[i+1:]
        otro.sueldos = otro.sueldos[:i] + otro.sueldos[i+1:]
        otro.nroEmpleado -= 1
    def mayor(self):
        mayor = max(self.edades)
        i = self.edades.index(mayor)
        print("Mayor edad:", self.empleados[i])
    def menor(self):
        mayor = max(self.sueldos)
        i = self.sueldos.index(mayor)
        print("Mayor sueldo:", self.empleados[i])
    def mostrar(self):
        print ("El color es: ", self.color, "su tramo es: ", self.tramo, "cuebta con: ", self.nroCabina, "cabinas  con: ", self.nroEmpleado, "empleados")
        for i in range (self.nroEmpleado):
            print ("sus empleados son: ", self.empleados[i], "con la edad de: ", self.edades[i], "con un sueldo de: ", self.sueldos[i])
l1 = LineaTeleferico("Roja", "Estación Central - 16 de Julio", 30)
l2 = LineaTeleferico("Amarilla", "Obrajes - Ciudad Satélite", 25)
l1.agregar("Ana", "Pérez", "Gómez", 35, 3500)
l1.agregar("Luis", "Martínez", "Flores", 42, 4000)
l1.agregar("Carla", "Ramírez", "Pérez", 28, 3200)
l2.agregar("Mario", "García", "López", 50, 4500)
l2.agregar("Lucía", "Fernández", "Rojas", 30, 3000)
l1.elimina("Pérez")
l1.transfiere(l2, 0)
l1.mayor()
l1.menor()
l1.mostrar()
l2.mostrar()