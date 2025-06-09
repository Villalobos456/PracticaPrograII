import math
class Vector:
    def __init__(self, x, y, z):
        self.x, self.y, self.z = x, y, z
    def anadir(self, o):
        return Vector(self.x + o.x, self.y + o.y, self.z + o.z)
    def restaVectorial(self, o):
        return Vector(self.x - o.x, self.y - o.y, self.z - o.z)
    def multiplicacionEscalar(self, scalar):
        return Vector(self.x * scalar, self.y * scalar, self.z * scalar)
    def magnitude(self):
        return math.sqrt(self.x ** 2 + self.y ** 2 + self.z ** 2)
    def escalar(self, o):
        return self.x * o.x + self.y * o.y + self.z * o.z
    def cruz(self, o):
        return Vector(
            self.y * o.z - self.z * o.y,
            self.z * o.x - self.x * o.z,
            self.x * o.y - self.y * o.x
        )
    def perpendicular(self, o):
        return self.escalar(o) == 0 
    def paralelo(self, o):
        return self.cruz(o).magnitude() == 0
    def proyeccion(self, o):
        factor = self.escalar(o) / o.escalar(o)
        return o.multiplicacionEscalar(factor)
    def componentes(self, o):
        return self.escalar(o) / o.magnitude()
a = Vector(2, 5, 0)
b = Vector(4, 10, 0)
proyeccion = a.proyeccion(b)
print("Proyección de A sobre B:", "x:", proyeccion.x, " y:", proyeccion.y, " z:", proyeccion.z)
print("Componente de A en B:", a.componentes(b))
print("El escalar es: ", a.escalar(b))
print("El producto vectorial: ", a.cruz(b).x, a.cruz(b).y, a.cruz(b).z)
print("¿Son perpendiculares?", a.perpendicular(b))
print("¿Son paralelos?", a.paralelo(b))
