from Boleto import Boleto
class Platea(Boleto):
    def __init__(self, numero, dias):
        self.numero = numero
        self.precio = 50 if dias > 10 else 60
    def mostrar(self):
        return "Número: " + str(self.numero) + ", Precio: " + str(self.precio)
