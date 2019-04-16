import java.sql.*;
import javax.swing.*;

public class koneksi2 {
    private static Connection conn;
    public static Connection koneksiDB() throws SQLException{
        if(conn==null){
            try{
                String database = "jdbc:mysql://localhost:3306/database_perpustakaan";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(database,username,password);
                System.out.println("Koneksi Berhasil");
                
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return conn;
    }
    
}
