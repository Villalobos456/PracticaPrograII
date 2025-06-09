import random
from Juego import Juego
class AdivinaNumero(Juego):
    def __init__(self):
        super().__init__()
    def validaNumero(self, n):
        return 0 <= n <= 10
    def juega(self):
        self.reiniciaPartida()
        self.adivina = random.randint(0, 10)
        print("Adivina el numero, solo es del 0-10")
        while True:
            entrada = input("n: ")
            if not entrada.isdigit():
                print("solo enteros pana")
                continue

            n = int(entrada)

            if not self.validaNumero(n):
                print("crj solo del 0-10")
                continue

            if n == self.adivina:
                print("boeee, acertaste bro")
                self.actualizaRecord()
                break
            else:
                if self.quitaVida():
                    if n < self.adivina:
                        print("es mas grande")
                    else:
                        print("es mas peque")
                else:
                    print("WUAJAJAJ, perdiste 😂😂")
                    break