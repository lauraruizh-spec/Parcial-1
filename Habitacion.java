package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Habitacion {
    public static void main(String[] args) {

    }

    private int numeroHabitacion;
    private String tipoDeHabitacion;
    private int piso;
    private int capacidadMaximaPersonas;
    private double PrecioNoche;
    private String estadoActual;

    private Hotel ownedByHotel;
    private Huesped[] listaHuesped;

    public Habitacion(int numeroHabitacion, String tipoHabitacion, int piso,
                      int capacidadMaximaPersonas, double precioNoche, String estadoActual) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoDeHabitacion = tipoHabitacion;
        this.piso = piso;
        this.capacidadMaximaPersonas = capacidadMaximaPersonas;
        this.PrecioNoche = precioNoche;
        this.estadoActual = estadoActual;
        this.ownedByHotel = ownedByHotel;

    }

    public int getnumeroHabitaciones() {
        return numeroHabitacion;
    }

    public void setnumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String gettipoHabitacion() {
        return tipoDeHabitacion;
    }

    public void settipoHabitacion(String tipoHabitacion) {
        this.tipoDeHabitacion = tipoHabitacion;
    }

    public int getpiso() {
        return piso;
    }

    public void setpiso(int piso) {
        this.piso = piso;
    }

    public int getcapacidadMaximaPersonas() {
        return capacidadMaximaPersonas;
    }

    public void setcapacidadMaximaPersonas(int capacidadMaximaPersonas) {
        this.capacidadMaximaPersonas = capacidadMaximaPersonas;
    }

    public double getPrecioNoche() {
        return PrecioNoche;
    }

    public void setPrecioNoche(double PrecioNoche) {
        this.PrecioNoche = PrecioNoche;
    }

    public String getestadoActual() {
        return estadoActual;
    }

    public void setestadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Hotel getOwnedByHotel() {
        return ownedByHotel;
    }

    public void setOwnedByHotel(Hotel ownedByHotel) {
        this.ownedByHotel = ownedByHotel;

    }

    @Override
    public String toString() {
        return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", tipoHabitacion=" + tipoDeHabitacion + ", piso="
                + piso + ", capacidadMaximaPersonas=" + capacidadMaximaPersonas + ", PrecioNoche=" + PrecioNoche
                + ", estadoActual=" + estadoActual + ", ownedByHotel=" + ownedByHotel + ", listaHuesped="
                + Arrays.toString(listaHuesped) + "]";
    }



}



