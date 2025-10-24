package Main;

import Config.config;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int action, choice, option;
        config conf = new config();
        
        
        System.out.println("Welcome to my System");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("Enter action:");
        action = sc.nextInt();
        
        switch(action){
            case 1:
                
                System.out.println("Enter User Name: ");
                String name = sc.next();
                System.out.println("Enter Password:");
                String pswrd = sc.next ();
                System.out.println("Enter Phone Number: ");
                String nmbr = sc.next ();
                System.out.println("Enter Address:");
                String adrs = sc.next ();

                String sql = "INSERT INTO tbl_users(u_name, u_pass, phone_number, u_address) VALUES (?,?,?,?)";
                
                conf.addRecord(sql, name, pswrd, nmbr, adrs);
                
                break;
                
            case 2:
                System.out.println("Enter First Name: ");
                String fname = sc.next();
                System.out.println("Enter Last Name: ");
                String lname = sc.next ();
                System.out.println("Enter Username: ");
                String uname = sc.next ();
                System.out.println("Enter Phone Number: ");
                String pnmbr = sc.next ();
                System.out.println("Enter Address:");
                String addrss = sc.next ();
                System.out.println("Enter Password:");
                String pass = sc.next ();

                
                String sql = "INSERT INTO tbl_users(u_fname, u_lname, u_uname, phone_number, u_address, u_password) VALUES (?,?,?,?,?,?)";
                
                conf.addRecord(sql, fname, lname, uname, pnmbr, addrss, pass);

                break;
                
            case 3:
                break;
            
            default:
                System.out.println("Something went wrong.");
                
                
        }
        
    }
    
}
