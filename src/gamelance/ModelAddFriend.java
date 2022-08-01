/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamelance;

/**
 *
 * @author ASUS
 */
public class ModelAddFriend {
    String Nama;
    String ID;
    
    public ModelAddFriend(String x, String y){
        this.Nama = x;
        this.ID = y;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getID(){
        return ID;
    }
}