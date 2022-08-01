/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gamelance;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class PageBahasaController implements Initializable {

    @FXML
    private Button buttonHome;
    @FXML
    private Button buttonKategori;
    @FXML
    private TextField tfSearch;
    @FXML
    private Button buttonSave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Home(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "HomePage.fxml");
    }

    @FXML
    private void Kategori(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "PageKategori.fxml");
    }

    @FXML
    private void Save(ActionEvent event) {
    }

    
}
