from Estadistica import Estadistica
n = list(map(float, input("Meta 10 numeros").split()))
if len(n) != 10:
    print("Solo 10")
else:
    e = Estadistica(n)
    e.mostrar_resultados()
    