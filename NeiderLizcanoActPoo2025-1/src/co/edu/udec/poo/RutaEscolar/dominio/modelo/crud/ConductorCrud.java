
package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import co.edu.udec.poo.RutaEscolar.dominio.*;

public class ConductorCrud {
     //Declara lista
    private ArrayList<Conductor> listaConductores;
    Scanner scanner = new Scanner(System.in);

    public ConductorCrud(ArrayList<Conductor> listaConductores) {

        this.listaConductores = listaConductores;
    }

    //Metodo
    public void eliminarConductor(String nombre) {

        Iterator<Conductor> iterator = listaConductores.iterator();

        while (iterator.hasNext()) {
            Conductor conductor = iterator.next();
            if (conductor.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("El conductor eliminado es:  " + conductor.getNombre());
                return;
            }
        }
        System.out.println("El conductor" + nombre + "No ha sido encontrado");
    }

    public void buscarConductor(String nombre) {

        Iterator<Conductor> iterator = listaConductores.iterator();
        while (iterator.hasNext()) {
            Conductor conductor = iterator.next();
            if (conductor.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El apoderado es:  " + conductor);
                return;
            }
        }
        System.out.println("El conductor" + nombre + "no ha sido encontrado");
    }
    
    public void editarApoderado(String nombre) {

        for (Conductor conductor : listaConductores) {
            if (conductor.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¿Deses editar el nombre del conductor? si/no");
                String option = scanner.nextLine();

                if (option.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo nombre");
                    String nuevoNombre = scanner.nextLine();
                    conductor.setNombre(nuevoNombre);
                }

                System.out.println("¿Deses editar el apellido del conductor? si/no");
                String option2 = scanner.nextLine();
                if (option2.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo apellido");
                    String nuevoApellido = scanner.nextLine();
                    conductor.setApellido(nuevoApellido);
                }
                System.out.println("¿Deses editar el email del conductor? si/no");
                String option3 = scanner.nextLine();
                if (option3.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo email del conductor");
                    String nuevoEmail = scanner.nextLine();
                    conductor.setEmail(nuevoEmail);
                }

                System.out.println("\"¿Deses editar el numero de celular del conductor? si/no\"");
                String option4 = scanner.nextLine();
                if (option4.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo numero de celular del conductor");
                    String nuevoCelular = scanner.nextLine();
                    conductor.setCelular(nuevoCelular);
                }
                
                 System.out.println("¿Editar estado del conductor? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Opciones: ACTIVO, INACTIVO, EN_DESCANSO");
                    String nuevoEstado = scanner.nextLine().toUpperCase();
                    if (nuevoEstado.equals("ACTIVO") || nuevoEstado.equals("INACTIVO") || nuevoEstado.equals("EN_DESCANSO")) {
                        conductor.setEstado(EstadoConductor.valueOf(nuevoEstado));
                    } else {
                        System.out.println("¡Estado no válido!");
                    }
                }
                System.out.println(conductor);
                return;     
                
            } else {
                System.out.println("El conductor " + nombre + " no fue encontrado.");
            }
        }
    }
      public void listarConductores() {
        for (Conductor conductor : listaConductores) {
            System.out.println(conductor);
        }
    }

    public void contarContratos() {
        int cantidad = listaConductores.size();
        System.out.println("Total de conductores registrados: " + cantidad);
    }
}
