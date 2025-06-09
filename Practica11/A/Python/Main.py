from Artista import Artista
from Anuncio import Anuncio
from Pintura import Pintura
a1 = Artista("Luis", "123", 10)
a2 = Artista("Ana", "456", 5)
an1 = Anuncio(1, 1000.0)
p1 = Pintura("Atardecer", "óleo", a1, a2, an1, "paisaje")
a3 = Artista("Mario", "789", 8)
a4 = Artista("Lucía", "321", 12)
p2 = Pintura("Aurora", "acrílico", a3, a4, None, "abstracto")
print("Artistas registrados:")
for artista in [a1, a2, a3, a4]:
    print(f"- {artista.nombre} (CI: {artista.ci}, Años: {artista.añosExp})")
mayor = max([a1, a2, a3, a4], key=lambda x: x.añosExp)
print(f"\nArtista con más experiencia: {mayor.nombre}")
p2.anuncio = Anuncio(2, 1500.0)
total = p1.anuncio.precio + p2.anuncio.precio
print(f"\nMonto total de venta: {total}")
