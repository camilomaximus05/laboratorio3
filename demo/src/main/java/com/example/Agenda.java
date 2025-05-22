package com.example;

public class Agenda {
    private Usuario[] registro;
    private int no_reg;

    public Agenda(int capacity) {
        registro = new Usuario[capacity];
        no_reg = 0;
    }

    public boolean agregar(Usuario u) {
        if (buscar((int)u.getId()) != -1 || no_reg >= registro.length) return false;
        registro[no_reg++] = u;
        return true;
    }

    public int buscar(int id) {
        for (int i = 0; i < no_reg; i++) {
            if (registro[i].getId() == id) return i;
        }
        return -1;
    }

    public boolean eliminar(int id) {
        int pos = buscar(id);
        if (pos == -1) return false;
        for (int i = pos; i < no_reg - 1; i++) {
            registro[i] = registro[i + 1];
        }
        registro[--no_reg] = null;
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < no_reg; i++) {
            System.out.println("Nombre: " + registro[i].getNombre() + " | ID: " + registro[i].getId());
        }
    }

    public void mostrarUsuario(int id) {
        int pos = buscar(id);
        if (pos != -1)
            System.out.println(registro[pos]);
        else
            System.out.println("Usuario no encontrado.");
    }
}

