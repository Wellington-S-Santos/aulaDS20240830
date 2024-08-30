package com.example.projetojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtAno;

    @FXML
    private TextField txtCombustivel;

    @FXML
    protected void onCadastrarCarro(){

    }

  


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bem-Vindo ao mundo JavaFX");
    }
}