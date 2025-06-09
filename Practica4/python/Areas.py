import math
class AreaCalculator:
    def areaCirculo(self, r):       
        return math.pi * r ** 2
    def areaRectangulo(self, b, al):
        return b * al
    def areaTriangulo(self, b, al):
        return (b * al) / 2
    def areaTrapecio(self, bma, bme, al):
        return ((bma + bme) * al) / 2
    def areaPentagono(self, p, a):
        return (p * a) / 2
calc = AreaCalculator()
print(calc.areaCirculo(5))
print(calc.areaRectangulo(4, 6))
print(calc.areaTriangulo(3, 8))
print(calc.areaTrapecio(4, 6, 5))
print(calc.areaPentagono(4, 6))