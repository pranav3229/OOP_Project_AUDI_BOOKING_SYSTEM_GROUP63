import imported_classes.DBTablePrinter;
import java.util.*;
import java.sql.*;
public class Customer extends Admin implements LoggedIn_User{
    static String current_user;

    @Override
    public void Cart() {
    	try {
    		 Connection conn = null;
             conn = connection.connectDB();
             Class.forName(driver);
             Connection c = (Connection) DriverManager.getConnection(url, uname, pass);
             String sql= "SELECT * FROM ifusers ";
             PreparedStatement ps=conn.prepareStatement(sql);
             ResultSet rs=ps.executeQuery(sql);
             while(rs.next()) {
            	 if(rs.getString("userid").equals(current_user)) {
            		 System.out.println("Signed in as : "+current_user);
            		 System.out.println(rs.getString("seatsbooked"));
            		 
            	 }
             }
    	}catch(Exception E) {
    		System.out.println(E);
    	}
    	

    }
    public void signedinas(String a) {
    	this.current_user=a;
    }
    public String getUserid() {
    	return this.current_user;
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
//        System.out.println("Enter the id number of the event that you want to book");
        
        try {
        	int yeet=-1;
        	String s2="";
        	String eve="";
//        	  System.out.println(al.toString());
            Connection conn = null;
            conn = connection.connectDB();
            Class.forName(driver);
            Connection c = (Connection) DriverManager.getConnection(url, uname, pass);
            String sql= "SELECT * FROM events_table ";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery(sql);

              while(rs.next()) {
            	  if(Integer.parseInt(rs.getString("idno"))==a) {
            		  yeet=Integer.parseInt(rs.getString("numberofseatsbooked"));
//            		  System.out.println(yeet);
            	  }
              }
//              System.out.println("Hello");
              rs.close();
            ResultSet rs1=ps.executeQuery(sql);
            PreparedStatement ps1=conn.prepareStatement(sql);
            String sql1= "SELECT * FROM ifusers ";
            ResultSet rs2=ps1.executeQuery(sql1);
            String app="";
              while(rs1.next()) {
            	  if(Integer.parseInt(rs1.getString("idno"))==a) {
            		  String man=rs1.getString("numberofseatsavailable");
            		  eve=rs1.getString("eventname");
            		  System.out.println(eve);
            		  
//            		  System.out.println(man);
            		  for(int i=0;i<man.length();i++) {
            			  System.out.println(Character.toString(man.charAt(i)));
            			  if (Character.toString(man.charAt(i)).equals(Integer.toString(seatno))) {
            				  char x='\u0000';
            				s2=  man.replace(man.charAt(i), x);
            				
            						
            						eve=" "+eve+" :"+" seatno: "+man.charAt(i);
                    				System.out.println(s2);
                    				break;
            					
            					
            				
            				
            			  }
            		  }
            		  
            	  }
              }
              rs1.close();
              while(rs2.next()) {
					if( rs2.getString("userid").equals(getUserid())) {
						app=rs2.getString("seatsbooked");
						eve=app+" "+eve;
      				System.out.println(s2);
      				break;
					}
					
				}
              yeet++;
              System.out.println(yeet);
              String s3=Integer.toString(yeet);
             

          
//              PreparedStatement ps1=conn.prepareStatement(sql);
//              ResultSet rs2=ps1.executeQuery(sql1);
              
              Statement stmt = c.createStatement();
              String query = "update  events_table set numberofseatsavailable='" + s2 + "' where idno='" + a + "'";
              String query2= "update  events_table set numberofseatsbooked='" + s3 + "' where idno='" + a + "'";
              String query3= "update  ifusers set seatsbooked='" + eve + "' where userid='" + getUserid() + "'";
              
              Admin ob=new Admin();
              stmt.executeUpdate(query);
              ob.ViewEvents();
              stmt.executeUpdate(query2);
              stmt.executeUpdate(query3);
              
        	
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
