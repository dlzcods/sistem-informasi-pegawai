package simpeg_abdiel;
import java.sql.*;

public class config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3307/dbpegawai2";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        }catch (Exception e){
            System.out.println("koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
}

