package co.edu.udec.poo.RutaEscolar.dominio;

import java.util.Date;
import java.util.List;

public class Conductor extends Empleado {

//Atributos//
  private EstadoConductor estado;
  private List<Evento> eventos;
  private List<Recorrido> recorridos;

    //Constructor por defecto "sin parámetros"//
    public Conductor() {
    }

    //Constructor con parámetros//

    public Conductor(EstadoConductor estado, List<Evento> eventos, List<Recorrido> recorridos, JornadaTurno jornadaTurno, String nombre, String apellido, String celular, String email) {
        super(jornadaTurno, nombre, apellido, celular, email);
        this.estado = estado;
        this.eventos = eventos;
        this.recorridos = recorridos;
    }

    //Metodos get y set//


    public EstadoConductor getEstado() {
        return estado;
    }

    public void setEstado(EstadoConductor estado) {
        this.estado = estado;
    }

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
//Método toString//
    @Override
    public String toString() {
        return "Conductor{" + "estado=" + estado + ", eventos=" + eventos + ", recorridos=" + recorridos + '}';
    }
}

    
 
