
package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import co.edu.udec.poo.RutaEscolar.dominio.Contrato;
import co.edu.udec.poo.RutaEscolar.dominio.*;
import java.time.LocalDateTime;          
import java.time.format.DateTimeFormatter; 
import java.time.format.DateTimeParseException;
import java.util.Date;

public class EventoCrud {

    private ArrayList<Evento> listaEventos;
    Scanner scanner = new Scanner(System.in);

    public EventoCrud(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public void eliminarEvento(int id) {
        //Busca elemento por elemento en una lista
        Iterator<Evento> iterator = listaEventos.iterator();

        while (iterator.hasNext()) {
            Evento evento = iterator.next();
            if (evento.getId()== id) {
                iterator.remove();
                System.out.println("El Id del evento eliminado es: " + evento.getId());
                return;
            }
        }
        System.out.println("El evento de id " + id + " no ha sido encontrado");
    }

    public void buscarEvento(int id) {

        Iterator<Evento> iterator = listaEventos.iterator();
        while (iterator.hasNext()) {
            Evento evento = iterator.next();
            if (evento.getId() == id) {
                System.out.println("El evento es:  " + evento);
                return;
            }
        }
        System.out.println("El evento de: " + id + "no ha sido encontrado");
    }
public void editarEvento(int idEvento) {
    for (Evento evento : listaEventos) {
        if (evento.getId() == idEvento) {
            
            // Editar fecha y hora
            System.out.println("¿Desea editar la fecha y hora? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva fecha y hora (formato: dd/MM/yyyy HH:mm):");
                String fechaHora = scanner.nextLine();
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    LocalDateTime nuevaFechaHora = LocalDateTime.parse(fechaHora, formatter);
                    evento.setFechaHora(nuevaFechaHora);
                } catch (Exception e) {
                    System.out.println("Formato incorrecto. Use dd/MM/yyyy HH:mm");
                }
            }

            // Editar tipo
            System.out.println("¿Desea editar el tipo de evento? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nuevo tipo:");
                evento.setTipo(scanner.nextLine());
            }

            // Editar descripción
            System.out.println("¿Desea editar la descripción? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva descripción:");
                evento.setDescripcion(scanner.nextLine());
            }

            // Editar gravedad
            System.out.println("¿Desea editar la gravedad? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva gravedad:");
                evento.setGravedad(scanner.nextLine());
            }

            // Editar ubicación
            System.out.println("¿Desea editar la ubicación? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva ubicación:");
                evento.setUbicacion(scanner.nextLine());
            }

            // Editar si afecta recorrido
            System.out.println("¿Desea cambiar si afecta al recorrido? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("¿Afecta al recorrido? (true/false):");
                String respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("true") || respuesta.equals("false")) {
                    evento.setAfectaRecorrido(Boolean.parseBoolean(respuesta));
                } else {
                    System.out.println("Valor no válido.");
                }
            }
            System.out.println(evento);
            return;
        }
    }
    System.out.println("No se encontró incidente con ID " + idEvento);
}    
    public void listarEventos() {
        for (Evento evento : listaEventos) {
            System.out.println(evento);
        }
    }

    public void contarEventos() {
        int cantidad = listaEventos.size();
        System.out.println("Total de eventos registrados: " + cantidad);
    }
}

