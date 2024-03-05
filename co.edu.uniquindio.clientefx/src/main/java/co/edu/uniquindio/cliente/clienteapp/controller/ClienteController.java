package co.edu.uniquindio.cliente.clienteapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.clienteapp.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class ClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtTelefonoFijo;

    @FXML
    private TextField txtCedula;

    @FXML
    private Button btnAgregarCliente;


    @FXML
    void onAgregarCliente(ActionEvent event) {
        agregarCliente();

    }
     @FXML
     private Label myLabel;

    @FXML
    private RadioButton rButtonClienteBasico, rButtonClientePremium, rButtonClienteVip;

    public void getTipoCliente(ActionEvent event){

        if(rButtonClienteBasico.isSelected()){
            myLabel.setText(rButtonClienteBasico.getText());
        }
        else if(rButtonClientePremium.isSelected()){
            myLabel.setText(rButtonClientePremium.getText());
        }
        else if(rButtonClienteVip.isSelected()){
            myLabel.setText(rButtonClienteVip.getText());
        }
    }



    @FXML
    void initialize() {

    }
    private void agregarCliente() {
       Cliente cliente = new Cliente();

        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellido.getText());
        cliente.setCedula(txtCedula.getText());
        cliente.setEdad(Integer.parseInt(txtEdad.getText()));
        cliente.setTelefonoFijo(txtTelefonoFijo.getText());
        cliente.setTelefonoCelular(txtCelular.getText());


        txtResultado.setText(cliente.toString());



    }

   // @FXML
    //private RadioButton rButtonClientePremium;
    //public void getClientePremium(ActionEvent actionEvent) {
      //  if(rButtonClientePremium.isSelected()){
        //    myLabel.setText(rButtonClientePremium.getText());
        //}

    //}
    //@FXML
    //private RadioButton rButtonClienteVip;
    //public void getClienteVip(ActionEvent actionEvent) {
    //    if(rButtonClienteVip.isSelected()){
     //       myLabel.setText(rButtonClienteVip.getText());
    //    }
    //}

    public void geTipoCliente(ActionEvent actionEvent) {
 }
}

