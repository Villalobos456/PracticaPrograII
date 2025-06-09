from abc import ABC, abstractmethod

class Figura(ABC):
    def __init__(self, color):
        self.color = color

    def set_color(self, color):
        self.color = color

    def get_color(self):
        return self.color

    def __str__(self):
        return "Color: " + self.color

    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def perimetro(self):
        pass
