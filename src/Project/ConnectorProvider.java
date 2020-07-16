/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author Gagan
 */
public class ConnectorProvider {
    public static Connection getConnection()
    {
        try
        {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "gaganjyoti");
            return connection;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
