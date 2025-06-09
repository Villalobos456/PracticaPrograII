import math
from Figura import Figura
class Circulo(Figura):
    def __init__(self, radio, color):
        super().__init__(color)
        self.radio = radio

    def area(self):
        return math.pi * self.radio * self.radio

    def perimetro(self):
        return 2 * math.pi * self.radio

    def __str__(self):
        return "Círculo - " + super().__str__() + \
               ", Área: " + repr(self.area()) + \
               ", Perímetro: " + repr(self.perimetro())
