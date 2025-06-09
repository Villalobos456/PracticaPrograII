from AdivinaNumero import AdivinaNumero
class Impar(AdivinaNumero):
    def validaNumero(self, n):
        if 0 <= n <= 10 and n % 2 == 1:
            return True
        print("solo impar bro")
        return False