package project;

import java.util.Scanner;

public class Driver {
    public  static int[] Driver_id =new int[20];
    public static String[] Driver_name  = new String[20];
    public static String[] D_Phone_no  = new String[20];
    public static String[] D_Email  = new String[20];
    public static String[] D_address  = new String[20];
    public static String[] D_license_no  = new String[20];
    public static int i=0;
    public int j,k;

    Scanner sc1=new Scanner(System.in);

    public void register_new_driver() {

        System.out.println("Enter  Driver id");
        Driver_id[i]=sc1.nextInt();
        System.out.println("Enter name");
        Driver_name[i]=sc1.next();
        System.out.println("Enter Phone no");
        D_Phone_no[i]=sc1.next();
        System.out.println("Enter email");
        D_Email[i]=sc1.next();
        System.out.println("Enter License no");
        D_license_no[i]=sc1.next();
        System.out.println("Enter Address");
        D_address[i]=sc1.next();
        i++;

    }

    public void view_drivers(){
        System.out.print("D_ID" + "\t\t" + "D_NAME" + "\t\t" + "D_CONTACT" + "\t\t" + "D_EMAIL" + "\t\t" + "D_LICENSE_NO" + "\t\t" + "D_ADDRESS" + "\n" );
        for (k=0;k<20;k++){
            if (Driver_id[k]!=0) {
                System.out.print(Driver_id[k] + "\t\t" + Driver_name[k] + "\t\t" + D_Phone_no[k] + "\t\t" + D_Email[k] + "\t\t" + D_license_no[k] + "\t\t" + D_address[k] + "\n");
            }
        }
    }

    public void update_driver_info(){
        System.out.println("Enter Driver id to update driver info");
        j = sc1.nextInt();
        for (k = 0; k < 20; k++) {
            if (j == Driver_id[k]) {
                System.out.println("Enter new Address, Phone no and Email:");
                D_address[k] = sc1.next();
                D_Phone_no[k] = sc1.next();
                D_Email[k] = sc1.next();
                System.out.println("Profile updated successfully");
                break;
            }
        }
    }

    public void remove_driver(){
        System.out.println("Enter Driver id to remove");
        j = sc1.nextInt();
        for (k = 0; k < 20; k++) {
            if (j == Driver_id[k]) {
                Driver_id[k] = 0;
                Driver_name[k] = "null";
                D_license_no[k] = "null";
                D_address[k] = "null";
                D_Phone_no[k] = "null";
                D_Email[k] = "null";
                System.out.println("Driver removed successfully");
                break;
            }
        }
    }
}
