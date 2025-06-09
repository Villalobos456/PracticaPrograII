class Planta:
    def __init__(self, nombre, clima, dispersion, zona):
        self.nombre = nombre
        self.clima = clima
        self.dispersion = dispersion
        self.zona = zona
    def mostrar(self):
        print (self.nombre, self.clima, self.dispersion, self.zona)
    def crecer(self):
        print ("La planta", self.nombre, "está creciendo en zona", self.zona,)
class Clima:
    def __init__(self, tipo, humedad, temperatura, altitud):
        self.tipo = tipo
        self.humedad = humedad
        self.temperatura = temperatura
        self.altitud = altitud
    def crecimiento(self):
        print("El clima afecta al crecimiento de las plantas")
    def mostrar(self):
        print(self.tipo, self.humedad, self.temperatura, self.altitud)
class BarreraGeografica:
    def __init__(self, tipo, ubicacion, altura, longitud):
        self.tipo = tipo
        self.ubicacion = ubicacion
        self.altura = altura
        self.longitud = longitud
    def expancion(self):
        print("La barrera impide expansión de especies")
    def mostrar(self):
        print(self.tipo, self.ubicacion, self.altura, self.longitud)
p1 = Planta("Kantuta", "Templado", "Viento", "Andina")
p1.mostrar()
p1.crecer()
c1 = Clima("Húmedo", 85, 22, 3000)
c1.mostrar()
c1.crecimiento()
b1 = BarreraGeografica("Montaña", "Cordillera Real", 4500, 120)
b1.mostrar()
b1.expancion()