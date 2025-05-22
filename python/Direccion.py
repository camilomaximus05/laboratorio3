class Direccion:
    def __init__(self, calle="", nomenclatura="", barrio="", ciudad="", edificio="", apto=""):
        self.calle = calle
        self.nomenclatura = nomenclatura
        self.barrio = barrio
        self.ciudad = ciudad
        self.edificio = edificio
        self.apto = apto

    def set_calle(self, calle): self.calle = calle
    def set_nomenclatura(self, nomenclatura): self.nomenclatura = nomenclatura
    def set_barrio(self, barrio): self.barrio = barrio
    def set_ciudad(self, ciudad): self.ciudad = ciudad
    def set_edificio(self, edificio): self.edificio = edificio
    def set_apto(self, apto): self.apto = apto

    def get_calle(self): return self.calle
    def get_nomenclatura(self): return self.nomenclatura
    def get_barrio(self): return self.barrio
    def get_ciudad(self): return self.ciudad
    def get_edificio(self): return self.edificio
    def get_apto(self): return self.apto

    def __str__(self):
        return f"{self.calle} {self.nomenclatura}, {self.barrio}, {self.ciudad}, Ed. {self.edificio}, Apt. {self.apto}"
