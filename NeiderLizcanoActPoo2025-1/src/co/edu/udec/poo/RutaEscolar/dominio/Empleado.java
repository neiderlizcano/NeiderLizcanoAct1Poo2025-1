/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.RutaEscolar.dominio;

public class Empleado extends Persona{
private JornadaTurno jornadaTurno;
    
public Empleado () {
super();
}

    public Empleado(JornadaTurno jornadaTurno, String nombre, String apellido, String celular, String email) {
        super(nombre, apellido, celular, email);
        this.jornadaTurno = jornadaTurno;
    }

    public JornadaTurno getJornadaTurno() {
        return jornadaTurno;
    }

    public void setJornadaTurno(JornadaTurno jornadaTurno) {
        this.jornadaTurno = jornadaTurno;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "jornadaTurno=" + jornadaTurno + '}';
    }


}
