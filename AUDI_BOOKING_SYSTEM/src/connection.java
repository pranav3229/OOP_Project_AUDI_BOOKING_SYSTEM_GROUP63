import java.sql.*;

public class connection {


    Connection con = null;

    public static Connection connectDB()

    {

        try {


            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/userdb",
                    "root", "takelite123");

            return con;
        }


        catch (SQLException | ClassNotFoundException e) {


            System.out.println(e);

            return null;
        }
    }
}