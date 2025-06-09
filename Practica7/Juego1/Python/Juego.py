class Juego:
    def __init__(self):
        self.nroVida = 0
        self.r = 0
    def reiniciaPartida(self):
        self.nroVida = 3
    def actualizaRecord(self):
        self.r += 1
    def quitaVida(self):
        self.nroVida -= 1
        return self.nroVida > 0