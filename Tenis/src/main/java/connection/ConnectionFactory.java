/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

/**
 *
 * @author cleri
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
private static final String URL = "jdbc:mysql://localhost:3306/tenis;
private static final String USER = "root"; 
private static final String PASSWORD = "";
public static Connection getConnection() {
try {
// Tenta estabelecer a conexão
return DriverManager.getConnection(URL, USER, PASSWORD);
} catch (SQLException e) {
throw new RuntimeException("Erro ao conectar ao banco de dados", e);
}
}

    
}