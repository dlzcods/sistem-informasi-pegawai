package simpeg_abdiel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class Db {
    
    static private Connection c;
    
    public static Connection getCon() throws Exception{
        
        if (c == null){
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbpegawai2","root","");
        }
        return c;
    }
    
    public static void setData(String s) throws Exception{
        Db.getCon().createStatement().executeUpdate(s);
    }
    public static  ResultSet getData(String sql) throws Exception{
        return Db.getCon().createStatement().executeQuery(sql);
    }
}
