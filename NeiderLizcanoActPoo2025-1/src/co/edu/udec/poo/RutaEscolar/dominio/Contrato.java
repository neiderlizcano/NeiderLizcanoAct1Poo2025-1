
package co.edu.udec.poo.RutaEscolar.dominio;
import java.util.Random;
import java.util.Date;
import java.util.List;

public class Contrato {
     //Atributos//
  private int id;
  private Date fechaInicio;
  private Date fechaTermino;
  private ModalidadServicio modalidad;
  private Apoderado apoderado;
  private int cantidadNinos;
  private double descuento;
  private String tipoDescuento;
  private double tarifaBase;
  private EstadoContrato estado;
  private List<Nino> ninos;
  private List<Pago> pagos;
  
 
    //Constructor por defecto "sin parámetros"//
    public Contrato() {
    }

    //Constructor con parámetros//
    public Contrato( Date fechaInicio, Date fechaTermino, ModalidadServicio modalidad, int cantidadNinos, Apoderado apoderado, double descuento,String tipoDescuento ,double tarifaBase, EstadoContrato estado, List<Nino> ninos, List<Pago> pagos) {
        Random random = new Random ();
        int numero= 10000 + random.nextInt(90000);
        this.id = numero;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.modalidad = modalidad;
        this.cantidadNinos = cantidadNinos;
        this.apoderado = apoderado;
        this.descuento = descuento;
        this.tipoDescuento = tipoDescuento;
        this.tarifaBase = tarifaBase;
        this.estado = estado;
        this.ninos = ninos;
        this.pagos = pagos;
    }

    //Métodos get y set//

    public int getId() {
        return id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public ModalidadServicio getModalidad() {
        return modalidad;
    }

    public void setModalidad(ModalidadServicio modalidad) {
        this.modalidad = modalidad;
    }

    public int getCantidadNinos() {
        return cantidadNinos;
    }

    public void setCantidadNinos(int cantidadNinos) {
        this.cantidadNinos = cantidadNinos;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public EstadoContrato getEstado() {
        return estado;
    }

    public void setEstado(EstadoContrato estado) {
        this.estado = estado;
    }

    public List<Nino> getNinos() {
        return ninos;
    }

    public void setNinos(List<Nino> ninos) {
        this.ninos = ninos;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
        
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    //Método toString//

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaTermino=" + fechaTermino + ", modalidad=" + modalidad + ", apoderado=" + apoderado + ", cantidadNinos=" + cantidadNinos + ", descuento=" + descuento + ", tipoDescuento=" + tipoDescuento + ", tarifaBase=" + tarifaBase + ", estado=" + estado + ", ninos=" + ninos + ", pagos=" + pagos + '}';
    }
    
 
}