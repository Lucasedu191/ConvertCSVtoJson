package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;

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
	
	//C:\Users\lucas\OneDrive\Documentos\faculdade\5periodo\java\brasil
	
}
