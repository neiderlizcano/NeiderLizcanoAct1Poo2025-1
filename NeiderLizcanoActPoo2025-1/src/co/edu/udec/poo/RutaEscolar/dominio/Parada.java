
package co.edu.udec.poo.RutaEscolar.dominio;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parada {
    
    //Atributos
    private String colegio;
    private LocalTime horaLlegada;
    private LocalTime horaSalida; // si aplica
    private List<Nino> ninosAsignados;

    public Parada() {
    }

    public Parada(String colegio, LocalTime horaLlegada, LocalTime horaSalida, List<Nino> ninosAsignados) {
        this.colegio = colegio;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.ninosAsignados = ninosAsignados;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public List<Nino> getNinosAsignados() {
        return ninosAsignados;
    }

    public void setNinosAsignados(List<Nino> ninosAsignados) {
        this.ninosAsignados = ninosAsignados;
    }

    @Override
    public String toString() {
        return "Parada{" + "colegio=" + colegio + ", horaLlegada=" + horaLlegada + ", horaSalida=" + horaSalida + ", ninosAsignados=" + ninosAsignados + '}';
    }
     
}
    

