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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class RoomChatController implements Initializable {

    @FXML
    private Button buttonAddFriend;
    @FXML
    private Button buttonHome;
    @FXML
    private Button buttonProfil;
    @FXML
    private TextField tfMessage;
    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonAddRoom;
    @FXML
    private Button buttonExplore;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void aAddFriend(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "AddFriend.fxml");
    }

    @FXML
    private void Home(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "HomePage.fxml");
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
    private void AddRoom(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "AddRoom.fxml");
    }

    @FXML
    private void Explore(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "Explore.fxml");
    }
    
}
