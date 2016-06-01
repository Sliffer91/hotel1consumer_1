/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel1consumer;

/**
 *
 * @author Sliffer
 */
public class Hotel1WSConsumer {

    public static java.util.List<hotel1consumer.Habitacion> buscarHabitacionesEnFechas(java.lang.String inicio, java.lang.String fin) {
        hotel1consumer.Hotel1WS_Service service = new hotel1consumer.Hotel1WS_Service();
        hotel1consumer.Hotel1WS port = service.getHotel1WSPort();
        return port.buscarHabitacionesEnFechas(inicio, fin);
    }

    public static boolean registrarReserva(java.lang.Integer persona, java.lang.Integer name, java.lang.String inicio, java.lang.String fin, java.util.List<java.lang.Integer> habitaciones) {
        hotel1consumer.Hotel1WS_Service service = new hotel1consumer.Hotel1WS_Service();
        hotel1consumer.Hotel1WS port = service.getHotel1WSPort();
        return port.registrarReserva(persona, name, inicio, fin, habitaciones);
    }
    
}
