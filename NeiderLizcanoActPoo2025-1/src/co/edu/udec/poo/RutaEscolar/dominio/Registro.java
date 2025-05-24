package co.edu.udec.poo.RutaEscolar.dominio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class Registro {

    //Atributos//
    private int id;
    private LocalDate fecha;
    private int idMinibus;
    private List<Recorrido> recorridos; 
    private LocalTime horaSalidaCochera;
    private LocalTime horaRetornoCochera;
    private int kilometrajeSalida;
    private int kilometrajeRetorno;
    private List<Evento> eventosDelDia; 
    private String observaciones;
    
    
    
    //Constructor por defecto "sin parámetros"//

    public Registro() {
    }

    //Constructor con parámetros//
//
  public Registro(LocalDate fecha, int idMinibus, List<Recorrido> recorridos, LocalTime horaSalidaCochera,
                    LocalTime horaRetornoCochera, int kilometrajeSalida, int kilometrajeRetorno,
                    List<Evento> eventosDelDia, String observaciones) {
        Random random = new Random();
        this.id = 10000 + random.nextInt(90000); // ID aleatorio de 5 cifras
        this.fecha = fecha;
        this.idMinibus = idMinibus;
        this.recorridos = recorridos;
        this.horaSalidaCochera = horaSalidaCochera;
        this.horaRetornoCochera = horaRetornoCochera;
        this.kilometrajeSalida = kilometrajeSalida;
        this.kilometrajeRetorno = kilometrajeRetorno;
        this.eventosDelDia = eventosDelDia;
        this.observaciones = observaciones;
    }


    //Métodos get y set//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdMinibus() {
        return idMinibus;
    }

    public void setIdMinibus(int idMinibus) {
        this.idMinibus = idMinibus;
    }

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public LocalTime getHoraSalidaCochera() {
        return horaSalidaCochera;
    }

    public void setHoraSalidaCochera(LocalTime horaSalidaCochera) {
        this.horaSalidaCochera = horaSalidaCochera;
    }

    public LocalTime getHoraRetornoCochera() {
        return horaRetornoCochera;
    }

    public void setHoraRetornoCochera(LocalTime horaRetornoCochera) {
        this.horaRetornoCochera = horaRetornoCochera;
    }

    public int getKilometrajeSalida() {
        return kilometrajeSalida;
    }

    public void setKilometrajeSalida(int kilometrajeSalida) {
        this.kilometrajeSalida = kilometrajeSalida;
    }

    public int getKilometrajeRetorno() {
        return kilometrajeRetorno;
    }

    public void setKilometrajeRetorno(int kilometrajeRetorno) {
        this.kilometrajeRetorno = kilometrajeRetorno;
    }

    public List<Evento> getEventosDelDia() {
        return eventosDelDia;
    }

    public void setEventosDelDia(List<Evento> eventosDelDia) {
        this.eventosDelDia = eventosDelDia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Registro{" + "id=" + id + ", fecha=" + fecha + ", idMinibus=" + idMinibus + ", recorridos=" + recorridos + ", horaSalidaCochera=" + horaSalidaCochera + ", horaRetornoCochera=" + horaRetornoCochera + ", kilometrajeSalida=" + kilometrajeSalida + ", kilometrajeRetorno=" + kilometrajeRetorno + ", eventosDelDia=" + eventosDelDia + ", observaciones=" + observaciones + '}';
    }
    
        
}
    