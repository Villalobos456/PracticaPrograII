class Boleto:
    def __init__(self, numero):
        self.numero = numero
        self.precio = 0
    def mostrar(self):
        return "Número: ", self.numero, "Precio: ", self.precio