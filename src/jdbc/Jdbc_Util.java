package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_Util {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        //db 접근 설정정보///////////////////////////////////////////////////
        String db_url = "jdbc:mysql://localhost:3306/saengji";
        String db_user = "root";
        String db_password = "0518";
        ///////////////////////////////////////////////////////////////////

        // create a connection to the database
        conn = DriverManager.getConnection(db_url, db_user, db_password);

        return conn;
    }
}