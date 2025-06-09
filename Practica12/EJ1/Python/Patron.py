class Singleton:
    _instancia = None
    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
        return cls._instancia
    def operacion(self):
        print("Ejecutando operación del Singleton.")
s1 = Singleton()
s2 = Singleton()
s1.operacion()
print(s1 is s2)
