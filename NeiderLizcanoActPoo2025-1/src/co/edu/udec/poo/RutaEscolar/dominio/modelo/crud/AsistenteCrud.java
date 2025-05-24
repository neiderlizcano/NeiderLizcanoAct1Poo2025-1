
package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import co.edu.udec.poo.RutaEscolar.dominio.Asistente;
import co.edu.udec.poo.RutaEscolar.dominio.EstadoAsistente;

public class AsistenteCrud {
    private ArrayList<Asistente> listaAsistentes;
    Scanner scanner = new Scanner(System.in);
    
        public AsistenteCrud(ArrayList<Asistente> listaAsistentes) {

        this.listaAsistentes = listaAsistentes;
    }

    //Metodo
    public void eliminarApoderado(String nombre) {

        Iterator<Asistente> iterator = listaAsistentes.iterator();

        while (iterator.hasNext()) {
            Asistente asistente = iterator.next();
            if (asistente.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("El apoderado eliminado es:  " + asistente.getNombre());
                return;
            }
        }
        System.out.println("El Apoderado" + nombre + "No ha sido encontrado");
    }

    public void buscarApoderado(String nombre) {

        Iterator<Asistente> iterator = listaAsistentes.iterator();
        while (iterator.hasNext()) {
            Asistente asistente = iterator.next();
            if (asistente.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El asistente es:  " + asistente);
                return;
            }
        }
        System.out.println("El asistente" + nombre + "no ha sido encontrado");

    }

    public void editarApoderado(String nombre) {

        for (Asistente asistente : listaAsistentes) {
            if (asistente.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¿Deses editar el nombre del asistente ? si/no");
                String option = scanner.nextLine();

                if (option.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo nombre");
                    String nuevoNombre = scanner.nextLine();
                    asistente.setNombre(nuevoNombre);
                }

                System.out.println("¿Deses editar el apellido del asistente? si/no");
                String option2 = scanner.nextLine();
                if (option2.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo apellido");
                    String nuevoApellido = scanner.nextLine();
                    asistente.setApellido(nuevoApellido);
                }
                System.out.println("¿Deses editar el email del asistente? si/no");
                String option3 = scanner.nextLine();
                if (option3.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo email del asistente");
                    String nuevoEmail = scanner.nextLine();
                    asistente.setEmail(nuevoEmail);
                }

                System.out.println("\"¿Deses editar el numero de celular del asistente? si/no\"");
                String option4 = scanner.nextLine();
                if (option4.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo numero de celular del asistente");
                    String nuevoCelular = scanner.nextLine();
                    asistente.setCelular(nuevoCelular);
                }
                
                System.out.println("¿Desea editar el estado del asistente? si/no");
                String option5 = scanner.nextLine();
                if (option5.equalsIgnoreCase("si")) {
                    System.out.println("Estados disponibles: ACTIVO, INACTIVO, SANCIONADO");
                    System.out.println("Ingrese el nuevo estado:");
                    String nuevoEstadoStr = scanner.nextLine().toUpperCase();

                    try {
                        EstadoAsistente nuevoEstado = EstadoAsistente.valueOf(nuevoEstadoStr);
                        asistente.setEstado(nuevoEstado);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Estado no válido. No se realizaron cambios en el estado.");
                    }
                    System.out.println(asistente);
                    return;
                } else {
                    System.out.println("El apoderado " + nombre + " no fue encontrado.");
                }
            }
        }

    
    }
    public void listarAsistente(){
        for (Asistente asistente : listaAsistentes) {
            System.out.println(asistente);
        }
    }
    public void contarAsistente() {
    int cantidad = listaAsistentes.size();
    System.out.println("Total de contratos registrados: " + cantidad);
}
}

