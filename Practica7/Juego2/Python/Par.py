from AdivinaNumero import AdivinaNumero
class Par(AdivinaNumero):
    def validaNumero(self, n):
        if 0 <= n <= 10 and n % 2 == 0:
            return True
        print("solo par bro")
        return False