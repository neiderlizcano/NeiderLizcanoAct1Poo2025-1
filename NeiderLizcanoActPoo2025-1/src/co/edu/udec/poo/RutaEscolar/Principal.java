// Principal.java
package co.edu.udec.poo.RutaEscolar;

import co.edu.udec.poo.RutaEscolar.dominio.*;
import java.util.*;
import java.util.Date;
import java.util.List;
import co.edu.udec.poo.RutaEscolar.dominio.modelo.crud.ApoderadoCrud;
import co.edu.udec.poo.RutaEscolar.dominio.modelo.crud.*;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Apoderado> listaApoderados = new ArrayList<>();
        List<Nino> ninos = new ArrayList<>();
        List<Contrato> contratos = new ArrayList<>();

        ApoderadoCrud crud = new ApoderadoCrud(listaApoderados);
        Apoderado a1 = new Apoderado("Neider", "LL", "32225", "N@email", ninos, contratos);
        Apoderado a2 = new Apoderado("Nier", "GGLL", "32225555", "NGG@email", ninos, contratos);

        listaApoderados.add(a1);
        listaApoderados.add(a2);

        System.out.println(listaApoderados);
        crud.eliminarApoderado("Neider");
        System.out.println(listaApoderados);
        crud.buscarApoderado("Nier");
        System.out.println(listaApoderados);
        crud.editarApoderado("Nier");
        crud.contarApoderados();

    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*ArrayList<Contrato> listaContratos = new ArrayList<>();
        List<Nino> listaNinos = new ArrayList<>();
        List<Contrato> listaContratosApoderado = new ArrayList<>();

        // Crear contratos con IDs aleatorios
        Apoderado apoderado1 = new Apoderado("Carlos", "Ramírez", "3120000000", "carlos@email.com", listaNinos, listaContratosApoderado);

        Date fechaInicio = new Date(); // hoy
        Date fechaTermino = new Date(fechaInicio.getTime() + (1000L * 60 * 60 * 24 * 30)); // +30 días

        Contrato contrato1 = new Contrato(
                fechaInicio,
                fechaTermino,
                ModalidadServicio.MANANA,
                2,
                apoderado1,
                10.0,
                "Familiar",
                150000.0,
                EstadoContrato.ACTIVO,
                listaNinos,
                new ArrayList<>()
        );

        listaContratosApoderado.add(contrato1);

        // Agregar contrato a la lista general
        listaContratos.add(contrato1);

        // Mostrar contratos antes de eliminar
        System.out.println("=== CONTRATOS REGISTRADOS ===");
        for (Contrato c : listaContratos) {
            System.out.println(c);

        }
        ContratoCrud crud = new ContratoCrud(listaContratos);
        int idEliminar = contrato1.getId();

        System.out.println("\nIntentando eliminar contrato con ID: " + idEliminar);
        crud.eliminarContrato(idEliminar);

        // Mostrar lista después de eliminar
        System.out.println("\n=== CONTRATOS RESTANTES ===");
        for (Contrato c : listaContratos) {
            System.out.println(c);

        }
    }
}

        /*
        ArrayList<Apoderado> listaApoderados = new ArrayList<>();
        List<Nino> ninos = new ArrayList<>();
        List<Contrato> contratos = new ArrayList<>();
        
        ApoderadoCrud crud = new ApoderadoCrud (listaApoderados);        
        Apoderado a1 = new Apoderado("Neider", "LL", "32225", "N@email", ninos, contratos);
        Apoderado a2 = new Apoderado("Nier", "GGLL", "32225555", "NGG@email", ninos, contratos);
        
        listaApoderados.add(a1);
        listaApoderados.add(a2);
        
        System.out.println(listaApoderados);
        crud.eliminarApoderado("Neider");
        System.out.println(listaApoderados);
        crud.buscarApoderado("Nier");
        crud.editarApoderado("Nier");
crud.contrarApoderados(listaApoderados);
        
        
        
        
        
       /* List<Recorrido> listaRecorridos = new ArrayList<>();
        List<Evento> listaEventos = new ArrayList<>();
        List<Nino> listaNinos = new ArrayList<>();
        List<Contrato> listaContratos = new ArrayList<>();
        // Crear la empresa
        Empresa empresa = new Empresa("Tio Juanito", "1234890619", "3135897788",
                "nlizcano@unicartagea.edu.co", "CALLE 8 #3-13");

        // Crear un Minibus
        Minibus mini1 = new Minibus("MB1", "001", 0, EstadoMinibus.DISPONIBLE);
        empresa.agregarMinibus(mini1);

        //crear apoderaod:
        Apoderado apoderado = new Apoderado("CC1007250607", "Yenifer", "Rodríguez",
                "3125424951", "jenniferrod@ufps.edu.co", "Madre", listaNinos,
                listaContratos);

        Conductor conductor = new Conductor("37180109", new Date(), new Date(),
                EstadoConductor.ACTIVO, "Mañana", listaRecorridos, listaEventos,
                "CC789456", "Maria", "Suescun", "3135971673", "madelcars@yahoo.es");

        Asistente asistente = new Asistente("981120", "Nery", "Suescun", "3215297923",
                "nerysuescun@hotmail.com", new Date(),
                new Date(), "Mañana", EstadoAsistente.INACTIVO, NivelDesempeno.BUENO,
                new ArrayList<>());
        System.out.println("\n");
        System.out.println(empresa);
        System.out.println("\n");
        System.out.println(mini1);
        System.out.println("\n");
        System.out.println(apoderado);
        System.out.println("\n");
        System.out.println(conductor);
        System.out.println("\n");
        System.out.println(asistente);
        System.out.println("\n");
         */
 /*
       ArrayList<Nino> niños = new ArrayList<>();
       ArrayList<Contrato> contratos = new ArrayList<>(); 
        Apoderado apoederado = new Apoderado("12", "sara", "cc", "1526", "sss", "sss", niños, contratos);
        System.out.println(apoederado);
        System.out.println(apoederado.getId()); 
         */
 /* ArrayList<Recorrido> recorridos = new ArrayList<>();
        Asistente asistente = new Asistente (EstadoAsistente.ACTIVO,recorridos, JornadaTurno.MANANA, " Nery ", " Suess ", " 311 ", " nery@ng ");
   
    System.out.println(asistente);
    
     Minibus minibus = new Minibus(3);  // Capacidad máxima 3 niños

        minibus.agregarNino("Juan");
        minibus.agregarNino("María");
        minibus.agregarNino("Carlos");
        minibus.agregarNino("Ana");  // Este ya no debería agregarse, capacidad llena
         */

    