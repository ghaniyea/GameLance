/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamelance;

/**
 *
 * @author ASUS
 */
public class RoomList {
    String Nama;
    int Member;

    public RoomList(String Nama, int Member) {
        this.Nama = Nama;
        this.Member = Member;
    }

    public String getNama() {
        return Nama;
    }
    
    public int getMember() {
        return Member;
    }
    
}
