/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpPackage;

/**
 *
 * @author ASUS
 */
public class DoorMachine {
    private String state = "Terkunci";
    public void pintu(String command) {
        switch (command) {
            case "BukaPintu":
                this.state = "Terbuka";
                break;
            case "KunciPintu":
                this.state = "Terkunci";
                break;
        }
    }
    public String getState(){
        return this.state;

    }
}
