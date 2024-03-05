package co.edu.uniquindio.cliente.clienteapp.model;

public class Cliente {

    private String cedula;

    private String nombre;

    private String apellido;

    private int edad;

    private String telefonoFijo;

    private String telefonoCelular;


    private String clienteBasico;

    private String clientePremium;

    private String clienteVip;


    public Cliente() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }




    @Override
    public String toString() {
        return "Cliente:  " +
                "  cedula : '" + cedula + '\'' +
                ",  nombre :  '" + nombre + '\'' +
                ",  apellido :  '" + apellido + '\'' +
                ",  edad :  " + edad +
                ",  telefono Fijo :  '" + telefonoFijo + '\'' +
                ",  telefono Celular :  '" + telefonoCelular + '\'' +
                '.';
    }
}