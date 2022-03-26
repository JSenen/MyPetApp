package com.juansenen.mypetapp.domain;

public class Mascotas {
    private String nombrePet;
    private float peso;
    private int edad;
    private String especie;
    private String sexo;
    private int idMascota;
    private static int contadorMascotas;

    public Mascotas(){
        idMascota = ++Mascotas.contadorMascotas;
    }

    public Mascotas(String nombrePet, float peso, int edad, String especie, String sexo) {
        this(); //Sumamos id Mascota
        this.nombrePet = nombrePet;
        this.peso = peso;
        this.edad = edad;
        this.especie = especie;
        this.sexo = sexo;
    }

    public String getNombrePet() {
        return nombrePet;
    }

    public void setNombrePet(String nombrePet) {
        this.nombrePet = nombrePet;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" LISTADO MASCOTAS{");
        sb.append("NOMBRE MASCOTA='").append(nombrePet).append('\'');
        sb.append(", PESO=").append(peso);
        sb.append(", EDAD=").append(edad);
        sb.append(", ESPECIE='").append(especie).append('\'');
        sb.append(", SEXO='").append(sexo).append('\'');
        sb.append(", ID MASCOTA=").append(idMascota);
        sb.append('}');
        return sb.toString();
    }
}
