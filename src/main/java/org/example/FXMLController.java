package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    @FXML
    private Label labelNumeroCliques;

    /*@Deprecated
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //int cont;
    @FXML
    public void btnCliqueContador(ActionEvent actionEvent) {
        //cont++;
        int contador = Integer.parseInt(labelNumeroCliques.getText())+1;

        labelNumeroCliques.setText(String.valueOf(contador));
        //System.out.println("Carregou Clicar");
    }
}
