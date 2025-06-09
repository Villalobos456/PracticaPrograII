import tkinter as tk
from tkinter import messagebox
from Galeria import Galeria
from Palco import Palco
from Platea import Platea
def vender():
    tipo = s.get()
    if tipo == "ninguno":
        messagebox.showerror("Error", "Seleccione un tipo de boleto")
        return
    nt = num.get()
    dt = ed.get()
    if not nt.isdigit() or (tipo != "Palco" and not dt.isdigit()):
        messagebox.showerror("Error", "Ingrese valores numéricos válidos")
        return
    n = int(nt)
    dias = int(dt) if tipo != "Palco" else 0
    if tipo == "Palco":
        boleto = Palco(n)
    elif tipo == "Platea":
        boleto = Platea(n, dias)
    elif tipo == "Galeria":
        boleto = Galeria(n, dias)
    er["text"] = boleto.mostrar()
def salir():
    v.destroy()
def actualizar():
    tipo = s.get()
    if tipo == "Palco":
        ed.configure(state="disabled")
    else:
        ed.configure(state="normal")

    num.configure(state="normal")
    vender_btn.configure(state="normal")
v = tk.Tk()
v.title("Teatro Municipal")
tk.Label(v, text="TEATRO MUNICIPAL", font=("Arial", 16, "bold")).grid(row=0, column=0, columnspan=3, pady=10)
tk.Label(v, text="Tipo de Boleto:").grid(row=1, column=0, columnspan=3)
s = tk.StringVar(value="ninguno")
tk.Radiobutton(v, text="Palco", variable=s, value="Palco", command=actualizar).grid(row=2, column=0)
tk.Radiobutton(v, text="Platea", variable=s, value="Platea", command=actualizar).grid(row=2, column=1)
tk.Radiobutton(v, text="Galeria", variable=s, value="Galeria", command=actualizar).grid(row=2, column=2)
tk.Label(v, text="Número de Boleto:").grid(row=3, column=0)
num = tk.Entry(v, state="disabled")
num.grid(row=3, column=1)
tk.Label(v, text="Días antes del evento:").grid(row=4, column=0)
ed = tk.Entry(v, state="disabled")
ed.grid(row=4, column=1)
vender_btn = tk.Button(v, text="Vender", command=vender, state="disabled")
vender_btn.grid(row=5, column=0, pady=10)
tk.Button(v, text="Salir", command=salir).grid(row=5, column=1)
er = tk.Label(v, text="Información:", width=40, height=4, anchor="w", justify="left",
              bg="white", relief="solid", font=("Arial", 10))
er.grid(row=6, column=0, columnspan=3, padx=10, pady=10)
v.mainloop()
