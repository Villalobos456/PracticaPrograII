from Figura import Figura
from Coloreado import Coloreado
class Cuadrado(Figura, Coloreado):
    def __init__(self, lado, color):
        super().__init__(color)
        self.lado = lado

    def area(self):
        return self.lado * self.lado

    def perimetro(self):
        return 4 * self.lado

    def como_colorear(self):
        return "Colorear los cuatro lados"

    def __str__(self):
        return "Cuadrado - " + super().__str__() + \
               ", Área: " + repr(self.area()) + \
               ", Perímetro: " + repr(self.perimetro()) + \
               ", " + self.como_colorear()
