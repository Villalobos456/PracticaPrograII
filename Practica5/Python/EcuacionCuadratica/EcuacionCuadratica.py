import math
class Cuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c
    def get_discriminante(self):
        return self.b ** 2 - 4 * self.a * self.c
    def get_raiz1(self):
        di = self.get_discriminante()
        return (-self.b + math.sqrt(di)) / (2 * self.a)
    def get_raiz2(self):
        di = self.get_discriminante()
        return (-self.b - math.sqrt(di)) / (2 * self.a)
    def resolver(self):
        di = self.get_discriminante()
        if di > 0:
            print(f"tiene 2 raices {self.get_raiz1()} y {self.get_raiz2()}")
        elif di == 0:
            print(f"tiene 1 raiz {self.get_raiz1()}")
        else:
            print("no tiene raiz XD")
            