package co.edu.udec.poo.RutaEscolar.dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    //Atributos//
    private String nombre;
    private String nit;
    private String telefono;
    private String email;
    private String direccion;
    //Listas que debe tener la empresa//
    private List<Minibus> minibuses;
    private List<Conductor> conductores;
    private List<Asistente> asistentes;
    private List<Contrato> contratos;
    private List<Recorrido> recorridos;
    private List<Nino> ninos;
    private List<Apoderado> apoderados;


    //Inicializaremos las listas con un método, el método void (no retorna valor)//
    private void inicioListas() {
        //Uso this para referirse a la lista que almacena los objetos//
        this.minibuses = new ArrayList<>(); //LISTA DE MINIBUSES//
        this.conductores = new ArrayList<>(); //LISTA DE CONDUCTORES//
        this.asistentes = new ArrayList<>(); //LISTA DE ASISTENTES//
        this.contratos = new ArrayList<>(); //LISTA DE CONTRATOS//
        this.recorridos = new ArrayList<>(); //LISTA RECORRIDOS//
        this.ninos = new ArrayList<>(); //LISTA ninos//
        this.apoderados = new ArrayList<>(); //LISTA apoderaodas//
    }
    
     //Método para agregar a las listas//
    public void agregarMinibus(Minibus minibus1) {
        minibuses.add(minibus1);
    }
    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);}
    public void agregarAsistente(Asistente asistente) {
        asistentes.add(asistente);}
    public void agregarContrato(Contrato contrato) {
        contratos.add(contrato);}
    public void agregarRecorrido(Recorrido recorrido) {
        recorridos.add(recorrido);}
    public void agregarApoderado(Apoderado apoderado) {
        apoderados.add(apoderado);}
    public void agregarNino(Nino nino) {
        ninos.add( nino);}

    //Constructor por defecto "sin parámetros"//
    public Empresa() {
        inicioListas();
    }
    //Constructor con parámetros//

    public Empresa(String nombre, String nit, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        inicioListas();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Minibus> getMinibuses() {
        return minibuses;
    }

    public void setMinibuses(List<Minibus> minibuses) {
        this.minibuses = minibuses;
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public List<Nino> getNinos() {
        return ninos;
    }

    public void setNinos(List<Nino> ninos) {
        this.ninos = ninos;
    }

    public List<Apoderado> getApoderados() {
        return apoderados;
    }

    public void setApoderados(List<Apoderado> apoderados) {
        this.apoderados = apoderados;
    }


    //Método toString//
    @Override
    public String toString() {
        return "Datos de la empresa: \n"
                + "Nombre: " + nombre + ", NIT: " + nit + "\n"
                + "Teléfono: " + telefono + ", Correo: " + email + "\n"
                // se usa .size para mostrar solamente la cantidad//
                + "Dirección: " + direccion + ", Total de buses: " + minibuses.size() + "\n"
                + "Total de conductores: " + conductores.size() + ", Total de asistentes: " + asistentes.size() + "\n"
                + "Contratos: " + contratos.size() + ", Recorridos: " + recorridos.size();
    }
}
