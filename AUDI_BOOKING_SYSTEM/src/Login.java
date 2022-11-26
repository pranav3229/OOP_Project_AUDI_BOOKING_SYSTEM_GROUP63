import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.*;
public class Login extends User implements conn {
    void CreateAccount(String a,String b, String c, String d, String e){
        User ob=new User();
        System.out.println("Enter your name");
        Scanner in =new Scanner(System.in);
        ob.name=a;
        System.out.println("Enter your phone number");
        ob.phone_number=b;
        System.out.println("Enter your email");
        ob.email=c;
        System.out.println("Enter a unique UserID");
        ob.userID=d;
        System.out.println("Create a password");
        ob.password=e;
        Connection con = null;
        PreparedStatement ps = null;
        con = connection.connectDB();
        try {


            Class.forName(driver);
            Connection c1=(Connection) DriverManager.getConnection(url,uname,pass);
            Statement s=c1.createStatement();
            s.executeUpdate("INSERT INTO `users`(name,phonenumber,email,userid,password) VALUE ('"+ob.name+"','"+ob.phone_number+"','"+ob.email+"','"+ob.userID+"','"+ob.password+"')");
        }
        catch (Exception e1) {
            System.out.println(e1);
        }
    }
    int login(String a,String b){
        System.out.println("Enter your username");
        Scanner in=new Scanner(System.in);
        User ob=new User();
        ob.userID=a;
        System.out.println("Enter the password");
        ob.password=b;
        Connection conn=null;
        String sql= "SELECT * FROM users WHERE userID = ? AND password = ?";
        PreparedStatement ps=null;
        conn=connection.connectDB();
        try{
            Class.forName(driver);
            Connection c=(Connection) DriverManager.getConnection(url,uname,pass);
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, ob.userID);
            st.setString(2, ob.password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                String username1 = rs.getString("userid");
                String password1 = rs.getString("password");
                if(username1.equals(ob.userID)&&password1.equals(ob.password)){
                    System.out.println("Logged in successfully");
//                    if(ob.userID.equals("admin_admin")&&ob.password.equals("takelite123")){
//                        System.out.println("Logged in as admin");
//                        return 1;
//                    }
                    return 69;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;

    }

}
