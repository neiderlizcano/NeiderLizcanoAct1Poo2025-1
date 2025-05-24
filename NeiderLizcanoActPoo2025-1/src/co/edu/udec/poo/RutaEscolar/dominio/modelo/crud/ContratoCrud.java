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

public class ContratoCrud {

    private ArrayList<Contrato> listaContratos;
    Scanner scanner = new Scanner(System.in);

    public ContratoCrud(ArrayList<Contrato> listaContratos) {
        this.listaContratos = listaContratos;
    }

    public void eliminarContrato(int id) {
        //Busca elemento por elemento en una lista
        Iterator<Contrato> iterator = listaContratos.iterator();

        while (iterator.hasNext()) {
            Contrato contrato = iterator.next();
            if (contrato.getId() == id) {
                iterator.remove();
                System.out.println("El Id del contrato eliminado es: " + contrato.getId());
                return;
            }
        }
        System.out.println("El contrato de id " + id + " no ha sido encontrado");
    }

    public void buscarContrato(int id) {

        Iterator<Contrato> iterator = listaContratos.iterator();
        while (iterator.hasNext()) {
            Contrato contrato = iterator.next();
            if (contrato.getId() == id) {
                System.out.println("El contrato es:  " + contrato);
                return;
            }
        }
        System.out.println("El contrato de: " + id + "no ha sido encontrado");

    }

    public void editarContrato(int idContrato) {

        for (Contrato contrato : listaContratos) {
            if (contrato.getId() == idContrato) {

                System.out.println("¿Desea editar la fecha de inicio? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva fecha (dd/MM/yyyy):");
                    String fechaini = scanner.nextLine();

                    try {
                        SimpleDateFormat nuevoFormato = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha = nuevoFormato.parse(fechaini);  // Esta línea estaba mal
                        contrato.setFechaInicio(fecha);
                    } catch (Exception excepcion) {
                        System.out.println("Fecha incorrecta, el formato usado no es correcto");
                    }
                }

                System.out.println("¿Desea editar la fecha de termino? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva fecha (dd/MM/yyyy):");
                    String fechater = scanner.nextLine();
                    try {
                        SimpleDateFormat nuevoFormato = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha = nuevoFormato.parse(fechater);//convierte fecha a texto
                        contrato.setFechaTermino(fecha);
                    } catch (Exception excepcion) {
                        System.out.println("Fecha incorrecta, el formato usado no es correcto");
                    }
                }

                // Editar modalidad de servicio
                System.out.println("¿Editar modalidad? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Opciones: MANANA, MEDIODIA, TARDE");
                    String nuevaModalidad = scanner.nextLine().toUpperCase();
                    if (nuevaModalidad.equals("MANANA") || nuevaModalidad.equals("MEDIODIA") || nuevaModalidad.equals("TARDE")) {
                        contrato.setModalidad(ModalidadServicio.valueOf(nuevaModalidad));
                    } else {
                        System.out.println("¡Modalidad no válida!");
                    }
                }

                // Editar cantidad de niños
                System.out.println("¿Desea editar la cantidad de niños? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva cantidad:");
                    contrato.setCantidadNinos(scanner.nextInt());
                    scanner.nextLine(); // Limpiar buffer
                }

                // Editar tipo de descuento
                System.out.println("¿Desea editar el tipo de descuento? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo tipo de descuento:");
                    contrato.setTipoDescuento(scanner.nextLine());
                }

                // Editar tarifa base
                System.out.println("¿Desea editar la tarifa base? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva tarifa base:");
                    contrato.setTarifaBase(scanner.nextDouble());
                }

                // Editar estado del contrato
                System.out.println("¿Desea editar el estado del contrato? si/no");
                String opcionEstado = scanner.nextLine();

                if (opcionEstado.equalsIgnoreCase("si")) {
                    System.out.println("Estados disponibles: ACTIVO, CANCELADO, VENCIDO");
                    System.out.println("Ingrese el nuevo estado:");
                    String nuevoEstado = scanner.nextLine().toUpperCase();  // Convertir a mayúsculas

                    // Verificar si el estado existe
                    if (nuevoEstado.equals("ACTIVO") || nuevoEstado.equals("CANCELADO") || nuevoEstado.equals("VENCIDO")) {
                        contrato.setEstado(EstadoContrato.valueOf(nuevoEstado));
                        System.out.println("Estado actualizado correctamente");
                    } else {
                        System.out.println("Error: Estado no válido. No se realizaron cambios.");
                    }
                    System.out.println(contrato);
                    return;
                }
            } else {
                System.out.println("Contrato con ID " + idContrato + " no encontrado.");
            }
        }
    }

    public void listarContratos() {
        for (Contrato contrato : listaContratos) {
            System.out.println(contrato);
        }
    }

    public void contarContratos() {
        int cantidad = listaContratos.size();
        System.out.println("Total de contratos registrados: " + cantidad);
    }
}
