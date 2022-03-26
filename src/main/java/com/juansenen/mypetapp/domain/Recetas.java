package com.juansenen.mypetapp.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recetas {
    private String nomVete;
    private String numColegiado;
    private String descripcion;
    private String fecha;
    private int numDias;
    private String medicamento;
    private float dosis;
    private Date fecharec;

    public Recetas(){

    }

    public Recetas(String nomVete, String numColegiado, String descripcion, String fecha, int numDias, String medicamento, float dosis) {
        this.nomVete = nomVete;
        this.numColegiado = numColegiado;
        this.descripcion = descripcion;
        this.fecha = fecha;
        try {
            fecharec = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.numDias = numDias;
        this.medicamento = medicamento;
        this.dosis = dosis;
    }

    public String getNomVete() {
        return nomVete;
    }

    public void setNomVete(String nomVete) {
        this.nomVete = nomVete;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public float getDosis() {
        return dosis;
    }

    public void setDosis(float dosis) {
        this.dosis = dosis;
    }

    public Date getFecharec() {
        return fecharec;
    }

    public void setFecharec(Date fecharec) {
        this.fecharec = fecharec;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LISTADO RECETAS{");
        sb.append("NOMBRE VETERINARIO='").append(nomVete).append('\'');
        sb.append(", Nª COLEGIADO='").append(numColegiado).append('\'');
        sb.append(", DESCRIPCION='").append(descripcion).append('\'');
        sb.append(", FECHA='").append(fecha).append('\'');
        sb.append(", DIAS TRATAMIENTO=").append(numDias);
        sb.append(", MEDICAMENTO=").append(medicamento).append('\'');
        sb.append(", DOSIS=").append(dosis);
        sb.append(", FECHA RECETA=").append(fecharec);
        sb.append('}');
        return sb.toString();
    }
}
