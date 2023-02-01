package Controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ClassConnection_KhoHang {
    public Connection Connection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String a = "jdbc:mysql://localhost:3306/quanlibanhang?allowPublicKeyRetrieval=true&useSSL=false";
            String b = "root";
            String c = "01644863554qm";
            conn = (Connection) DriverManager.getConnection(a, b, c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn ;
    }
}
