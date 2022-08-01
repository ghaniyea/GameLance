/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gamelance;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AddFriendController implements Initializable {

    ObservableList data = observableArrayList(
    new ModelAddFriend("Anya", "ATHY1207"),
    new ModelAddFriend("Alex", "116ALOHA"),
    new ModelAddFriend("Patrick", "S7ARP12K")
    );
     
    @FXML
    private Button buttonHome1;
    @FXML
    private Button buttonChat1;
    @FXML
    private Button buttonSend;
    private Label label;
    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonProfil1;
    @FXML
    private TableView tableAddFriend;
    @FXML
    private TextField tfNama;
    @FXML
    private TextField tfID;
    @FXML
    private TableColumn tcName;
    @FXML
    private TableColumn tcID;
    @FXML
    private Button buttonAddRoom;
    @FXML
    private Button buttonExplore;
    
    
        
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcName.setCellValueFactory(new PropertyValueFactory<ModelAddFriend, String>("Nama"));
        tcID.setCellValueFactory(new PropertyValueFactory<ModelAddFriend, String>("ID"));
        tableAddFriend.setItems(data);
    }    
       
    @FXML
    private void Home1(ActionEvent event) {
         modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "HomePage.fxml");
    }

    @FXML
    private void Chat1(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "RoomChat.fxml");
    }

    @FXML
    private void SendFriendRequest(ActionEvent event) {
        String temp1 = tfNama.getText();
        String temp2 = tfID.getText();
        
        data.add(new ModelAddFriend(temp1,temp2));
        tfNama.setText("");
        tfID.setText("");
    }

    @FXML
    private void Back(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "HomePage.fxml");
    }

    @FXML
    private void Profil1(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "PageKategori.fxml");
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
