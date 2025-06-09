class Adaptee:
    def inconpatible(self):
        print("Método del Adaptee")
class Objetivo:
    def metodo(self):
        pass
class Adaptador(Objetivo):
    def __init__(self, adaptee):
        self.adaptee = adaptee

    def metodo(self):
        self.adaptee.inconpatible()
adaptee = Adaptee()
adaptador = Adaptador(adaptee)
adaptador.metodo()
