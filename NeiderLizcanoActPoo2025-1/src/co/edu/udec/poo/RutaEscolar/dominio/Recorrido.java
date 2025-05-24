package co.edu.udec.poo.RutaEscolar.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recorrido {

    //Atributos//
    private int id;
    private LocalDate fechaRecorrido;
    private String barrio;
    private String colegio;
    private String jornada;
    private double distanciaKm;
    private int idMinibus;
    private Conductor conductorAsignado;
    private Asistente asistenteAsignado;
    private EstadoRecorrido estado;
    private List<Nino> ninos;
    private List<Parada> paradas;
    
    
//Constructor por defecto "sin parámetros"//
    public Recorrido() {
    }
//Constructor con parámetros//

    public Recorrido(LocalDate fechaRecorrido, String barrio, String colegio, String jornada, double distanciaKm, int idMinibus,
            Conductor conductorAsignado, Asistente asistenteAsignado, EstadoRecorrido estado, List<Nino> ninos, double tiempoestimado, List<Parada> paradas) {
        Random random = new Random ();
        int numero= 10000 + random.nextInt(90000);
        this.id = numero;
        this.fechaRecorrido = fechaRecorrido;
        this.barrio = barrio;
        this.colegio = colegio;
        this.jornada = jornada;
        this.distanciaKm = distanciaKm;
        this.idMinibus = idMinibus;
        this.conductorAsignado = conductorAsignado;
        this.asistenteAsignado = asistenteAsignado;
        this.estado = estado;
        this.ninos = ninos;
        this.paradas= paradas;
 }

//Métodos get y set//
    public int getId() {
        return id;
    }

     public LocalDate getFechaRecorrido() {
        return fechaRecorrido;
    }

    public void setFechaRecorrido(LocalDate fechaRecorrido) {
        this.fechaRecorrido = fechaRecorrido;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public int getIdMinibus() {
        return idMinibus;
    }

    public void setIdMinibus(int idMinibus) {
        this.idMinibus = idMinibus;
    }



    public Conductor getConductorAsignado() {
        return conductorAsignado;
    }

    public void setConductorAsignado(Conductor conductorAsignado) {
        this.conductorAsignado = conductorAsignado;
    }

    public Asistente getAsistenteAsignado() {
        return asistenteAsignado;
    }

    public void setAsistenteAsignado(Asistente asistenteAsignado) {
        this.asistenteAsignado = asistenteAsignado;
    }

    public EstadoRecorrido getEstado() {
        return estado;
    }

    public void setEstado(EstadoRecorrido estado) {
        this.estado = estado;
    }

    public List<Nino> getNinos() {
        return ninos;
    }

    public void setNinos(List<Nino> ninos) {
        this.ninos = ninos;
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }

    @Override
    public String toString() {
        return "Recorrido{" + "id=" + id + ", fechaRecorrido=" + fechaRecorrido + ", barrio=" + barrio + ", colegio=" + colegio + ", jornada=" + jornada + ", distanciaKm=" + distanciaKm + ", idMinibus=" + idMinibus + ", conductorAsignado=" + conductorAsignado + ", asistenteAsignado=" + asistenteAsignado + ", estado=" + estado + ", ninos=" + ninos + ", paradas=" + paradas + '}';
    }
    
    

     //Método toString//
}
