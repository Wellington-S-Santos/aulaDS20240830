package com.example.projetojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
    private TextArea txtAreaDados;
    private Carro carro;


    @FXML
    protected void onCadastrarCarro(){

        if (txtPlaca.getText().equals("")){
            avisaCampoBranco("Placa em Branco!!");
            return;
        }
        if (txtModelo.getText().equals("")){
            avisaCampoBranco("Modelo em Branco!!");
            return;
        }
        




        carro = new Carro(txtPlaca.getText(),txtModelo.getText(), Integer.parseInt(txtAno.getText()),txtCombustivel.getText());
        txtAreaDados.setText(carro.toString());

    }

    private void avisaCampoBranco(String campo){
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle("Aviso");
        alert.setHeaderText("Campo em Banco");
        alert.setContentText(campo);
        alert.show();
        return;
    }


}