package co.edu.udec.poo.RutaEscolar.dominio;

import java.util.Date;
import java.util.List;

public class Asistente extends Empleado {
//Atributos//

    private EstadoAsistente estado;
    private List<Recorrido> recorridos;

    //Constructor por defecto "sin parámetros"//
    public Asistente() {
    }
    //Constructor con parámetros//

      public Asistente(EstadoAsistente estado, List<Recorrido> recorridos, JornadaTurno jornadaTurno, String nombre, String apellido, String celular, String email) {
        super(jornadaTurno, nombre, apellido, celular, email);
        this.estado = estado;
        this.recorridos = recorridos;
    }
      

            //Metodos get y set//

    public EstadoAsistente getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsistente estado) {
        this.estado = estado;
    }

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

        @Override
    public String toString() {
        return super.toString() + "estado=" + estado + ", recorridos=" + recorridos + '}';
    }



    

}   