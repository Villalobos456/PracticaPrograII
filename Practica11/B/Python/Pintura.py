from Obra import Obra
class Pintura(Obra):
    def __init__(self, titulo, material, a1, a2, anuncio, genero):
        super().__init__(titulo, material, a1, a2, anuncio)
        self.genero = genero