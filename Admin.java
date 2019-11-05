package project;
import java.util.Scanner;
public class Admin extends User {

    int j,k;
    int ch;
    String str;
    Register r = new Register();
    Driver d = new Driver();
    Vehicle v = new Vehicle();
    BookVehicle b = new BookVehicle();
    String  uiid="admin",passs="admin1234", name="Vishaka Mandge", addresss="Dhanori", phone_no="8390489947", mail="mandge1999@gmail.com", a_id="AV3";
    Scanner sc=new Scanner(System.in);
    int AdminLogin(String id,String password)
    {
        if(id.equals(uiid) && password.equals(passs))
        {
            System.out.println("Login Successful");
            return 1;
        }
        return 0;
    }


    public void Manage_Customer_info() {
        do {
            System.out.println("\n\n");
            System.out.println("========= ENTER YOUR CHOICE =========");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customer");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    r.register_new_customer();
                    System.out.println("New customer added Successfully");
                    break;

                case 2:
                    System.out.print("C_ID" + "\t\t" + "C_NAME" + "\t\t" + "CONTACT" + "\t\t" + "EMAIL" + "\t\t" + "LICENSE_NO" + "\t\t" + "ADDRESS" + "\n" );
                    for (i=0;i<20;i++) {
                        if(User_id[i]!=0)
                            System.out.print(User_id[i] + "\t\t" + User_name[i] + "\t\t" + Phone_no[i] + "\t\t" + Email[i] + "\t\t" + license_no[i] + "\t\t" + address[i] + "\n");
                    }
                    break;
            }

        }while (ch!=3);

    }


    public void Manage_Driver_info() {
        do {
            System.out.println("\n\n");
            System.out.println("========= ENTER YOUR CHOICE =========");
            System.out.println("1. Add Driver");
            System.out.println("2. View Drivers");
            System.out.println("3. Update Driver info");
            System.out.println("4. Remove Driver");
            System.out.println("5. Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    d.register_new_driver();
                    System.out.println("Driver added successfully");
                    break;

                case 2:
                    d.view_drivers();
                    break;

                case 3:
                    d.update_driver_info();
                    break;

                case 4:
                    d.remove_driver();
                    break;
            }
        }while (ch!=5);


    }



    public void Manage_Vehicle_info() {
        do {
            System.out.println("\n\n");
            System.out.println("========= ENTER YOUR CHOICE =========");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Update Vehicle info");
            System.out.println("4. Remove Vehicle");
            System.out.println("5. Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    v.add_vehicle();
                    break;

                case 2:
                    v.view_vehicles();
                    break;

                case 3:
                    v.update_vehicle_info();
                    break;

                case 4:
                    v.remove_vehicle();
                    break;
            }
        }while (ch!=5);
    }

    public void Manage_payments() {
        do {
            System.out.println("\n\n");
            System.out.println("=======CHOOSE WHAT YOU WANT TO DO=======");
            System.out.println("1. View bookings");
            System.out.println("2. Confirm payment");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    b.view_bookings();
                    break;

                case 2:
                    System.out.println("Enter Booking id to confirm payment");
                    str=sc.next();
                    for(k=0;k<20;k++)
                    {
                        if(str.equals(BookVehicle.Booked_vehicle_id[k]))
                        {
                            System.out.println("Enter 1 if payment successful else 0");
                            j=sc.nextInt();
                            if (j==1) {
                                BookVehicle.payment_successful[k] = "successful";
                            }
                            else
                                BookVehicle.payment_successful[k] = "unsuccessful";
                            System.out.println("Enter 1 if refund successful else 0");
                            j=sc.nextInt();
                            if (j==1) {
                                BookVehicle.refund[k] = "successful";
                            }
                            else
                                BookVehicle.refund[k] = "unsuccessful";
                        }
                    }
                    break;

            }
        }while(ch!=3);

    }

    public void Manage_account() {
        do {
            System.out.println("\n\n");
            System.out.println("=======CHOOSE WHAT YOU WANT TO DO=======");
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("============== PROFILE ============");
                    System.out.println("Admin id :" + a_id);
                    System.out.println("Name :" + name);
                    System.out.println("Contact :" + phone_no);
                    System.out.println("Email :" + mail);
                    System.out.println("Username :" + uiid);
                    System.out.println("Password :" + passs);
                    System.out.println("Address :" + addresss);
                    break;

                case 2:
                    System.out.println("Enter new Address, Phone no and Email:");
                    addresss = sc.next();
                    phone_no= sc.next();
                    mail= sc.next();
                    System.out.println("Profile updated successfully");
                    break;

            }
        } while (ch != 3);

    }



}