import java.sql.*;

public class MySQLConnection {
    
    static String url = "jdbc:mysql://localhost:3306/prolab2_proje4?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&autoReconnect=true&useSSL=false";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "123";
    private static Connection connection;
    
    public static Connection getConnection(){
        
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException ex) {
            throw new IllegalStateException("Driver bulunamadı!", ex);
        }
        
        try{
            connection = DriverManager.getConnection(url, username, password);
        }catch (SQLException ex){
            throw new IllegalStateException("Databaseye bağlanılamadı!", ex);
        }
        
        return connection;
    }
}
