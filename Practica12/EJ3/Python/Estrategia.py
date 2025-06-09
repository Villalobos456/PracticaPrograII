class Estrategia:
    def ejecutar(self):
        pass
class EstrategiaA(Estrategia):
    def ejecutar(self):
        print("Estrategia A ejecutada.")
class EstrategiaB(Estrategia):
    def ejecutar(self):
        print("Estrategia B ejecutada.")
class Contexto:
    def __init__(self, estrategia: Estrategia):
        self.estrategia = estrategia
    def setEstrategia(self, estrategia: Estrategia):
        self.estrategia = estrategia
    def ejecuta(self):
        self.estrategia.ejecutar()
c = Contexto(EstrategiaA())
c.ejecuta()
c.setEstrategia(EstrategiaB())
c.ejecuta()
