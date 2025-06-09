from Boleto import Boleto
class Galeria(Boleto):
    def __init__(self, numero, dias):
        super().__init__(numero)
        self.numero = numero
        self.precio = 25.0 if dias >= 10 else 30.0
    def mostrar(self):
        return "Número: " + str(self.numero) + ", Precio: " + str(self.precio)
