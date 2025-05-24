
package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import co.edu.udec.poo.RutaEscolar.dominio.Contrato;
import co.edu.udec.poo.RutaEscolar.dominio.*;
import java.util.Date;

public class MinibusCrud {
     private ArrayList<Minibus> listaMinibuses;
    Scanner scanner = new Scanner(System.in);

    public MinibusCrud(ArrayList<Minibus> listaMinibuses) {
        this.listaMinibuses = listaMinibuses;
    }

    public void eliminarMinibus(int id) {
        //Busca elemento por elemento en una lista
        Iterator<Minibus> iterator = listaMinibuses.iterator();

        while (iterator.hasNext()) {
            Minibus minibus = iterator.next();
            if (minibus.getId() == id) {
                iterator.remove();
                System.out.println("El Id del contrato eliminado es: " + minibus.getId());
                return;
            }
        }
        System.out.println("El contrato de id " + id + " no ha sido encontrado");
    }

    public void buscarMinibus(int id) {

        Iterator<Minibus> iterator = listaMinibuses.iterator();
        while (iterator.hasNext()) {
            Minibus minibus = iterator.next();
            if (minibus.getId() == id) {
                System.out.println("El contrato es:  " + minibus);
                return;
            }
        }
        System.out.println("El contrato de: " + id + "no ha sido encontrado");
    }
    
public void editarMinibus(int id) {
    for (Minibus minibus : listaMinibuses) {
        if (minibus.getId() == id) {

          
            System.out.println("¿Desea editar la placa? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva placa:");
                minibus.setPlaca(scanner.nextLine());
            }

          
            System.out.println("¿Desea editar el kilometraje? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese el nuevo kilometraje:");
                minibus.setKilometrajeActual(scanner.nextDouble());
                scanner.nextLine(); 
            }

            System.out.println("¿Desea editar el estado? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Opciones: DISPONIBLE, OCUPADO, EN_MANTENIMIENTO, FUERA_DE_SERVICIO");
                String estado = scanner.nextLine().toUpperCase();
                
                if (estado.equals("DISPONIBLE") || estado.equals("OCUPADO") || 
                    estado.equals("EN_MANTENIMIENTO") || estado.equals("FUERA_DE_SERVICIO")) {
                    minibus.setEstado(EstadoMinibus.valueOf(estado));
                } else {
                    System.out.println("¡Estado no válido!"); 
                }
            }

            System.out.println("Minibús actualizado:"); 
            System.out.println(minibus);
            return;
        }
    }
    System.out.println("Minibús con ID " + id + " no encontrado."); 
}
public void listarMinibuses() {
            for (Minibus minibus : listaMinibuses) {
            System.out.println(minibus);
        }
    }

    public void contarMinibuses() {
        int cantidad = listaMinibuses.size();
        System.out.println("Total de minibuses registrados: " + cantidad);
    }
}
