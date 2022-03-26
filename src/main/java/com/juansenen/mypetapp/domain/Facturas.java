package com.juansenen.mypetapp.domain;

public class Facturas {
    private int idFactura;
    private static int contadorfactura;
    private String concepto;
    private float iva;
    private boolean pagado;
    private float precio;
    private float total;

    public Facturas(){

        idFactura = ++Facturas.contadorfactura; // Realiza la suma de 1 cada vez que se crea un objeto de Facturas
    }

    public Facturas(String concepto, float iva, float precio, boolean pagado) {
        this(); //Llamada a metodo para llevar contador facturas
        this.concepto = concepto;
        this.iva = iva;
        this.pagado = pagado;
        this.precio = precio;
        total = iva*precio;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LISTADO FACTURAS{");
        sb.append("ID FACTURA=").append(idFactura);
        sb.append(", CONCEPTO='").append(concepto).append('\'');
        sb.append(", I.V.A=").append(iva);
        sb.append(", PAGADO=").append(pagado);
        sb.append(", BASE=").append(precio);
        sb.append(", TOTAL=").append(total);
        sb.append('}');
        return sb.toString();
    }
}
