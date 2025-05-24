package co.edu.udec.poo.RutaEscolar.dominio;
import java.util.Random;

public class Persona {

    //Atributos//
    private int id;
    private String nombre;
    private String apellido;
    private String celular;
    private String email;

    //Constructor por defecto "sin parámetros"//
    public Persona() {
    }

    //Constructor con parámetros//
    public Persona(String nombre, String apellido, String celular, String email) {
        Random random = new Random ();
        int numero= 10000 + random.nextInt(90000);
        this.id = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
    }
    //Metodos get y set//

    public int getId() {
        return id;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id = " + id + ", nombre = " + nombre + ", apellido = " + apellido + ", celular = " + celular + ", email = " + email;
    }
         
   }