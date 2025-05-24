package co.edu.udec.poo.RutaEscolar.dominio;
import java.util.Random;
import java.util.Date;

public class Pago {
//Atributos//

    private int id;
    private int idContrato;
    private double monto;
    private Date fecha;
    private EstadoPago estado;

    //Constructor por defecto "sin parámetros"//
    public Pago() {
    }

    //Constructor con parámetros//

    public Pago(int id, int idContrato, double monto, Date fecha, EstadoPago estado) {
        Random random = new Random ();
        int numero= 10000 + random.nextInt(90000);
        this.id = numero;
        this.idContrato = idContrato;
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
         }
   
   

    //Métodos get y set//
    public int getId() {
        return id;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }

    //Método toString//
    @Override
    public String toString() {
        return "Información sobre su pago: \n"
                + "Pago{" + "id=" + id + ", monto=" + monto
                + ", fecha=" + fecha + ", estado=" + estado + '}';
    }
}
