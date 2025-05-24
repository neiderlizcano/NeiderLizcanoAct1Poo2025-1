package co.edu.udec.poo.RutaEscolar.dominio;

import java.util.List;

public class Apoderado extends Persona {
//Atributos//

    private List<Nino> ninos;
    private List<Contrato> contratos;
    
    //Constructor por defecto "sin parámetros"//
    public Apoderado() {
    }

    //Constructor con parámetros//
    public Apoderado(String nombre, String apellido, String celular, String email, List<Nino> ninos, List<Contrato> contratos) {
        super(nombre, apellido, celular, email);
        this.ninos = ninos;
        this.contratos = contratos;
    }

    //Metodos get y set//
   

    public List<Nino> getNinos() {
        return ninos;
    }

    public void setNinos(List<Nino> ninos) {
        this.ninos = ninos;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    @Override
    public String toString() {
        return super.toString() + " Lista de niños= " + ninos + ", Lista de contratos= " + contratos;
    }

    
}
