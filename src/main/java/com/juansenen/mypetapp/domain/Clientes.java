package com.juansenen.mypetapp.domain;

import java.util.Scanner;

public class Clientes {
    private int idCliente;
    private static int contadorCliente;
    private String nombre;
    private String apellidos;
    private float descuento;

    private Clientes(){
        this.idCliente = ++Clientes.contadorCliente; // Realiza la suma de 1 cada vez que se crea un objeto de Clientes
    }

    public Clientes(String nombre, String apellidos, float descuento) {
        this(); // Llamada a metodo () para llevar contador clientes.
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.descuento = descuento;

    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LISTADO CLIENTES{");
        sb.append("ID CLIENTE=").append(idCliente);
        sb.append(", NOMBRE='").append(nombre).append('\'');
        sb.append(", APELLIDOS='").append(apellidos).append('\'');
        sb.append(", DESCUENTO A APLICAR=").append(descuento);
        sb.append('}');
        return sb.toString();
    }
}
