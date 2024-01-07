/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
//TANG DAN PRICE
//select * from Product where price < 700
//order by price asc


public class DAO extends MyDAO {

  
    

    public Account login(String user, String pass) {
        String query = "select * from Account where [user] = ? and [password] = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), 
                        rs.getString(2),
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getInt(5), 
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        Account a = dao.login("admin1", "12345");
        System.out.println(a.toString());
    }
}

