package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalTime;
import co.edu.udec.poo.RutaEscolar.dominio.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class PagoCrud {

    private ArrayList<Pago> listaPagos;
    Scanner scanner = new Scanner(System.in);

    public PagoCrud(ArrayList<Pago> listaPagos) {
        this.listaPagos = listaPagos;
    }

    public void eliminarPago(int id) {
        //Busca elemento por elemento en una lista
        Iterator<Pago> iterator = listaPagos.iterator();

        while (iterator.hasNext()) {
            Pago pago = iterator.next();
            if (pago.getId() == id) {
                iterator.remove();
                System.out.println("El Id del pago eliminado es: " + pago.getId());
                return;
            }
        }
        System.out.println("El pago de id " + id + " no ha sido encontrado");
    }

    public void buscarPago(int id) {

        Iterator<Pago> iterator = listaPagos.iterator();
        while (iterator.hasNext()) {
            Pago pago = iterator.next();
            if (pago.getId() == id) {
                System.out.println("El pago es:  " + pago);
                return;
            }
        }
        System.out.println("El pago de: " + id + "no ha sido encontrado");
    }

    public void editarPago(int idPago) {

        for (Pago pago : listaPagos) {
            if (pago.getId() == idPago) {

                System.out.println("¿Desea editar la fecha del pago? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva fecha (dd/MM/yyyy):");
                    String fechaPago = scanner.nextLine();

                    try {
                        SimpleDateFormat nuevoFormato = new SimpleDateFormat("dd/MM/yyyy");
                        Date fecha = nuevoFormato.parse(fechaPago);  // Esta línea estaba mal
                        pago.setFecha(fecha);
                    } catch (Exception excepcion) {
                        System.out.println("Fecha incorrecta, el formato usado no es correcto");
                    }
                }

                System.out.println("¿Editar el estado de pago? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Opciones: PENDIENTE, CANCELADO");
                    String nuevoEstado = scanner.nextLine().toUpperCase();
                    if (nuevoEstado.equals("PENDIENTE") || nuevoEstado.equals("CANCELADO")) {
                        pago.setEstado(EstadoPago.valueOf(nuevoEstado));
                    } else {
                        System.out.println("¡Estado no válido!");
                    }
                }
                System.out.println("¿Desea editar el monto del pago? (si/no)");
                if (scanner.nextLine().equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo tipo de descuento:");
                    pago.setMonto(scanner.nextDouble());
                }
                System.out.println(pago);
                return;
            } else {
                System.out.println("pago con ID " + idPago + " no encontrado.");
            }

        }
    }
    public void listarPagos() {
        for (Pago pago : listaPagos) {
            System.out.println(pago);
        }
    }

    public void contarPagos() {
        int cantidad = listaPagos.size();
        System.out.println("Total de pagos registrados: " + cantidad);
    }
}
