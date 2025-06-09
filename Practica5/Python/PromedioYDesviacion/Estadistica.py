import math
class Estadistica:
    def __init__(self, n):
        self.n = n
    def calcular_promedio(self):
        return sum(self.n) / len(self.n)
    def calcular_desviacion(self):
        p = self.calcular_promedio()
        return math.sqrt(sum((x - p) ** 2 for x in self.n) / (len(self.n) - 1))
    def mostrar_resultados(self):
        p = self.calcular_promedio()
        d = self.calcular_desviacion()
        print(f"El promedio es {p:.2f}")
        print(f"La desviación estándar es {d:.5f}")