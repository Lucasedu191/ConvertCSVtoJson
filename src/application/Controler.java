package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

@SuppressWarnings("unused")
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
		this.fileCSV = fileChooser.showOpenDialog((Stage) ((Node) event.getSource()).getScene().getWindow());
		fileChooser.setTitle("Arquivo CSV para conversão");
		try {
			Scanner inputStream = new Scanner(fileCSV);
			txtArea.appendText("Começar a leitura: \n");
			
			while (inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] values = data.split("\n");
				txtArea.appendText(values[0] + "*** \n");
			}
			inputStream.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		}

}
