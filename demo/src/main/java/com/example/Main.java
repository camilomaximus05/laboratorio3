package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10); 

        
        Usuario u1 = new Usuario("Ana", 1001);
        u1.setFecha_nacimiento(new Fecha(1, 1, 1990));
        u1.setCiudad_nacimiento("Bogotá");
        u1.setTel(1111111);
        u1.setEmail("ana@example.com");
        u1.setDir(new Direccion("Calle 1", "No 1-1", "Centro", "Bogotá", "Torres", "101"));

        Usuario u2 = new Usuario("Luis", 1002);
        u2.setFecha_nacimiento(new Fecha(2, 2, 1992));
        u2.setCiudad_nacimiento("Cali");
        u2.setTel(2222222);
        u2.setEmail("luis@example.com");
        u2.setDir(new Direccion("Calle 2", "No 2-2", "Sur", "Cali", "Altos", "202"));

        Usuario u3 = new Usuario("Marta", 1003);
        u3.setFecha_nacimiento(new Fecha(3, 3, 1993));
        u3.setCiudad_nacimiento("Medellín");
        u3.setTel(3333333);
        u3.setEmail("marta@example.com");
        u3.setDir(new Direccion("Calle 3", "No 3-3", "Norte", "Medellín", "Sol", "303"));

        Usuario u4 = new Usuario("Carlos", 1004);
        u4.setFecha_nacimiento(new Fecha(4, 4, 1994));
        u4.setCiudad_nacimiento("Barranquilla");
        u4.setTel(4444444);
        u4.setEmail("carlos@example.com");
        u4.setDir(new Direccion("Calle 4", "No 4-4", "Este", "Barranquilla", "Luna", "404"));

        Usuario u5 = new Usuario("Laura", 1005);
        u5.setFecha_nacimiento(new Fecha(5, 5, 1995));
        u5.setCiudad_nacimiento("Cartagena");
        u5.setTel(5555555);
        u5.setEmail("laura@example.com");
        u5.setDir(new Direccion("Calle 5", "No 5-5", "Oeste", "Cartagena", "Estrella", "505"));

        
        agenda.agregar(u1);
        agenda.agregar(u2);
        agenda.agregar(u3);
        agenda.agregar(u4);
        agenda.agregar(u5);

        agenda.mostrar();
        agenda.mostrarUsuario(1001);
        agenda.mostrarUsuario(1002);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nRegistro de nuevo usuario:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("ID: ");
        long id = sc.nextLong();
        System.out.print("Día nacimiento: ");
        int dd = sc.nextInt();
        System.out.print("Mes nacimiento: ");
        int mm = sc.nextInt();
        System.out.print("Año nacimiento: ");
        int aa = sc.nextInt();
        sc.nextLine();

        System.out.print("Ciudad de nacimiento: ");
        String ciudad_nac = sc.nextLine();
        System.out.print("Teléfono: ");
        long tel = sc.nextLong();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Calle: ");
        String calle = sc.nextLine();
        System.out.print("Nomenclatura: ");
        String nom = sc.nextLine();
        System.out.print("Barrio: ");
        String barrio = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Edificio: ");
        String edif = sc.nextLine();
        System.out.print("Apto: ");
        String apto = sc.nextLine();

        Usuario nuevo = new Usuario(nombre, id);
        nuevo.setFecha_nacimiento(new Fecha(dd, mm, aa));
        nuevo.setCiudad_nacimiento(ciudad_nac);
        nuevo.setTel(tel);
        nuevo.setEmail(email);
        nuevo.setDir(new Direccion(calle, nom, barrio, ciudad, edif, apto));

        if (agenda.agregar(nuevo)) {
            System.out.println("\n \n Usuario registrado correctamente:");
            agenda.mostrarUsuario((int) id);
        } else {
            System.out.println("Error: Usuario ya existe o no hay espacio.");
        }
    }
}
