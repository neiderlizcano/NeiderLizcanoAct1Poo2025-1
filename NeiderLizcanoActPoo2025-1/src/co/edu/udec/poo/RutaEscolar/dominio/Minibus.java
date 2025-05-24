package co.edu.udec.poo.RutaEscolar.dominio;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


 public class Minibus {

    //Atributos//
    private int id;
    private String placa;
    private double kilometrajeActual;
    private int capacidadMaxima = 10;
    private EstadoMinibus estado;
    private int cuposOcupados = 0; // Variable contadora
    private ArrayList <String> cupos;
    private double KilometrajeLimiteMantenimiento = 10000;

    //Constructor por defecto "sin parámetros"//
    public Minibus() {
    }
//Constructor con parámetros//

    public Minibus(String placa, double kilometrajeActual, EstadoMinibus estado) {
        Random random = new Random ();
        int numero= 10000 + random.nextInt(90000);
        this.id = numero;
        this.placa = placa;
        this.kilometrajeActual = kilometrajeActual;
        this.estado = estado;
    }
 public Minibus(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cupos = new ArrayList<>(capacidadMaxima);
 }
//Metodo de variable conteo//
    
   public void agregarNino(String nino) {
    if (cuposOcupados < capacidadMaxima) {
        cupos.add(nino);
        cuposOcupados++;
        System.out.println("Niño agregado correctamente. Cupos ocupados: " + cuposOcupados);
    } else {
        System.out.println("No hay cupos disponibles");
    }
   }
    
    //Metodos get y set//
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(double kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public EstadoMinibus getEstado() {
        return estado;
    }

    public void setEstado(EstadoMinibus estado) {
        this.estado = estado;
    }

    public int getCuposOcupados() {
        return cuposOcupados;
    }

    public void setCuposOcupados(int cuposOcupados) {
        this.cuposOcupados = cuposOcupados;
    }

    public ArrayList<String> getCupos() {
        return cupos;
    }

    public void setCupos(ArrayList<String> cupos) {
        this.cupos = cupos;
    }

    public double getKilometrajeLimiteMantenimiento() {
        return KilometrajeLimiteMantenimiento;
    }

    public void setKilometrajeLimiteMantenimiento(double KilometrajeLimiteMantenimiento) {
        this.KilometrajeLimiteMantenimiento = KilometrajeLimiteMantenimiento;
    }
  //Método toString//
    @Override
public String toString() {
    return "Información sobre el minibus:\n"
            + "ID: " + id + "\n"
            + "Placa: " + placa + ", Estado: " + estado + "\n"
            + "Kilometraje: " + kilometrajeActual + " / Kilometraje Límite de Mantenimiento: " + KilometrajeLimiteMantenimiento + "\n"
            + "Capacidad: " + capacidadMaxima + " pasajeros";
    }
}