/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import static Constant.CommonConstant.*;

/**
 *
 * @author Admin
 */
public class Connect_to_DB {
    public static Connection openConnectionUser() throws Exception{
        Connection con = DriverManager.getConnection( DB_URL, DB_USERNAME, DB_PASSWORD);
        return con;
    }
}
