package com.juansenen.mypetapp.util;

import com.juansenen.mypetapp.domain.Clientes;
import com.juansenen.mypetapp.domain.Facturas;
import com.juansenen.mypetapp.domain.Mascotas;
import com.juansenen.mypetapp.domain.Recetas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opciones {
    private String seleccion;
    private List<Clientes> clientes;
    private List<Mascotas> mascotas;
    private List<Facturas> facturas;
    private List<Recetas> recetas; //TODO añadir a diagrama de clases
    private Scanner teclado;

    public Opciones() {
        clientes = new ArrayList<>();
        mascotas = new ArrayList<>();
        recetas = new ArrayList<>();
        facturas = new ArrayList<>();
        seleccion = null;
    }

    public void mostrarOpciones() {
        teclado = new Scanner(System.in);

        do {
            System.out.println("----- MENU -----");
            System.out.println("[1] Crear cliente");
            System.out.println("[2] Crear factura");
            System.out.println("[3] Crear receta");
            System.out.println("-----------------");
            System.out.println("[4] Listar cliente");
            System.out.println("[5] Listar factura");
            System.out.println("[6] Listar receta");
            System.out.println("[s] Salir");
            System.out.println("OPCION: ");
            seleccion = teclado.nextLine();

            switch (seleccion) {
                case "1":
                    crearCliente();
                    break;
                case "2":
                    crearFactura();
                    break;
                case "3":
                    crearReceta();
                    break;
                case "4":
                    // TODO añadir metodo listarClientes();
                    break;
                case "5":
                    // TODO Añadir metodo listarFacturas();
                    break;
                case "6":
                    // TODO Añadir metodo listarRecetas();
                    break;
            }

        } while (!seleccion.equalsIgnoreCase("s"));
    }

    public void crearCliente() {

        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellidos: ");
        String apellidos = teclado.next();
        System.out.println("Descuento: ");
        float descuento = Float.parseFloat(teclado.next());

        Clientes cliente = new Clientes(nombre, apellidos, descuento );
        clientes.add(cliente);

        String opcion;
        System.out.println("Quiere añadir una mascota (s/n): ");
        opcion = teclado.next();
        if (opcion.equalsIgnoreCase("s")){
            crearMascota();
        }else{
            System.out.println("CLIENTE AÑADIDO");
        }
    }

    public void crearMascota(){
        do{
            System.out.println("*** AÑADIR MASCOTA ***");
            System.out.println("Especie: ");
            String especie = teclado.next();
            System.out.println("Edad: ");
            int edad = Integer.parseInt(teclado.next());
            System.out.println("Peso: ");
            float peso = Float.parseFloat(teclado.next());
            System.out.println("Sexo: ");
            String sexo = teclado.next();
            System.out.println("Nombre Mascota: ");
            String nomPet = teclado.next();

            Mascotas mascota = new Mascotas(nomPet, peso, edad, especie, sexo);
            mascotas.add(mascota);
            System.out.println("MASCOTA AÑADIDA");

            System.out.println("Quiere añadir otra mascota (s/n): ");
            seleccion = teclado.next();
        }while(seleccion.equalsIgnoreCase("s"));


    }

    public void crearFactura() {
        facturas = new ArrayList<>();

        System.out.println("Concepto: ");
        String concepto = teclado.next();
        System.out.println("Precio: ");
        float precio = Float.parseFloat(teclado.next());
        System.out.println("IVA (decimales): ");
        float iva = Float.parseFloat(teclado.next());
        System.out.println("Pagado (False/True): ");
        boolean pagado = Boolean.parseBoolean(teclado.next());

        Facturas factura = new Facturas(concepto, iva, precio, pagado);
        facturas.add(factura);
    }

    public void crearReceta() {

        System.out.println("Veterinario atendio: ");
        String nomVet = teclado.next();
        System.out.println("Número colegiado: ");
        String numCole = teclado.next();
        System.out.println("Decripcion breve: ");
        String descripcion = teclado.next();
        System.out.println("Fecha (dd/MM/yyyy) : ");
        String fecha = teclado.next();
        System.out.println("Numero de dias medicación: ");
        int dias = Integer.parseInt(teclado.next());
        System.out.println("Medicamento a suministrar: ");
        String medicamento = teclado.next();
        System.out.println("Dosis (decimales): ");
        float dosis = Float.parseFloat(teclado.next());

        Recetas receta = new Recetas(nomVet, numCole, descripcion, fecha, dias, medicamento, dosis);
        recetas.add(receta);
    }

}