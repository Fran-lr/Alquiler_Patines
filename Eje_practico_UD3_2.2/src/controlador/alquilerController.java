package controlador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import modelo.AlquilerModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.DatePicker;

public class alquilerController implements Initializable {
	@FXML
	private TextField nombreCompleto;
	@FXML
	private TextField numeroSerie;
	@FXML
	private DatePicker fechaRecogida;
	@FXML
	private DatePicker fechaDevolucion;
	@FXML
	private Button botonAlquiler;

	

	// Event Listener on Button[#botonAlquiler].onAction
	@FXML
	public void handleButtonAction(ActionEvent event) {
		System.out.println("Nuevo alquiler");
		// Comprobamos el campo nombreCompleto
		if (nombreCompleto.getText().isEmpty()) {
			nombreCompleto.setStyle("-fx-control-inner-background:#ef9a9a");
		} else if (numeroSerie.getText().isEmpty()) {
			numeroSerie.setStyle("-fx-control-inner-background:#ef9a9a");
		} else if (fechaRecogida.getValue() == null) {
			fechaRecogida.setStyle("-fx-control-inner-background:#ef9a9a");
		} else if (fechaDevolucion.getValue() == null) {
			fechaDevolucion.setStyle("-fx-control-inner-background:#ef9a9a");
		} else {

			System.out.println("Todos los campos tienen un valor");

		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("Inicializo Eventos y otros elementos");
		botonAlquiler.setOnAction(this::handleButtonAction);
	
	}
}
