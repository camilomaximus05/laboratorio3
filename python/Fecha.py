class Fecha:
    def __init__(self, dd=0, mm=0, aa=0):
        self.dd = dd
        self.mm = mm
        self.aa = aa

    def set_dia(self, dd): self.dd = dd
    def set_mes(self, mm): self.mm = mm
    def set_ano(self, aa): self.aa = aa

    def get_dia(self): return self.dd
    def get_mes(self): return self.mm
    def get_ano(self): return self.aa

    def __str__(self):
        return f"{self.dd} - {self.mm} - {self.aa}"
