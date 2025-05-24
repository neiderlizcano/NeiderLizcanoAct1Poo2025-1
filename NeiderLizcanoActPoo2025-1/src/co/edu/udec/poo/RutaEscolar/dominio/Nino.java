package co.edu.udec.poo.RutaEscolar.dominio;

import java.time.LocalTime;

public class Nino extends Persona {

    //Atributos//
    private String direccionCasa;
    private String direccionColegio;
    private String colegio;
    private LocalTime horaRecogida;
    private LocalTime horaRegreso;
    private Apoderado apoderado;

    //Constructor por defecto "sin parámetros"//
    public Nino() {
    }

    //Constructor con parámetros//
    public Nino(String nombre, String apellido, String celular, String email,
            String direccionCasa, String direccionColegio, String colegio,
            LocalTime horaRecogida, LocalTime horaRegreso, Apoderado apoderado) {
        super(nombre, apellido, celular, email);
        this.direccionCasa = direccionCasa;
        this.direccionColegio = direccionColegio;
        this.colegio = colegio;
        this.horaRecogida = horaRecogida;
        this.horaRegreso = horaRegreso;
        this.apoderado = apoderado;
    }

    //Metodos get y set//
    public String getDireccionCasa() {
        return direccionCasa;
    }

    public void setDireccionCasa(String direccionCasa) {
        this.direccionCasa = direccionCasa;
    }

    public String getDireccionColegio() {
        return direccionColegio;
    }

    public void setDireccionColegio(String direccionColegio) {
        this.direccionColegio = direccionColegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public LocalTime getHoraRecogida() {
        return horaRecogida;
    }

    public void setHoraRecogida(LocalTime horaRecogida) {
        this.horaRecogida = horaRecogida;
    }

    public LocalTime getHoraRegreso() {
        return horaRegreso;
    }

    public void setHoraRegreso(LocalTime horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    //Método toString//
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Dirección Casa: " + direccionCasa + "\n"
                + "Colegio: " + colegio + ", Dirección Colegio: " + direccionColegio + "\n"
                + "Hora Recogida: " + horaRecogida + ", Hora Regreso: " + horaRegreso + "\n"
                + "Apoderado: " + apoderado;
    }

}
