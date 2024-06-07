package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Datos de conexión
        String url = "jdbc:mysql://localhost:3306/tienda";
        String usuario = "maria";
        String contraseña = "123456789";


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);


            if (conexion != null) {
                System.out.println("¡Conexión exitosa!");
            } else {
                System.out.println("Fallo al conectar.");
            }

            // Cerrar la conexión
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}