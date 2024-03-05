package co.edu.uniquindio.cliente.clienteapp.model;

public class tipoCliente {

    private String clienteBasico;

    private String clientePremium;

    private String clienteVip;

    public tipoCliente(){

    }


    public void setClienteBasico(String clienteBasico) {
        this.clienteBasico = clienteBasico;
    }

    public String getClienteBasico() {
        return clienteBasico;
    }

    public String getClientePremium() {
        return clientePremium;
    }

    public void setClientePremium(String clientePremium) {
        this.clientePremium = clientePremium;
    }

    public String getClienteVip() {
        return clienteVip;
    }

    public void setClienteVip(String clienteVip) {
        this.clienteVip = clienteVip;

    }
    @Override
    public String toString() {
        String ClientePremium = new String();
        return "tipoCliente{" +
                "Cliente Basico='" + clienteBasico + '\'' +
                ", Cliente Premium ='" + clientePremium+ '\'' +
                ", Cliente VIP='" + clienteVip + '\'' +
                '}';
    }
}







