package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalTime;
import co.edu.udec.poo.RutaEscolar.dominio.Contrato;
import co.edu.udec.poo.RutaEscolar.dominio.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.time.*;

public class RecorridoCrud {

    private ArrayList<Recorrido> listaRecorridos;
    Scanner scanner = new Scanner(System.in);

    public RecorridoCrud(ArrayList<Recorrido> listaRecorridos) {
        this.listaRecorridos = listaRecorridos;
    }

    public void eliminarRecorrido(int id) {
        //Busca elemento por elemento en una lista
        Iterator<Recorrido> iterator = listaRecorridos.iterator();

        while (iterator.hasNext()) {
            Recorrido recorrido = iterator.next();
            if (recorrido.getId() == id) {
                iterator.remove();
                System.out.println("El Id del recorrido eliminado es: " + recorrido.getId());
                return;
            }
        }
        System.out.println("El recorrido de id " + id + " no ha sido encontrado");
    }
     public void buscarRecorrido(int id) {

        Iterator<Recorrido> iterator = listaRecorridos.iterator();
        while (iterator.hasNext()) {
            Recorrido recorrido = iterator.next();
            if (recorrido.getId() == id) {
                System.out.println("El recorrido es:  " + recorrido);
                return;
            }
        }
        System.out.println("El recorrido: " + id + "no ha sido encontrado");
    }
     public void editarRecorrido(int idRecorrido) {
    for (Recorrido recorrido : listaRecorridos) {
        if (recorrido.getId() == idRecorrido) {
            
            // Editar fecha del recorrido
            System.out.println("¿Desea editar la fecha del recorrido? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva fecha (formato: yyyy-MM-dd):");
                String fechaStr = scanner.nextLine();
                try {
                    LocalDate nuevaFecha = LocalDate.parse(fechaStr);
                    recorrido.setFechaRecorrido(nuevaFecha);
                } catch (Exception e) {
                    System.out.println("Formato de fecha incorrecto. Use yyyy-MM-dd");
                }
            }

            // Editar barrio
            System.out.println("¿Desea editar el barrio? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nuevo barrio:");
                recorrido.setBarrio(scanner.nextLine());
            }

            // Editar colegio
            System.out.println("¿Desea editar el colegio? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nuevo colegio:");
                recorrido.setColegio(scanner.nextLine());
            }

            // Editar jornada
            System.out.println("¿Desea editar la jornada? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva jornada:");
                recorrido.setJornada(scanner.nextLine());
            }

            // Editar distancia en km
            System.out.println("¿Desea editar la distancia en kilómetros? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva distancia (km):");
                try {
                    double nuevaDistancia = Double.parseDouble(scanner.nextLine());
                    recorrido.setDistanciaKm(nuevaDistancia);
                } catch (NumberFormatException e) {
                    System.out.println("Valor numérico no válido");
                }
            }

            // Editar estado del recorrido
            System.out.println("¿Desea editar el estado del recorrido? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("opciones: EN_PROGRESO, FINALIZADO, CANCELADO");
                String nuevoEstado = scanner.nextLine().toUpperCase();
                
                if (nuevoEstado.equals("EN_PROGRESO") || nuevoEstado.equals("FINALIZADO") || nuevoEstado.equals("CANCELADO")) {
                        recorrido.setEstado(EstadoRecorrido.valueOf(nuevoEstado));
                    } else {
                        System.out.println("¡Estado no valido!");
            }

                  System.out.println(recorrido);
            return;
        }
    }
    System.out.println("Recorrido con ID " + idRecorrido + " no encontrado.");
}
     }
     public void listarRecorridos() {
        for (Recorrido recorrido : listaRecorridos) {
            System.out.println(recorrido);
        }
    }

    public void contarRecorrido() {
        int cantidad = listaRecorridos.size();
        System.out.println("Total de recorridos registrados: " + cantidad);
    }
}
