/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Mai
 */
public class Account {
    String Username;
    String Gmail;
    String Password;
    String ConfirmPass;

    public Account(String Username, String Gmail, String Password, String ConfirmPass) {
        this.Username = Username;
        this.Gmail = Gmail;
        this.Password = Password;
        this.ConfirmPass = ConfirmPass;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getConfirmPass() {
        return ConfirmPass;
    }

    public void setConfirmPass(String ConfirmPass) {
        this.ConfirmPass = ConfirmPass;
    }
    
    
    
}
