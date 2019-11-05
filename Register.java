package project;
import java.util.Scanner;

public class Register extends User {

    Scanner sc2=new Scanner(System.in);

    public void register_new_customer() {

        System.out.println("Enter Username");
        User.uid[i]=sc2.next();
        System.out.println("Enter Password");
        User.pass[i]=sc2.next();
        System.out.println("Enter id");
        User.User_id[i]=sc2.nextInt();
        System.out.println("Enter name");
        User.User_name[i]=sc2.next();
        System.out.println("Enter Phone no");
        User.Phone_no[i]=sc2.next();
        System.out.println("Enter email");
        User.Email[i]=sc2.next();
        System.out.println("Enter License Number");
        User.license_no[i]=sc2.next();
        System.out.println("Enter Address");
        User.address[i]=sc2.next();
        User.i++;

    }
}
