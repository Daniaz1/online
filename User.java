/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shopping;



/**
 *
 * @author Daniafahad
 */
public class User {

    private String username;
    private String ID;
    private String Password;
    private String gender;
    private String city;

    public User(String username, String ID, String Password, String gender, String city) {
        this.username = username;
        this.ID = ID;
        this.Password = Password;
        this.gender = gender;
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
