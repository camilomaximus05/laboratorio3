from Fecha import Fecha
from Direccion import Direccion
from Usuario import Usuario
from Agenda import Agenda

def registrar_usuarios_consola(agenda):
    cantidad = int(input("¿Cuántos usuarios desea registrar por consola? "))
    for i in range(cantidad):
        print(f"\nRegistro del usuario #{i+1}")
        nombre = input("Nombre: ")
        id = int(input("ID: "))
        dd = int(input("Día nacimiento: "))
        mm = int(input("Mes nacimiento: "))
        aa = int(input("Año nacimiento: "))
        ciudad_nac = input("Ciudad nacimiento: ")
        tel = int(input("Teléfono: "))
        email = input("Email: ")

        calle = input("Calle: ")
        nom = input("Nomenclatura: ")
        barrio = input("Barrio: ")
        ciudad = input("Ciudad: ")
        edif = input("Edificio: ")
        apto = input("Apto: ")

        u = Usuario(nombre, id)
        u.set_fecha_nacimiento(Fecha(dd, mm, aa))
        u.set_ciudad_nacimiento(ciudad_nac)
        u.set_tel(tel)
        u.set_email(email)
        u.set_dir(Direccion(calle, nom, barrio, ciudad, edif, apto))

        if agenda.agregar(u):
            print("Usuario registrado correctamente.")
        else:
            print("Error: Usuario ya existe o no hay espacio.")

def main():
    agenda = Agenda(10)

    usuarios = [
        Usuario("Ana", 1001),
        Usuario("Luis", 1002),
        Usuario("Marta", 1003),
        Usuario("Carlos", 1004),
        Usuario("Laura", 1005)
    ]
    fechas = [Fecha(1,1,1990), Fecha(2,2,1992), Fecha(3,3,1993), Fecha(4,4,1994), Fecha(5,5,1995)]
    ciudades = ["Bogotá", "Cali", "Medellín", "Barranquilla", "Cartagena"]
    tels = [1111111, 2222222, 3333333, 4444444, 5555555]
    emails = ["ana@ex.com", "luis@ex.com", "marta@ex.com", "carlos@ex.com", "laura@ex.com"]
    dirs = [
        Direccion("Calle 1", "No 1-1", "Centro", "Bogotá", "Torres", "101"),
        Direccion("Calle 2", "No 2-2", "Sur", "Cali", "Altos", "202"),
        Direccion("Calle 3", "No 3-3", "Norte", "Medellín", "Sol", "303"),
        Direccion("Calle 4", "No 4-4", "Este", "Barranquilla", "Luna", "404"),
        Direccion("Calle 5", "No 5-5", "Oeste", "Cartagena", "Estrella", "505"),
    ]

    for i in range(5):
        usuarios[i].set_fecha_nacimiento(fechas[i])
        usuarios[i].set_ciudad_nacimiento(ciudades[i])
        usuarios[i].set_tel(tels[i])
        usuarios[i].set_email(emails[i])
        usuarios[i].set_dir(dirs[i])
        agenda.agregar(usuarios[i])

    print("\n--- Usuarios registrados desde el código ---")
    agenda.mostrar()
    print("\n--- Mostrar dos usuarios específicos ---")
    agenda.mostrar_usuario(1003)
    agenda.mostrar_usuario(1005)

    
    registrar_usuarios_consola(agenda)

if __name__ == "__main__":
    main()
