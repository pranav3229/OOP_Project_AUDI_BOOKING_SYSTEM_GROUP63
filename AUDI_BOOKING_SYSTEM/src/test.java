import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test extends Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection conn = null;
        conn = connection.connectDB();
        Class.forName(driver);
        Connection c = (Connection) DriverManager.getConnection(url, uname, pass);
        String sql= "SELECT * FROM events_table ";
        PreparedStatement ps=conn.prepareStatement(sql);
        ResultSet rs=ps.executeQuery(sql);
        while(rs.next()) {
        	if(Integer.parseInt(rs.getString("idno"))==18)
        	System.out.println((rs.getString("numberofseatsavailable")));
        }
		}catch(Exception E) {
			System.out.println(E);
		}
		Customer ob=new Customer();
		ob.BookEvent(21, 3);
		

	}

}
