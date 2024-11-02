/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO_interface.DAO_Inter;
import DatabaseConnection.Connect_to_DB;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Constant.CommonConstant;

import static Constant.CommonConstant.DB_TABLE_USER;

/**
 * @author Admin
 */
public class UserDAO implements DAO_Inter<User> {

    public static UserDAO getInstance() {
        return new UserDAO();
    }

    public List<User> getAll() throws Exception {
        List<User> listUsers = new ArrayList<>();
        String SQL = "SELECT * FROM " + DB_TABLE_USER;
        try (
                Connection con = Connect_to_DB.openConnectionUser();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(SQL);
        ) {
            while (rs.next()) {
                User us = new User();
                us.setId(rs.getInt("user_id"));
                us.setName(rs.getString("username"));
                us.setPassword(rs.getString("password"));
                listUsers.add(us);
            }
            return listUsers;
        }
    }

    @Override
    public boolean insert(User user) throws Exception {
        String SQL = "INSERT INTO " + DB_TABLE_USER + " VALUES (?,?,?)";
        try (
                Connection con = Connect_to_DB.openConnectionUser();
                PreparedStatement pstmt = con.prepareStatement(SQL);
        ) {
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());
            return pstmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean update(User user) throws Exception {
        String SQL = "UPDATE " + DB_TABLE_USER + " SET username = ?, password = ? WHERE user_id = ?";
        try (
                Connection con = Connect_to_DB.openConnectionUser();
                PreparedStatement pstmt = con.prepareStatement(SQL);
        ) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getId());
            return pstmt.executeUpdate() > 0; // Thực thi câu lệnh SQL và trả về số dòng bị ảnh hưởng trong cơ sở dữ liệu.
        }
    }

    @Override
    public boolean delete(User user) throws Exception {
        String SQL = "DELETE FROM " + DB_TABLE_USER + " WHERE user_id = ?";
        try (
                Connection con = Connect_to_DB.openConnectionUser();
                PreparedStatement pstmt = con.prepareStatement(SQL);

        ) {
            pstmt.setInt(1, user.getId());
            return pstmt.executeUpdate() > 0;
        }
    }


    @Override
    public User searchById(String t) throws Exception {
        String SQL = "SELECT * FROM " + DB_TABLE_USER + " WHERE user_id = ?";
        User us = new User();
        try (
                Connection con = Connect_to_DB.openConnectionUser();
                PreparedStatement pstmt = con.prepareStatement(SQL);
        ) {
            pstmt.setInt(1, Integer.parseInt(t));
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                us.setId(rs.getInt("user_id"));
                us.setName(rs.getString("username"));
                us.setPassword(rs.getString("password"));
            }
            return us;
        }

    }
}
