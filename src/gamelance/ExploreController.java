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
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ExploreController implements Initializable {

    @FXML
    private Button chat;
    @FXML
    private Button buttonHome;
    @FXML
    private Button buttonAddRoom;
    @FXML
    private Button buttonProfil;
    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonAddFriend;
    @FXML
    private TextField tfExplore;
    @FXML
    private Button buttonValorant;
    @FXML
    private Button buttonMinecraft;
    @FXML
    private Button buttonGenshin;
    @FXML
    private Button buttonTerraria;
    @FXML
    private Button buttonMrBeast;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Chat(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "RoomChat.fxml");
    }

    @FXML
    private void addRoom(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "AddRoom.fxml");
    }

    @FXML
    private void Profil(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "PageBahasa.fxml");
    }

    @FXML
    private void Back(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "HomePage.fxml");
    }

    @FXML
    private void aAddFriend(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "AddFriend.fxml");
    }
    
}
