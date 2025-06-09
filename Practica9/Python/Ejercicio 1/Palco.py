from Boleto import Boleto
class Palco(Boleto):
    def __init__(self, numero):
        self.numero = numero
        self.precio = 100
    def mostrar(self):
        return "Número: " + str(self.numero) + ", Precio: " + str(self.precio)