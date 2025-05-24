package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import co.edu.udec.poo.RutaEscolar.dominio.Apoderado;

public class ApoderadoCrud {

    //Declara lista
    private ArrayList<Apoderado> listaApoderados;
    Scanner scanner = new Scanner(System.in);

    public ApoderadoCrud(ArrayList<Apoderado> listaApoderados) {

        this.listaApoderados = listaApoderados;
    }

    //Metodo
    public void eliminarApoderado(String nombre) {

        Iterator<Apoderado> iterator = listaApoderados.iterator();

        while (iterator.hasNext()) {
            Apoderado apoderado = iterator.next();
            if (apoderado.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("El apoderado eliminado es:  " + apoderado.getNombre());
                return;
            }
        }
        System.out.println("El Apoderado" + nombre + "No ha sido encontrado");
    }

    public void buscarApoderado(String nombre) {

        Iterator<Apoderado> iterator = listaApoderados.iterator();
        while (iterator.hasNext()) {
            Apoderado apoderado = iterator.next();
            if (apoderado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El apoderado es:  " + apoderado);
                return;
            }
        }
        System.out.println("El Apoderado" + nombre + "no ha sido encontrado");

    }

    public void editarApoderado(String nombre) {

        for (Apoderado apoderado : listaApoderados) {
            if (apoderado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¿Deses editar el nombre del apoderado? si/no");
                String option = scanner.nextLine();

                if (option.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo nombre");
                    String nuevoNombre = scanner.nextLine();
                    apoderado.setNombre(nuevoNombre);
                }

                System.out.println("¿Deses editar el apellido del apoderado? si/no");
                String option2 = scanner.nextLine();
                if (option2.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo apellido");
                    String nuevoApellido = scanner.nextLine();
                    apoderado.setApellido(nuevoApellido);
                }
                System.out.println("¿Deses editar el email del apoderado? si/no");
                String option3 = scanner.nextLine();
                if (option3.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo email del apoderado");
                    String nuevoEmail = scanner.nextLine();
                    apoderado.setEmail(nuevoEmail);
                }

                System.out.println("\"¿Deses editar el numero de celular del apoderado? si/no\"");
                String option4 = scanner.nextLine();
                if (option4.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo numero de celular del apoderado");
                    String nuevoCelular = scanner.nextLine();
                    apoderado.setCelular(nuevoCelular);
                }
                System.out.println(apoderado);
                return;
            } else {
                System.out.println("El apoderado " + nombre + " no fue encontrado.");
            }
        }
    }

    public void listarApoderado() {
        for (Apoderado apoderado : listaApoderados) {
            System.out.println(apoderado);
        }
    }
    public void contarApoderados() {
    int cantidad = listaApoderados.size();
    System.out.println("Total de apoderados registrados: " + cantidad);
}
}
