import imported_classes.DBTablePrinter;
import java.util.*;
import java.sql.*;
public class Customer extends Admin implements LoggedIn_User{


    @Override
    public void Cart() {

    }

    @Override
    public void ShowEvent() {
        try {
            Connection conn = null;
            conn = connection.connectDB();
            Class.forName(driver);
            Connection c = (Connection) DriverManager.getConnection(url, uname, pass);

// Just pass the connection and the table name to printTable()
            DBTablePrinter.printTable(conn, "table_user");
        }catch(Exception e){
            System.out.println(e);
        }


    }
//    @Override
    public void BookEvent(int a,int seatno) {
        System.out.println("Enter the id number of the event that you want to book");
        try {
        	  System.out.println(al.toString());
        	  Connection conn = null;
              conn = connection.connectDB();
              Class.forName(driver);
              Connection c = (Connection) DriverManager.getConnection(url, uname, pass);
              PreparedStatement ps=null;
              String sql= "SELECT * FROM events_table WHERE idno = ? AND numberofseatsavailable = ?";
              
              al.replace(seatno,"Booked");

             
              
              
              Statement stmt = c.createStatement();
              String query = "update  events_table set numberofseatsavailable='" + al.toString() + "' where idno='" + a + "'";
              
              stmt.executeUpdate(query);
        	
        }catch(Exception E) {
        	System.out.println(E);
        }
      

    }
//    public void getSeatNumber(int a) {
//    	Connection conn=null;
//        String sql= "SELECT * FROM events_table WHERE idno = '"+a+"' ";
//        PreparedStatement ps=null;
//        conn=connection.connectDB();
//        try {
//        	Class.forName(driver);
//            Connection c=(Connection) DriverManager.getConnection(url,uname,pass);
//            PreparedStatement st = conn.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//            int s1= Integer.parseInt(rs.getString("numberofseatsavailable"));
//            System.out.println(s1);
//        }catch(Exception E) {
//        	System.out.println(E);
//        	
//        }
//    
//    }
//    public void customerFunctions(){
//        int choice=-1;
//        while(choice!=1) {
//            System.out.println("Press 1 to Logout");
//            System.out.println("Press 2 to View Events");
//
//
//            Scanner i = new Scanner(System.in);
//
//            choice = i.nextInt();
//            if (choice == 1) {
//                System.out.println("You have Successfully Loggedout");
//            }
//            if(choice==2){
//                ShowEvent();
//                continue;
//
//            }
//            if(choice==3){
//
//                BookEvent();
//                continue;
//
//            }
//            else{
//                System.out.println("Invalid choice");
//                continue;
//            }
//
//
//        }
//
//    }
}
