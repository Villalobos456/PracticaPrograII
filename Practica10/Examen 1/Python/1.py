class Comunidad:
    def __init__(self, nombre, departamento, contaminacion, nro_habitantes):
        self.nombre = nombre
        self.departamento = departamento
        self.contaminacion = contaminacion
        self.nro_habitantes = nro_habitantes
    def contamina(self):
        print("La comunidad", self.nombre, "reporta contaminación con", self.contaminacion)
    def mostrar(self):
        print(self.nombre, self.departamento, self.contaminacion, self.nro_habitantes)
class Gobierno:
    def __init__(self, presidente, ministerio, presupuesto, inaccion):
        self.presidente = presidente
        self.ministerio = ministerio
        self.presupuesto = presupuesto
        self.inaccion = inaccion
    def denuncia(self):
        print("Gobierno no responde a las denuncias.")
    def mostrar(self):
        print(self.presidente, self.ministerio, self.presupuesto, self.inaccion)
class Minera:
    def __init__(self, nombre, tipo_mineral, concesion, multas):
        self.nombre = nombre
        self.tipo_mineral = tipo_mineral
        self.concesion = concesion
        self.multas = multas
    def compensacion(self):
        print(self.nombre, "está pagando compensación")
    def mostrar(self):
        print(self.nombre, self.tipo_mineral, self.concesion, self.multas)
c1 = Comunidad("Río Verde", "Potosí", "Alta", 1200)
c1.contamina()
c1.mostrar()
g1 = Gobierno("Luis Arce", "Medio Ambiente", 5000000, True)
g1.denuncia()
g1.mostrar()
m1 = Minera("San Cristóbal", "Plomo y Plata", "Activa", 3)
m1.compensacion()
m1.mostrar()