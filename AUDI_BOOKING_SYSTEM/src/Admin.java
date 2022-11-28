import imported_classes.DBTablePrinter;

import java.util.*;
import java.sql.*;

public class Admin extends Seats implements LoggedIn_Admin,conn{
	int choi=-111;
    static HashMap<Integer,String> al=new HashMap<>();

    public void Logout(){
        System.out.println("Successfully logged out");
    }

    @Override
    public void ViewEvents() {
        try {
            Connection conn = null;
            conn = connection.connectDB();
            Class.forName(driver);
            Connection c = (Connection) DriverManager.getConnection(url, uname, pass);

// Just pass the connection and the table name to printTable()
            DBTablePrinter.printTable(conn, "events_table");
        }catch(Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void AddEvent(String a,String b, String c) {
        try{
            Connection conn=null;
            conn=connection.connectDB();
            Class.forName(driver);
            Connection c1 =(Connection) DriverManager.getConnection(url,uname,pass);
            Events obe=new Events();
            System.out.println("Enter the event name");
            Scanner e=new Scanner(System.in);
            obe.event_name=a;
            System.out.println("Enter the ticket price");
            obe.ticket_price=b;
            System.out.println("Enter the event description ");
            obe.event_description=c;
//            System.out.println("Enter the number of seats you want to have available for the audience");
            al.clear();
            for(int i=1;i<=10;i++) {
            	al.put(i,"Available");
            }
            obe.number_of_seats_available=al.toString();
            
            Statement s=c1.createStatement();
            s.executeUpdate("INSERT INTO `events_table`(eventname,ticketprice,eventdescription,numberofseatsavailable) VALUE ('"+obe.event_name+"','"+obe.ticket_price+"','"+obe.event_description+"','"+obe.number_of_seats_available+"')");
            s.executeUpdate("INSERT INTO `table_user`(eventname,ticketprice,eventdescription) VALUE ('"+obe.event_name+"','"+obe.ticket_price+"','"+obe.event_description+"')");
            System.out.println("Event Successfully added");
        }catch(Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void EditEvent(int a, int choice1,String receive) {
        
        

        try {



                ViewEvents();
                System.out.println("Enter the event id number of the event you want to edit or press 0 to go back");
                Scanner id = new Scanner(System.in);
                int idno = a;
                Connection conn = null;
                conn = connection.connectDB();
                Class.forName(driver);
                Connection c = (Connection) DriverManager.getConnection(url, uname, pass);
//                System.out.println("Press 1 if you want to edit the event name");
//                System.out.println("Press 2 if you want to edit the ticket price");
//                System.out.println("Press 3 if you want to edit the event description");
//                System.out.println("Press 4 if you want to edit the number of seats available ***Warning doing so once users have booked seats will trash all such entries");
//                System.out.println("Press 0 to go back");
               choi=choice1;
                if (choi == 1) {
                    String neweventname = "";
//                    System.out.println("Enter the changed event name");
                    while(neweventname.equals("")==true) {
                        neweventname = receive;
                    }

                    Statement stmt = c.createStatement();
                    String query = "update  events_table set eventname='" + neweventname + "' where idno='" + idno + "'";
                    String query2= "update  table_user set eventname='" + neweventname + "' where idno='" + idno + "'";
                    stmt.executeUpdate(query);
                    stmt.executeUpdate(query2);

                }
                if(choi==2){
                    String newticketprice="";
//                    System.out.println("Enter the changed ticket price");
                    while(newticketprice.equals("")==true){
                        newticketprice=receive;
                    }
                    Statement stmt=c.createStatement();
                    String query = "update  events_table set ticketprice='" + newticketprice + "' where idno='" + idno + "'";
                    String query2="update  table_user set ticketprice='" + newticketprice + "' where idno='" + idno + "'";
                    stmt.executeUpdate(query);
                    stmt.executeUpdate(query2);

                }
                if(choi==3){
                    String neweventdescription="";
//                    System.out.println("Enter the new event description");
                    while(neweventdescription.equals("")==true){
                        neweventdescription=receive;
                    }
                    Statement stmt=c.createStatement();
                    String query = "update  events_table set eventdescription='" + neweventdescription + "' where idno='" + idno + "'";
                    String query2="update  table_user set eventdescription='" + neweventdescription + "' where idno='" + idno + "'";
                    stmt.executeUpdate(query);
                    stmt.executeUpdate(query2);

                }
                if(choi==4){
                    String newseatsavailable="";
//                    System.out.println("Enter the new number of seats available");
                    while(newseatsavailable.equals("")==true){
                        newseatsavailable=receive;
                    }
                    Statement stmt=c.createStatement();
                    String query = "update  events_table set numberofseatsavailable='" + newseatsavailable + "' where idno='" + idno + "'";
                    stmt.executeUpdate(query);

                }
//                else {
//                    if(choi==0){
//                        break;
//                    }
//                    else {
//                        System.out.println(("Invalid choice"));
//                    }
//                }

            }catch(Exception e){
                System.out.println(e);
            }


        }
    

    @Override
    public void DeleteEvent(int a) {
        try {
            ViewEvents();
            System.out.println("Enter the id number of the event you want to delete");
            Scanner id = new Scanner(System.in);
            int did=a;
            Connection conn = null;
            conn = connection.connectDB();
            Class.forName(driver);
            Connection c = (Connection) DriverManager.getConnection(url, uname, pass);
            Statement stmt=c.createStatement();
            String query="DELETE FROM `userdb`.`events_table` WHERE (`idno` = '"+did+"');";
            String query2="DELETE FROM `userdb`.`events_table` WHERE (`idno` = '"+did+"');";
            stmt.executeUpdate(query);
            stmt.executeUpdate(query2);
        }catch(Exception e){
            System.out.println(e);
        }


    }

    @Override
    public void TrackSeats() {

    }

    @Override
    public void TrackRevenue() {

    }
    public int setChoice(int choice) {
    	return choice;
    	
    }
    
//    public void AdminFunctions(){
//        int choice=-1;
//        while(choice!=1) {
//            System.out.println("Press 1 to Logout");
//            System.out.println("Press 2 to View Events");
//            System.out.println("Press 3 to Add Events");
//            System.out.println("Press 4 to Edit Events");
//            System.out.println("Press 5 to Delete Events");
//            System.out.println("Press 6 to Track Seats");
//            System.out.println("Press 7 to Track Revenue");
//            Scanner i = new Scanner(System.in);
//
//            choice = i.nextInt();
//            if (choice == 1) {
//                System.out.println("You have Successfully Loggedout");
//            }
//            if(choice==2){
//                ViewEvents();
//                continue;
//
//            }
//            if(choice==3){
//                AddEvent(String a, String b, String c, String d);
//                ViewEvents();
//                continue;
//
//            }
//            if(choice==4){
//                EditEvent();
//                ViewEvents();
//                continue;
//            }
//            if(choice==5){
//                DeleteEvent();
//                ViewEvents();
//                continue;
//            }
//
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
