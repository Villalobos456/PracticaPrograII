from Artista import Artista
from Anuncio import Anuncio
from Pintura import Pintura
a1 = Artista("Carlos", "111", 7)
a2 = Artista("Diana", "222", 6)
a3 = Artista("Elena", "333", 4)
a4 = Artista("Hugo", "444", 11)
an1 = Anuncio(1, 1200.0)
an2 = Anuncio(2, 1700.0)
p1 = Pintura("Montaña", "óleo", a1, a2, an1, "realismo")
p2 = Pintura("Mar", "acrílico", a3, a4, an2, "marino")
print("Artistas registradoss:")
for a in [a1, a2, a3, a4]:
    print(f"- {a.nombre} (CI: {a.ci}, Años: {a.años})")
prom = (a1.años + a2.años + a3.años + a4.años) / 4
print(f"\nPromedio de años de experiencia: {prom}")
nombre = input("\nIngrese el nombre del artista para incrementar precio: ")
incremento = float(input("Monto a incrementar: "))
for p in [p1, p2]:
    if p.a1.nombre == nombre or p.a2.nombre == nombre:
        antes = p.anuncio.precio
        p.anuncio.precio += incremento
        print(f"Pintura '{p.titulo}': antes = {antes}, después = {p.anuncio.precio}, diferencia = {p.anuncio.precio - antes}")