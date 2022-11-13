import java.util.*;
class User{
    String name;
    String phone_number;
    String email;
    String userID;
    String password;
    User(){
        name="";
        phone_number="";
        email="";
        userID="";
        password="";
    }
    String getName(){
        return name;
    }
    String getPhone_Number(){
        return phone_number;
    }
    String getEmail(){
        return email;
    }
    String getUserID(){
        return userID;
    }
    String getPassword(){
        return password;
    }
}