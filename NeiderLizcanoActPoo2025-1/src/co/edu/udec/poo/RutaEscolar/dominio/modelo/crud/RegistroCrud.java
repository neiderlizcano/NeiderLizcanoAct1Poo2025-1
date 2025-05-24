
package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import co.edu.udec.poo.RutaEscolar.dominio.*;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RegistroCrud {
      private ArrayList<Registro> listaRegistros;
    Scanner scanner = new Scanner(System.in);

    public RegistroCrud(ArrayList<Registro> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    public void eliminarRegistro(int id) {
        //Busca elemento por elemento en una lista
        Iterator<Registro> iterator = listaRegistros.iterator();

        while (iterator.hasNext()) {
            Registro registro = iterator.next();
            if (registro.getId() == id) {
                iterator.remove();
                System.out.println("El Id del registro eliminado es: " + registro.getId());
                return;
            }
        }
        System.out.println("El registro de id " + id + " no ha sido encontrado");
    }

    public void buscarRegistro(int id) {

        Iterator<Registro> iterator = listaRegistros.iterator();
        while (iterator.hasNext()) {
            Registro contrato = iterator.next();
            if (contrato.getId() == id) {
                System.out.println("El contrato es:  " + contrato);
                return;
            }
        }
        System.out.println("El registro de: " + id + "no ha sido encontrado");
    }
  public void editarRegistro(int idRegistro) {
    for (Registro registro : listaRegistros) {
        if (registro.getId() == idRegistro) {
            
            scanner.nextLine();
            
            System.out.println("¿Desea editar la fecha? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese la nueva fecha (dd/MM/yyyy):");
                String fecha = scanner.nextLine();
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    registro.setFecha(LocalDate.parse(fecha, formatter));
                } catch (DateTimeParseException e) {
                    System.out.println("¡Formato de fecha incorrecto!");
                }
            }
   
            System.out.println("¿Desea editar la hora de salida? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese nueva hora (HH:mm):");
                String horaSalida = scanner.nextLine();
                try {
                    registro.setHoraSalidaCochera(LocalTime.parse(horaSalida));
                } catch (DateTimeParseException e) {
                    System.out.println("¡Formato de hora incorrecto!");
                }
            }

            System.out.println("¿Desea editar la hora de retorno? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Ingrese nueva hora (HH:mm):");
                String horaRetorno = scanner.nextLine();
                try {
                    registro.setHoraRetornoCochera(LocalTime.parse(horaRetorno));
                } catch (DateTimeParseException e) {
                    System.out.println("¡Formato de hora incorrecto!");
                }
            }

            System.out.println("¿Desea editar el kilometraje de salida? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Nuevo kilometraje:");
                if (scanner.hasNextInt()) {
                    registro.setKilometrajeSalida(scanner.nextInt());
                } else {
                    System.out.println("¡Número invalido!");
                }
                scanner.nextLine(); 
            }

            System.out.println("¿Desea editar el kilometraje de retorno? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Nuevo kilometraje:");
                if (scanner.hasNextInt()) {
                    registro.setKilometrajeRetorno(scanner.nextInt());
                } else {
                    System.out.println("¡Número invalido,Debe ser un número entero!");
                }
                scanner.nextLine(); 
            }

            System.out.println("¿Desea editar las observaciones? (si/no)");
            if (scanner.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Nuevas observaciones:");
                registro.setObservaciones(scanner.nextLine());
            }
            System.out.println(registro);
            return;
        }
    }
    System.out.println("No se encontró registro con ID: " + idRegistro);
}
     public void listarRegistros() {
        for (Registro registro : listaRegistros) {
            System.out.println(registro);
        }
    }

    public void contarRegistros() {
        int cantidad = listaRegistros.size();
        System.out.println("Total de contratos registrados: " + cantidad);
    }
    
}
