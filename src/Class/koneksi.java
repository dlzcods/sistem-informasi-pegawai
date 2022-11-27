package simpeg_abdiel;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    public Connection con;
    public Statement stat;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/dbpegawai2","root","");
            stat=con.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"koneksi gagal"+ e.getMessage());
        }
    }

    public Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

