import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Main {


    public static void main(String[] args) {
        Login ob1=new Login();
        JFrame f=new JFrame("Audi Booking System");

        JButton b=new JButton("Create Account");
        b.setBounds(100,100,150,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
        });
        JButton l=new JButton("Login");
        l.setBounds(100,150,150,30);
        JButton e=new JButton(("Exit"));
        e.setBounds(100,200,150,30);
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        f.add(b);f.add(l);f.add(e);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int n=-1;
//         while(n!=3){
//         System.out.println("Press 1 To Create Account");
//         System.out.println("Press 2 to Login");
//         System.out.println("Press 3 to exit");
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//
//
//         if(n==1){
//             ob1.CreateAccount();
//         }
//         else if(n==2){
//             int x=ob1.login();
//             if(x==69){//signifies user login
//                 Customer cus=new Customer();
//                 cus.customerFunctions();
//
//             }
//             if(x==1){
//                 Admin ad=new Admin();
//                 ad.AdminFunctions();//signifies admin login
//
//             }
//             else {
//                 System.out.println("Userid or password incorrect");
//             }
//         }
//         else if(n==3){return;}
//         else System.out.println("Enter a valid choice");
//         }
    }
    }
