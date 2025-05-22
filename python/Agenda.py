class Agenda:
    def __init__(self, capacidad):
        self.registro = [None] * capacidad
        self.no_reg = 0

    def buscar(self, id):
        for i in range(self.no_reg):
            if self.registro[i].get_id() == id:
                return i
        return -1

    def agregar(self, usuario):
        if self.buscar(usuario.get_id()) != -1 or self.no_reg >= len(self.registro):
            return False
        self.registro[self.no_reg] = usuario
        self.no_reg += 1
        return True

    def eliminar(self, id):
        pos = self.buscar(id)
        if pos == -1:
            return False
        for i in range(pos, self.no_reg - 1):
            self.registro[i] = self.registro[i + 1]
        self.registro[self.no_reg - 1] = None
        self.no_reg -= 1
        return True

    def mostrar(self):
        for i in range(self.no_reg):
            print(f"Nombre: {self.registro[i].get_nombre()} | ID: {self.registro[i].get_id()}")

    def mostrar_usuario(self, id):
        pos = self.buscar(id)
        if pos != -1:
            print(self.registro[pos])
        else:
            print("Usuario no encontrado.")
