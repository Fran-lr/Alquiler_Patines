package controlador;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import modelo.AlquilerModel;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	
	private static AlquilerModel alModel;
	

	
	@Override
	public void start(Stage primaryStage) {

		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/vista/alquiler.fxml"));
			// Cargo la ventana
			Pane ventana = (Pane) loader.load();

			// Cargo el scene con un tamanio
			Scene scene = new Scene(ventana);
		
			// Seteo la scene y la muestro
			primaryStage.setTitle("Alquiler de patines");
			primaryStage.setScene(scene );
			primaryStage.show();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
		
	}
}
