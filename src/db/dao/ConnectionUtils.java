package db.dao;

import MainConstants.MainConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class ConnectionUtils {

    public static Connection getConnection(){
        Connection connection = null;
        try{
        String dbURL = MainConstants.DB_ADDRESS;
        
        Properties properties = new Properties();
        properties.put("user",MainConstants.DB_USER);
        properties.put("password",MainConstants.DB_PASS);
        connection = DriverManager.getConnection (dbURL, properties);
        
        }catch (SQLException ex){
        ex.printStackTrace();
        }
        return connection;
    }
}
