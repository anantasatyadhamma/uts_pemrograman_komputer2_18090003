/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Anan
 */
public class Koneksi {
    public static Connection MySQL(){
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser(Setting.user);
            ds.setPassword(Setting.pass);
            ds.setServerName(Setting.server);
            ds.setDatabaseName(Setting.db);
            ds.setServerTimezone(Setting.time);
            ds.setPortNumber(Integer.parseInt(Setting.port));
            System.out.print(Setting.user);
            System.out.print(Setting.pass);
            System.out.print(Setting.db);
            System.out.print(Setting.time);
            System.out.print(Setting.port);
            System.out.print(Setting.server);
           
            
            Connection c = ds.getConnection();
            return c;
        } catch (SQLException e) {
         
            System.err.println(e.getMessage());
            
            return null;
        }
        }
}
