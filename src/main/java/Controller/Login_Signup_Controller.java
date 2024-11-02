package Controller;

import DAO.UserDAO;
import model.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Login_Signup_Controller {
    public static void Switch_UI(JFrame frame_origin,  JFrame frame_destination) {
        frame_origin.dispose();
        frame_destination.setVisible(true);
    }
    public static int tmp = 18;

    public static boolean checkUser(String username, String password) throws Exception {
        List<User> lstUser = new ArrayList<>();
        try{
            lstUser = UserDAO.getInstance().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean existed = false;
        for(User user : lstUser){
            if(user.getName().equals(username)){
                existed = true;
                break;
            }
        }

//        if(!existed){
//            tmp++;
//            UserDAO.getInstance().insert(new User(username,password,tmp));
//        }
        return existed;
    }

    public static void register(String username, String password) throws Exception {
            UserDAO.getInstance().insert(new User(username, password, tmp));

    }

    public static boolean checkValidRegister(String username, String password, String confirmPassword) {
        if(username.length() == 0 || password.length() == 0 || confirmPassword.length() == 0) return false;
        if(!password.equals(confirmPassword)) return false;
        if(username.length() < 6 ) return false;
        return true;
    }

}
