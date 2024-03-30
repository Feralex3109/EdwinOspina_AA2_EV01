/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ModuloStockProJDBC;
import java.sql.*;

public class DeleteExampleStockProJDBC {
    public static void main(String[] args) {
        
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3307/bd_test"; // Agregar el nombre de la base de datos
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            statement = conexion.createStatement();
            statement.executeUpdate("DELETE FROM USUARIOS WHERE NOMBRE = 'Alex'");
            rs = statement.executeQuery("SELECT * FROM USUARIOS");
            
            while (rs.next()) {
                System.out.println(rs.getInt("ID") + ":" + rs.getString("NOMBRE") + ":" + rs.getString("OtroCampo"));
            }
        } catch (SQLException | ClassNotFoundException ex){ // Cambiar el orden para que SQLException esté primero
            ex.printStackTrace();
        }
    }
}


