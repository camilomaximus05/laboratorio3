package com.example;

public class Usuario {
    private String nombre, ciudad_nacimiento, email;
    private long id, tel;
    private Fecha fecha_nacimiento;
    private Direccion dir;

    public Usuario() {}
    public Usuario(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    public void setNombre(String n) { nombre = n; }
    public void setId(long id) { this.id = id; }
    public void setFecha_nacimiento(Fecha f) { this.fecha_nacimiento = f; }
    public void setCiudad_nacimiento(String c) { ciudad_nacimiento = c; }
    public void setTel(long t) { tel = t; }
    public void setEmail(String e) { email = e; }
    public void setDir(Direccion d) { dir = d; }

    public String getNombre() { return nombre; }
    public long getId() { return id; }
    public Fecha getFecha_nacimiento() { return fecha_nacimiento; }
    public String getCiudad_nacimiento() { return ciudad_nacimiento; }
    public long getTel() { return tel; }
    public String getEmail() { return email; }
    public Direccion getDir() { return dir; }

    public String toString() {
        return "Nombre: " + nombre + "\nID: " + id + "\nNacimiento: " + fecha_nacimiento +
               "\nCiudad Nac: " + ciudad_nacimiento + "\nTel: " + tel + "\nEmail: " + email +
               "\nDireccion: " + dir;
    }
}
