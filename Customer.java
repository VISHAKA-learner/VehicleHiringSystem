package project;

import java.util.Scanner;

public class Customer extends User {

    private int j, k, l, m;
    public String vehicle_id;
    public int ch;
    String wheeler = "";
    Scanner sc3 = new Scanner(System.in);
    Vehicle v = new Vehicle();
    BookVehicle b = new BookVehicle();

    public int CustomerLogin(String id, String password) {
        l = i;
        for (m = 0; m < l; m++) {
            if (id.equals(uid[m]) && password.equals(pass[m])) {
                return 1;
            }

        }
        return 0;
    }

    public void Search_vehicle() {
        do {
            System.out.println("\n\n");
            System.out.println("=======CHOOSE THE TYPE OF VEHICLE=======");
            System.out.println("1. TWO-WHEELER");
            System.out.println("2. CAR");
            System.out.println("3. BUS");
            System.out.println("4. Exit");
            Scanner sc1 = new Scanner(System.in);
            ch = sc1.nextInt();
            switch (ch){
                case 1:
                    wheeler = "two-wheeler";
                    v.show_available_vehicles(wheeler);
                    break;

                case 2:
                    wheeler = "car";
                    v.show_available_vehicles(wheeler);
                    break;

                case 3:
                    wheeler = "bus";
                    v.show_available_vehicles(wheeler);
                    break;
            }

        }while (ch!=4);



    }

    public void Select_vehicle() {
        do {
            System.out.println("\n\n");
            System.out.println("========= SELECT VEHICLE =========");
            System.out.println("1. Check availability");
            System.out.println("2. Book vehicle");
            System.out.println("3. Check Booking Status");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Cancel Status");
            System.out.println("6. Exit");
            Scanner sc1 = new Scanner(System.in);
            ch = sc1.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the vehicle id to check availability");
                    vehicle_id = sc3.next();
                    v.check_availability(vehicle_id);
                    break;

                case 2:
                    v.book_vehicle();
                    break;

                case 3:
                    b.booking_status();
                    break;

                case 4:
                    b.cancel_booking();
                    break;

                case 5:
                    b.cancel_status();
                    break;
            }


        }while(ch!=6);



    }


    public void Manage_account() {
        do {
            System.out.println("\n\n");
            System.out.println("=======CHOOSE WHAT YOU WANT TO DO=======");
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Exit");
            Scanner sc1 = new Scanner(System.in);
            ch = sc1.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Customer id to view profile");
                    j = sc3.nextInt();
                    for (k = 0; k < 20; k++) {
                        if (j == User.User_id[k]) {
                            System.out.println("============== PROFILE ============");
                            System.out.println("Customer id :" + User.User_id[k]);
                            System.out.println("Customer name :" + User.User_name[k]);
                            System.out.println("Contact :" + User.Phone_no[k]);
                            System.out.println("Email :" + User.Email[k]);
                            System.out.println("License Number :" + User.license_no[k]);
                            System.out.println("Address :" + User.address[k]);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter Customer id to update customer profile");
                    j = sc3.nextInt();
                    for (k = 0; k < 20; k++) {
                        if (j == User.User_id[k]) {
                            System.out.println("Enter new Address, Phone no and Email:");
                            User.address[k] = sc3.next();
                            User.Phone_no[k] = sc3.next();
                            User.Email[k] = sc3.next();
                            System.out.println("Profile updated successfully");
                            break;
                        }
                    }
                    break;

            }
        } while (ch != 3);


    }


}

