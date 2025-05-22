package com.example;

public class Direccion {
    private String calle, nomenclatura, barrio, ciudad, edificio, apto;

    public Direccion() {}
    public Direccion(String calle, String nomenclatura, String barrio, String ciudad, String edificio, String apto) {
        this.calle = calle;
        this.nomenclatura = nomenclatura;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.edificio = edificio;
        this.apto = apto;
    }

    public void setCalle(String c) { calle = c; }
    public void setNomenclatura(String n) { nomenclatura = n; }
    public void setBarrio(String b) { barrio = b; }
    public void setCiudad(String ci) { ciudad = ci; }
    public void setEdificio(String e) { edificio = e; }
    public void setApto(String a) { apto = a; }

    public String getCalle() { return calle; }
    public String getNomenclatura() { return nomenclatura; }
    public String getBarrio() { return barrio; }
    public String getCiudad() { return ciudad; }
    public String getEdificio() { return edificio; }
    public String getApto() { return apto; }

    public String toString() {
        return calle + " " + nomenclatura + ", " + barrio + ", " + ciudad + ", Ed. " + edificio + ", Apt. " + apto;
    }
}

