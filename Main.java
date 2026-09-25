package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Habitacion;
import co.edu.uniquindio.poo.model.Huesped;
import co.edu.uniquindio.poo.model.Reserva;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Huesped[] huespedes = new Huesped[30];
        Habitacion[] habitaciones = new Habitacion[20];
        Reserva[] reservas = new Reserva[10];
        int contadorHuespedes = 0;
        int contadorHabitaciones = 0;
        int contadorReservas = 0;
        int disponibles = 15;
        int ocupadas = 0;
        double precioNoche = 0;
        double valorNocheSuite= 500000;
        double valorNocheDoble= 250000;
        double valorNocheIndividual= 100000;
        int opcion;
        //Laura Ruiz
            String[] opciones = {
                    "1. Registrar huesped",
                    "2. Registrar habitacion",
                    "3. Registrar reserva",
                    "4. Número especial de reserva",
                    "5. Control de disponibilidad de habitaciones",
                    "6. Matriz de ocupacion del hotel",
                    "7. Consultar huesped",
                    "8. Ingresos del hotel",
                    "9. Saber mas de nosotros"};
            do {
                String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción que desea ejecutar:", "--- Bienvenido al Hotel StayPlus ---",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
                );
                if (seleccion != null) {
                    opcion = Character.getNumericValue(seleccion.charAt(0));
                } else {
                    opcion = 9;
                }
            switch (opcion) {
                    //Laura Zapata
                case 1:
                    int numeroHuespedes = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el numero de huespedes que se van a hospedar: "));
                    for (int i = 0; i < numeroHuespedes; i++) {
                        String documentoIdentidad = JOptionPane.showInputDialog(null, "Ingrese su documento de identidad: ");
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo:");
                        int edad = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese su edad: "));
                        String telefono = JOptionPane.showInputDialog(null, "Ingrese su numero telefonico: ");
                        String ciudad = JOptionPane.showInputDialog(null, "Ingrese su ciudad de procedencia");
                        Huesped huesped = new Huesped(documentoIdentidad, nombre, edad, telefono, ciudad);
                        huespedes[contadorHuespedes] = huesped;
                        contadorHuespedes++;
                    }
                    JOptionPane.showMessageDialog(null, "Gracias por registrarse");
                    break;

                case 2:
                    //Laura Ruiz
                    JOptionPane.showMessageDialog(null,  " HABITACIONES DISPONIBLES\n" + "\n" + "SUITE:\n" + "Habitación 101 - Piso 1\n" +
                            "Habitación 201 - Piso 2\n" + "Habitación 301 - Piso 3\n" + "\n" + "DOBLES:\n" + "Habitación 102 - Piso 1\n" + "Habitación 202 - Piso 2\n" +
                            "Habitación 302 - Piso 3\n" + "Habitación 401 - Piso 4\n" + "\n" + "INDIVIDUALES:\n" + "Habitación 103 - Piso 1\n" + "Habitación 203 - Piso 2\n" +
                            "Habitación 402 - Piso 4\n");
                    int cantidadHabitaciones = Integer.valueOf(JOptionPane.showInputDialog(null, "¿Cuántas habitaciones desea registrar?"));
                    for (int i = 0; i < cantidadHabitaciones; i++) {
                        int numeroHabitacion = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el numero de la habitacion: "));
                        String tipoDehabitacion = JOptionPane.showInputDialog(null, "Ingrese el tipo de habitacion (Individual, Doble o Suite):");
                        int piso = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el piso en el que esta ubicada la habitacion: "));
                        int capacidadMaximaDePersonas = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas por habitacion: \n"+ "Individual: 2 personas \n"+ "Doble: 4 personas \n"+
                                "Suite: 6 personas"));
                        if(tipoDehabitacion.equalsIgnoreCase("Suite")) {
                             JOptionPane.showMessageDialog(null, "el precio por noche es: $"+ valorNocheSuite+"\n"+ "Capacidad maxima de personas en la habitacion: 6 personas");
                        }else if(tipoDehabitacion.equalsIgnoreCase("Doble")){
                            JOptionPane.showMessageDialog(null, "el precio por noche es: $"+ valorNocheDoble+"\n"+ "Capacidad maxima de personas en la habitacion: 4 personas");
                        } else if (tipoDehabitacion.equalsIgnoreCase("Individual")) {
                            JOptionPane.showMessageDialog(null, "el precio por noche es: $"+ valorNocheIndividual+"\n"+ "Capacidad maxima de personas en la habitacion: 2 personas");
                        }
                        String estadoActual= "disponible";
                        Habitacion habitacion = new Habitacion(numeroHabitacion, tipoDehabitacion, piso, capacidadMaximaDePersonas, precioNoche, estadoActual);
                        habitaciones[contadorHabitaciones] = habitacion;
                        contadorHabitaciones++;
                        ocupadas++;
                        disponibles--;
                    }
                    JOptionPane.showMessageDialog(null, "El estado de su habitacion es reservado hasta que se confirme su pago");
                    String estadoActual= "Reservado";
                    JOptionPane.showMessageDialog(null, "Gracias por registrarse");
                    break;
                case 3:
                    //Laura Zapata
                    String telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono del huésped:");
                    for (int i = 0; i < contadorHuespedes; i++) {
                        if (huespedes[i].getTelefono().equals(telefono)) {
                            String codigo = JOptionPane.showInputDialog(null, "Ingrese el código de reserva(4 digitos):");
                            String fecha = JOptionPane.showInputDialog(null, "Ingrese fecha de reserva:");
                            int numeroNoches = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese numero de noches:"));
                            int cantidadHuespedes = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese la cantidad de huéspedes:"));
                            int cantidadHabitacion = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese la cantidad de habitaciones:"));
                            String tipoDehabitacion = JOptionPane.showInputDialog(null, "Ingrese el tipo de habitacion (Individual, Doble o Suite):");
                            double valorTotal=0;
                            if(tipoDehabitacion.equalsIgnoreCase("Suite")) {
                                valorTotal= valorNocheSuite*numeroNoches*cantidadHabitacion;
                            }else if(tipoDehabitacion.equalsIgnoreCase("Doble")){
                                valorTotal= valorNocheDoble*numeroNoches*cantidadHabitacion;
                            } else if (tipoDehabitacion.equalsIgnoreCase("Individual")) {
                                valorTotal= valorNocheIndividual*numeroNoches*cantidadHabitacion;
                            }
                            String estadoReserva = JOptionPane.showInputDialog(null, "Ingrese el estado de la reserva(Disponible, Reservada u Ocupada):");
                            String metodoPago = JOptionPane.showInputDialog(null, "Ingrese el método de pago(Efectivo, Tarjeta o Transferencia bancaria):");
                            Reserva reserva = new Reserva(codigo, fecha, numeroNoches, cantidadHuespedes, estadoReserva, metodoPago, valorTotal);
                            reservas[contadorReservas] = reserva;
                            contadorReservas++;
                            huespedes[i].agregarReserva(reserva);
                            JOptionPane.showMessageDialog(null, "Reserva registrada correctamente\n" + "Valor total de reserva: $" + valorTotal);
                        }
                    }
                    break;
                case 4:
                    //Laura Ruiz
                    String codigoReserva = JOptionPane.showInputDialog("Ingrese el codigo de la reserva");
                    String invertido = "";
                    for (int i = codigoReserva.length() - 1; i >= 0; i--) {
                        invertido = invertido + codigoReserva.charAt(i);
                    }
                    if (codigoReserva.equals(invertido)) {
                        JOptionPane.showMessageDialog(null, "La Reserva" + codigoReserva + "es ESPECIAL");
                    } else {
                        JOptionPane.showMessageDialog(null, "La Reserva" + codigoReserva + "NO es especial");
                    }
                    break;
                case 5:
                    //Laura Zapata
                    int mantenimiento = 0;
                    if (contadorHabitaciones == 0) {
                        JOptionPane.showMessageDialog(null, "No hay habitaciones registradas.");
                    } else {
                        Habitacion habitacionMayorPrecio = habitaciones[0];
                        Habitacion habitacionMenorPrecio = habitaciones[0];
                        for (int i = 0; i < contadorHabitaciones; i++) {
                            String estado = habitaciones[i].getestadoActual();
                            if (estado.equalsIgnoreCase("Disponible")) {
                                disponibles++;
                            }
                            else if (estado.equalsIgnoreCase("Ocupada")) {
                                ocupadas++;
                            }
                            else if (estado.equalsIgnoreCase("Mantenimiento")) {
                                mantenimiento++;
                            }
                            if (habitaciones[i].getvalorTotal() > habitacionMayorPrecio.getvalorTotal()) {
                                habitacionMayorPrecio = habitaciones[i];
                            }
                            if (habitaciones[i].getvalorTotal() < habitacionMenorPrecio.getvalorTotal()) {
                                habitacionMenorPrecio = habitaciones[i];
                            }
                        }
                        JOptionPane.showMessageDialog(null, "===== DISPONIBILIDAD DEL HOTEL =====\n" + "Habitaciones disponibles: " + disponibles +
                                        "\nHabitaciones ocupadas: " + ocupadas + "\nHabitaciones en mantenimiento: " + mantenimiento +
                                        "\n===== PRECIOS =====" + "\nHabitación con mayor precio: " + habitacionMayorPrecio.getnumeroHabitaciones() + "\nPrecio: $" +
                                        valorNocheSuite + "\nHabitación con menor precio: " + habitacionMenorPrecio.getnumeroHabitaciones() + "\nPrecio: $" +
                                        valorNocheIndividual);
                    }
                    break;

                case 6:
                    //Laura Ruiz
                    String[] dias ={"Lunes","Martes","Miercoles","Jueves","Viernes"};
                    String [][] ocupacion={
                            {"O", "O", "D", "O", "O", "O", "D"},
                            {"D", "O", "O", "D", "O", "O", "O"},
                            {"O", "D", "O", "O", "D", "O", "D"},
                            {"O", "O", "D", "D", "O", "O", "D"},
                            {"D", "O", "D", "O", "O", "D", "O"},
                    };
                    int totalocupadas= 0;
                    int mayor=-1;
                    int menor = 999;
                    String diaMayorOcupacion ="";
                    String diaMenorOcupacion ="";

                    for(int d= 0; d< dias.length; d++){
                        int habitacionesOcupadasHoy =0;

                        for (int h=0; h< ocupacion.length;h++) {
                            if (ocupacion[d][h].equalsIgnoreCase("O")) {
                                totalocupadas++;
                                habitacionesOcupadasHoy++;
                            }
                        }
                        if(habitacionesOcupadasHoy> mayor) {
                            mayor = habitacionesOcupadasHoy;
                            diaMayorOcupacion = dias[d];
                        }
                        if(habitacionesOcupadasHoy < menor) {
                            menor = habitacionesOcupadasHoy;
                            diaMenorOcupacion = dias[d];
                        }

                    }
                    String mensaje = "=== ANÁLISIS DE OCUPACIÓN SEMANAL ===\n\n"
                            +"Día con MAYOR ocupación: " + diaMayorOcupacion + " (" + mayor + " habitaciones)\n"
                            +"Día con MENOR ocupación: " + diaMenorOcupacion + " (" + menor + " habitaciones)\n"
                            +" Total de habitaciones ocupadas en la semana:"+ totalocupadas;
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;
                case 7:
                    //Laura Zapata
                    String telefonoBuscar= JOptionPane.showInputDialog("Ingrese el telefono del huesped: ");
                    for(int i=0; i < contadorHuespedes;i++){
                        if(huespedes[i].getTelefono().equals(telefonoBuscar)){
                            JOptionPane.showMessageDialog(null,"===== INFORMACIÓN DEL HUÉSPED =====\n" +
                                    "Documento: " + huespedes[i].getDocumentoIdentidad() + "\nNombre: " + huespedes[i].getNombreCompleto() + "\nEdad: " + huespedes[i].getEdad() +
                                    "\nTeléfono: " + huespedes[i].getTelefono() + "\nCiudad: " + huespedes[i].getCiudadProcedencia()+ "\n Reservas confirmadas: "+ contadorReservas
                            );
                        }
                    }

                    break;
                case 8:
                    //Laura ruiz
                    String nombreHotel = JOptionPane.showInputDialog("Ingrese el Nombre del hotel:");
                    String nit = JOptionPane.showInputDialog("Ingrese el NIT del hotel:");

                    String buscarFecha = JOptionPane.showInputDialog("Ingrese la fecha a consultar");
                    double ingresoTotal =0;
                    int reservasEncontradas=0;

                        for(int i=0; i < contadorReservas; i++){
                            if(reservas[i].getFecha().equals(buscarFecha)){
                                ingresoTotal=ingresoTotal + reservas[i].getValorTotal();
                                reservasEncontradas++;
                            }
                    }
                        JOptionPane.showMessageDialog(null,"===== INFORMACION DEL HOTEL =====\n" +
                                "Hotel:" +nombreHotel + "\n" +
                                "NIT:" + nit + "\n\n" +
                                "===== INGRESOS DEL DIA =====\n" +
                                "Fecha ingresada" + buscarFecha + "\n"+
                                "Reservas encontradas" + reservasEncontradas + "\n" +
                                "Ingreso total generado: $"+ ingresoTotal
                        );
                        break;
                case 9:
                    //Laura Zapata

                    JOptionPane.showMessageDialog(null, "el nombre de nuestro hotel es: StayPlus \n"+ "Nuestro NIT es: 808342-3 \n" +
                            "Nos encuentras en: carrera 14 #54- norte 10 Hotel StayPlus \n" + "Para saber mas informacion escribenos por este numero: 3013232144");
                    break;


                default:
                    JOptionPane.showMessageDialog(null, "La opcion ingresada no se encuentra en el sistema");
                    break;
            }
        } while (opcion != 9);
    }
}





