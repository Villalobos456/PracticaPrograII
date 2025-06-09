from A import A
from B import B
class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)
    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1
d = D(1, 2, 3)
d.incrementaXYZ()
print("x:", d.x, "y:", d.y, "z:", d.z)