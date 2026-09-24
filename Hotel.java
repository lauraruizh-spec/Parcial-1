package co.edu.uniquindio.poo.model;

public class Hotel {
    public static void main(String []args){

    }
    private Huesped[] listaHuespedes;
    private Habitacion[] habitaciones;
    private Reserva[] reservas;
    private String[][] matrizOcupacion;
    private String nombreComercial;
    private String nit ;
    private String direccion;
    private String telefono;


    public Hotel(String nombreComercial,String nit,String direccion,String telefono){
        this.nombreComercial =  nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public String getNombreComercial() {
        return nombreComercial;
    }


    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }


    public String getNit() {
        return nit;
    }


    public void setNit(String nit) {
        this.nit = nit;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Hotel [nombreComercial=" + nombreComercial + ", nit=" + nit + ", direccion=" + direccion + ", telefono="
                + telefono + "]";
    }
}
