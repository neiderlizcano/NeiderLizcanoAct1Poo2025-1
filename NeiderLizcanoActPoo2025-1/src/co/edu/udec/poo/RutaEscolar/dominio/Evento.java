package co.edu.udec.poo.RutaEscolar.dominio;
import java.util.Random;
import java.time.LocalDateTime;

public class Evento {

    //Atributos//
    private int id;
    private LocalDateTime fechaHora;
    private String tipo;
    private String descripcion;
    private String gravedad;
    private String ubicacion;
    private boolean afectaRecorrido;
    private String recorridoId;

    //Constructor por defecto "sin parámetros"//
    public Evento() {
    }
    //Constructor con parámetros//
    public Evento(LocalDateTime fechaHora, String tipo, String descripcion, String gravedad, String ubicacion, boolean afectaRecorrido, String recorridoId) {
        Random random = new Random ();
        int numero= 10000 + random.nextInt(90000);
        this.id = numero;
        this.fechaHora = fechaHora;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.gravedad = gravedad;
        this.ubicacion = ubicacion;
        this.afectaRecorrido = afectaRecorrido;
        this.recorridoId = recorridoId;
    }
    //Métodos get y set//

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isAfectaRecorrido() {
        return afectaRecorrido;
    }

    public void setAfectaRecorrido(boolean afectaRecorrido) {
        this.afectaRecorrido = afectaRecorrido;
    }

    public String getRecorridoId() {
        return recorridoId;
    }

    public void setRecorridoId(String recorridoId) {
        this.recorridoId = recorridoId;
    }
    //Método toString//
    
    @Override
    public String toString (){
    return "Acaba de suceder un evento, esta es la información: \n"
            + "Tipo: " + tipo + ", Fecha/Hora: " + fechaHora + "\n"
            + "Descripción: " + descripcion + ", Gravedad: " + gravedad + "\n"
            + "Ubicación: " + ubicacion + ", Afecta recorrido: " + (afectaRecorrido ? "Sí" : "No") + "\n"
            + "ID Recorrido: " + recorridoId;   
    }

}
