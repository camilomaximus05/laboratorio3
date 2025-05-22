class Usuario:
    def __init__(self, nombre="", id=0):
        self.nombre = nombre
        self.id = id
        self.fecha_nacimiento = None
        self.ciudad_nacimiento = ""
        self.tel = 0
        self.email = ""
        self.dir = None

    def set_nombre(self, n): self.nombre = n
    def set_id(self, id): self.id = id
    def set_fecha_nacimiento(self, f): self.fecha_nacimiento = f
    def set_ciudad_nacimiento(self, c): self.ciudad_nacimiento = c
    def set_tel(self, t): self.tel = t
    def set_email(self, e): self.email = e
    def set_dir(self, d): self.dir = d

    def get_nombre(self): return self.nombre
    def get_id(self): return self.id
    def get_fecha_nacimiento(self): return self.fecha_nacimiento
    def get_ciudad_nacimiento(self): return self.ciudad_nacimiento
    def get_tel(self): return self.tel
    def get_email(self): return self.email
    def get_dir(self): return self.dir

    def __str__(self):
        return (
            f"Nombre: {self.nombre}\n"
            f"ID: {self.id}\n"
            f"Nacimiento: {self.fecha_nacimiento}\n"
            f"Ciudad Nac: {self.ciudad_nacimiento}\n"
            f"Tel: {self.tel}\n"
            f"Email: {self.email}\n"
            f"Direccion: {self.dir}"
        )
