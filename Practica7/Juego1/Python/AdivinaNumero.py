from Juego import Juego
import random
class JuegoAdivinaNumero(Juego):
    def __init__(self):
        super().__init__()
    def juega(self):
        self.reiniciaPartida()
        self.a = random.randint(0, 10)
        print("Escoge un numero entre el 0 y 10, pero ojo, tienes 3 cidas w")
        while True:
            try:
                n = int(input("Mete un número: "))
                if n == self.a:
                    print("boeeeee, le atinaste :) ")
                    self.actualizaRecord()
                    break
                else:
                    if self.quitaVida():
                        if n < self.a:
                            print("tu numero es mas grande")
                        else:
                            print("tu numero es mas peque")
                    else:
                        print("XDD, Perdiste w el numero q te asignaron era", self.a)
                        break
            except:
                print("Viejo, no entiendes, dije del 0 al 10 q es n", n)