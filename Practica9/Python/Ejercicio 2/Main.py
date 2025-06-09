import tkinter as tk
import random
from Coloreado import Coloreado
from Cuadrado import Cuadrado
from Circulo import Circulo
def generar_figuras():
    c = ["Rojo", "Azul", "Verde", "Amarillo", "Naranja"]
    f = []
    for i in range(5):
        tipo = random.randint(1, 2)
        color = random.choice(c)
        if tipo == 1:
            lado = random.randint(1, 10)
            f.append(Cuadrado(lado, color))
        else:
            radio = random.randint(1, 10)
            f.append(Circulo(radio, color))
    s = ""
    for f in f:
        s += f.__str__() + "\n"
        if isinstance(f, Coloreado):
            s += f.como_colorear() + "\n"
        s += "------------------------------------------------------------------------------\n"
    r.config(text=s)
v = tk.Tk()
v.title("Figuras Geométricas")
tk.Label(v, text="⚪FIGURA⬜", font=("Arial", 16, "bold")).pack(pady=10)
tk.Button(v, text="Generar", command=generar_figuras).pack(pady=5)
r = tk.Label(v, text="", justify="left", font=("Courier", 10))
r.pack(padx=10, pady=10)
tk.Button(v, text="Salir", command=v.destroy).pack(pady=5)
v.mainloop()