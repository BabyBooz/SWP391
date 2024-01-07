/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author linhnghiem
 */
public class Account {
    int id;
    String user;
    String password;
    String email;
    int phone;
    String describe;

    public Account() {
    }

    public Account(int id, String user, String password, String email, int phone, String describe) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.describe = describe;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", user=" + user + ", password=" + password + ", email=" + email + ", phone=" + phone + ", describe=" + describe + '}';
    }

    
}
