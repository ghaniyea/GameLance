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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AddRoomController implements Initializable {
    ObservableList data = observableArrayList(
    new RoomList("Night Owl", 12),
    new RoomList("Hellfire Club", 7)
    );

    @FXML
    private Button buttonHome;
    @FXML
    private Button buttonProfil;
    @FXML
    private Button buttonBack;
    @FXML
    private Button buttonAddFriend;
    @FXML
    private Button chat;
    @FXML
    private TableView tableRoom;
    @FXML
    private TableColumn tcRoom;
    @FXML
    private Button buttonAdd;
    @FXML
    private TextField tfRoom;
    @FXML
    private Button buttonJoinRoom;
    @FXML
    private Button buttonAddRoom;
    @FXML
    private Button buttonExplore;
    @FXML
    private TableColumn tcMember;
    @FXML
    private TextField tfMember;
    

    /**
     * Initializes the controller class.
     */
    

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

    @FXML
    private void Chat(ActionEvent event) {
        modelHalaman h = new modelHalaman();
        h.pindahHalaman(event, "RoomChat.fxml");
    }

    @FXML
    private void Add(ActionEvent event) {
        String temp1 = tfRoom.getText();
        int temp2 = Integer.parseInt(tfMember.getText());
        
        data.add(new RoomList(temp1,temp2));
        tfRoom.setText("");
        tfMember.setText("");
    }

    @FXML
    private void joinRoom(ActionEvent event) {
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcRoom.setCellValueFactory(new PropertyValueFactory<RoomList, String>("Nama"));
        tcMember.setCellValueFactory(new PropertyValueFactory<RoomList, Integer>("Member"));
        tableRoom.setItems(data);
    }    
}
