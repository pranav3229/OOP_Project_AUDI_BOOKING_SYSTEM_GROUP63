import java.sql.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int n=-1;
         while(n!=3){
         System.out.println("Press 1 To Create Account");
         System.out.println("Press 2 to Login");
         System.out.println("Press 3 to exit");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         Login ob1=new Login();

         if(n==1){
             ob1.CreateAccount();
         }
         else if(n==2){
             int x=ob1.login();
             if(x==69){                         //signifies user login

             }
             if(x==1){
                 Admin ad=new Admin();
                 ad.AdminFunctions();//signifies admin login

             }
             else {
                 System.out.println("Userid or password incorrect");
             }
         }
         else if(n==3){return;}
         else System.out.println("Enter a valid choice");
         }
    }
    }
