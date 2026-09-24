package co.edu.uniquindio.poo.model;

public class Reserva {
    public static void main(String[] args) {

    }
    private String codigo;
    private String fecha;
    private int noches;
    private int cantidadHuespedes;
    private String estadoReserva;
    private String metodoPago;
    private double valorTotal;



    public Reserva (String codigo, String fecha, int noches, int cantidadHuespedes, String estadoReserva, String pago, double valorTotal){
        this.codigo = codigo;
        this.fecha= fecha;
        this.noches = noches;
        this.cantidadHuespedes = cantidadHuespedes;
        this.estadoReserva = estadoReserva;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;

    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public int getNoches() {
        return noches;
    }


    public void setNoches(byte noches) {
        this.noches = noches;
    }


    public int getCantidadHuespedes() {
        return cantidadHuespedes;
    }


    public void setCantidadHuespedes(byte cantidadHuespedes) {
        this.cantidadHuespedes = cantidadHuespedes;
    }


    public String getEstadoReserva() {
        return estadoReserva;
    }


    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }


    public String getMetodoPago() {
        return metodoPago;
    }


    public void setPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Reserva [codigo=" + codigo + ", fecha=" + fecha + ", noches=" + noches + ", cantidadHuespedes="
                + cantidadHuespedes + ", estadoReserva=" + estadoReserva + ", pago=" + metodoPago;
    }

}
