package co.edu.udec.poo.RutaEscolar.dominio.modelo.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalTime;
import co.edu.udec.poo.RutaEscolar.dominio.Nino;
import co.edu.udec.poo.RutaEscolar.dominio.*;

public class NinoCrud {

    private ArrayList<Nino> listaNinos;
    Scanner scanner = new Scanner(System.in);

    public NinoCrud(ArrayList<Nino> listaNinos) {
        this.listaNinos = listaNinos;
    }

    public void eliminarNino(String nombre) {
        //Busca elemento por elemento en una lista
        Iterator<Nino> iterator = listaNinos.iterator();

        while (iterator.hasNext()) {
            Nino nino = iterator.next();
            if (nino.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("El niño eliminado es: " + nino.getNombre());
                return;
            }
        }
        System.out.println("El niño " + nombre + "no ha sido encontrado");
    }

    public void buscarNino(String nombre) {
        Iterator<Nino> iterator = listaNinos.iterator();
        while (iterator.hasNext()) {
            Nino nino = iterator.next();
            if (nino.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El niño es:  " + nino);
                return;
            }
        }
        System.out.println("El nino " + nombre + "no ha sido encontrado");

    }

    public void editarNino(String nombre) {

        for (Nino nino : listaNinos) {
            if (nino.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¿Deses editar el nombre del nino? si/no");
                String option = scanner.nextLine();

                if (option.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo nombre");
                    String nuevoNombre = scanner.nextLine();
                    nino.setNombre(nuevoNombre);
                }

                System.out.println("¿Deses editar el apellido del nino? si/no");
                String option2 = scanner.nextLine();
                if (option2.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo apellido");
                    String nuevoApellido = scanner.nextLine();
                    nino.setApellido(nuevoApellido);
                }
                System.out.println("¿Deses editar el email del niño? si/no");
                String option3 = scanner.nextLine();
                if (option3.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo email del niño");
                    String nuevoEmail = scanner.nextLine();
                    nino.setEmail(nuevoEmail);
                }

                System.out.println("\"¿Deses editar el numero de celular del niño? si/no\"");
                String option4 = scanner.nextLine();
                if (option4.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuevo numero de celular del niño");
                    String nuevoCelular = scanner.nextLine();
                    nino.setCelular(nuevoCelular);
                }
                System.out.println("\"¿Deses editar la dirección de la casa del niño? si/no\"");
                String option5 = scanner.nextLine();
                if (option5.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva la dirección de casa del niño");
                    String nuevaDireccionCasa = scanner.nextLine();
                    nino.setDireccionCasa(nuevaDireccionCasa);
                }
                System.out.println("\"¿Deses editar la dirección de colegio del niño? si/no\"");
                String option6 = scanner.nextLine();
                if (option6.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva la dirección de colegio del niño");
                    String nuevaDireccionColegio = scanner.nextLine();
                    nino.setDireccionColegio(nuevaDireccionColegio);
                }
                System.out.println("\"¿Deses editar el nombre de colegio del niño? si/no\"");
                String option7 = scanner.nextLine();
                if (option7.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el nuveo nombre de colegio del niño");
                    String nuevoColegio = scanner.nextLine();
                    nino.setColegio(nuevoColegio);
                }
                System.out.println("¿Deseas editar la hora de recogida? (si/no)");
                String option8= scanner.nextLine();
                if (option8.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva hora de recogida en horas y minutos (HH.MM): ");
                    String horaString = scanner.nextLine();
                    LocalTime nuevaHoraRecogida = LocalTime.parse(horaString);
                    nino.setHoraRecogida(nuevaHoraRecogida);
                }

                System.out.println("¿Deseas editar la hora de regreso? (si/no)");
                String option9 = scanner.nextLine();
                if (option9.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese la nueva hora de regreso en horas y minutos (HH.MM): ");
                    String horaString = scanner.nextLine();
                    LocalTime nuevaHoraRegreso = LocalTime.parse(horaString);
                    nino.setHoraRegreso(nuevaHoraRegreso);
                    return;
                }
            } else {
                System.out.println("El niño " + nombre + " no fue encontrado.");
            }
        }

    }

    public void listarNinos() {
        for (Nino nino : listaNinos) {
            System.out.println(nino);
        }
    }
    public void contarNinos() {
    int cantidad = listaNinos.size();
    System.out.println("Total de niños registrados: " + cantidad);
}
}
