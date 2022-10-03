/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.alurahotel.test;

import java.sql.Connection;
import java.sql.SQLException;
import mx.com.alurahotel.factory.ConnectionFactory;

/**
 *
 * @author Ramiro Gabriel Taramasco
 */
public class TestConexion {
    
    public static void main(String[] args) {
        try(Connection c = new ConnectionFactory().realizarConexion();){
            System.out.println(c);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
