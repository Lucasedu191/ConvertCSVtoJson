package application;
	
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("CenaConvert.fxml"));
			Scene scene = new Scene(root,350,350);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	 private void LocalizarCSV(ActionEventt event) {
		 BtConvert.setDisable(true);
	        FileChooser fileChooser = new FileChooser();
	        fileChooser.setInitialDirectory(new File("C:\\Users\\Usuário\\Downloads\\brasil"));
	        fileChooser.setTitle("Arquivo CSV para conversão");
	        txtcaminho = fileChooser.showOpenDialog((Stage) ((Node) event.getSource()).getScene().getWindow());
	        if (fileCSV != null)
	        	txtgravar.appendText("\nARQUIVO DE ORIGEM: " + fileCSV.toString());
	        verificaSeArquivosSelecionados();
	    }
}
