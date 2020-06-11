package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controler implements Initializable {

	@FXML
	private Button lerCSV;

	@FXML
	private Button converterCSV;

	@FXML
	private TextField txtcaminho;

	@FXML
	private TextField txtgravar;

	@FXML
	private Button gravarJson;

	@FXML
	private TextArea txtArea;

	private File fileCSV;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	private void ArquivoCSV(ActionEvent event) {

		FileChooser fileChooser = new FileChooser();
		//fileChooser.setInitialDirectory(new File("C:\\Users\\Usuário\\Downloads\\brasil"));
		fileChooser.setTitle("Arquivo CSV para conversão");
		this.fileCSV = fileChooser.showOpenDialog((Stage) ((Node) event.getSource()).getScene().getWindow());
		if (fileCSV != null)
			txtcaminho.appendText("\nARQUIVO DE ORIGEM: " + fileCSV.toString());

	}
	
	


}
