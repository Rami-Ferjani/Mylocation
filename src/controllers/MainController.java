package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class MainController implements Initializable {

	
	@FXML
    private Button btn_seconnecter;

    @FXML
    private Button btn_sinscrir;

    @FXML
    private VBox VBox;
    
    private Parent fxml;
    @FXML
    void openSignUp() {
    	TranslateTransition t=new TranslateTransition(Duration.seconds(1),VBox);
		t.setToX(0);
		t.play();
		t.setOnFinished(e ->{
			try {
				fxml=FXMLLoader.load(getClass().getResource("/interfaces/SingUp.fxml"));
				VBox.getChildren().removeAll();
				VBox.getChildren().setAll(fxml);
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		});
    }

    @FXML
    void openSingIn() {
    	TranslateTransition t=new TranslateTransition(Duration.seconds(1),VBox);
    	t.setToX(VBox.getLayoutX() * 19.1);
		t.play();
		t.setOnFinished(e ->{
			try {
				fxml=FXMLLoader.load(getClass().getResource("/interfaces/SingIn.fxml"));
				VBox.getChildren().removeAll();
				VBox.getChildren().setAll(fxml);
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		});

    }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TranslateTransition t=new TranslateTransition(Duration.seconds(1),VBox);
		t.setToX(VBox.getLayoutX() * 19.1);
		t.play();
		t.setOnFinished(e ->{
			try {
				fxml=FXMLLoader.load(getClass().getResource("/interfaces/SingIn.fxml"));
				VBox.getChildren().removeAll();
				VBox.getChildren().setAll(fxml);
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		});
		
	}

	

}