package project;

import java.util.Scanner;

public class Vehicle{
    public  static int i=0;
    public int j,k,flag;
    public String vehicle_id;
    public  static String[] vid =new String[20];
    public  static String[] v_number =new String[20];
    public  static String[] v_name =new String[20];
    public  static String[] capacity =new String[20];
    public  static String[] type =new String[20];
    public  static String[] color =new String[20];
    public  static String[] model =new String[20];
    public  static int[] rent_per_day =new int[20];
    public  static int[] availability =new int[20];
    String str = "null";
    BookVehicle b = new BookVehicle();
    Scanner sc5 = new Scanner(System.in);

    public void show_available_vehicles(String type1){
        System.out.print("V_ID" + "\t" + "V_NUMBER" + "\t" + "V_NAME" + "\t" + "CAPACITY" + "\t" + "TYPE" + "\t" + "COLOR" + "\t" + "MODEL" + "\t" + "RENT PER DAY" + "\t" + "AVAILABILITY" + "\n" );
        for (j=0;j<20;j++){
            if(type1.equals(type[j])){
                System.out.print(vid[j] + "\t" + v_number[j] + "\t" + v_name[j] + "\t" + capacity[j] + "\t" + type[j] + "\t" + color[j] + "\t" + model[j] + "\t" + rent_per_day[j] + "\t" + availability[j] + "\n");
            }
        }
    }

    public void check_availability(String viid){

        flag = 0;
        for (j=0;j<20;j++){

            if(viid.equals(vid[j])){
                flag=1;
                if(availability[j] > 0) {
                    System.out.println("Vehicle Available");
                    flag = 1;
                }
                else{
                    System.out.println("Vehicle not available");
                    flag = 1;
                }
            }
        }
        if(flag==0)
            System.out.println("Incorrect Vehicle id");

    }

    public void add_vehicle(){
        System.out.println("Enter Vehicle id");
        vid[i]=sc5.next();
        System.out.println("Enter Vehicle number");
        v_number[i]=sc5.next();
        System.out.println("Enter name of vehicle");
        v_name[i]=sc5.next();
        System.out.println("Enter capacity of vehicle");
        capacity[i]=sc5.next();
        System.out.println("Enter type of vehicle(NOTE: type can be car,two-wheeler,bus)");
        type[i]=sc5.next();
        System.out.println("Enter color of Vehicle");
        color[i]=sc5.next();
        System.out.println("Enter model");
        model[i]=sc5.next();
        System.out.println("Enter rent per day");
        rent_per_day[i]=sc5.nextInt();
        System.out.println("Enter the available no");
        availability[i]=sc5.nextInt();
        i++;
    }

    public void view_vehicles(){
        System.out.print("V_ID" + "\t" + "V_NUMBER" + "\t" + "V_NAME" + "\t" + "CAPACITY" + "\t" + "TYPE" + "\t" + "COLOR" + "\t" + "MODEL" + "\t" + "RENT PER DAY" + "\t" + "AVAILABILITY" + "\n" );
        for (j=0;j<20;j++){
            if (rent_per_day[j]!=0)
                System.out.print(vid[j] + "\t" + v_number[j] + "\t" + v_name[j] + "\t" + capacity[j] + "\t" + type[j] + "\t" + color[j] + "\t" + model[j] + "\t" + rent_per_day[j] + "\t" + availability[j] + "\n");

        }

    }

    public void update_vehicle_info(){
        System.out.println("Enter Vehicle id to update vehicle info");
        vehicle_id = sc5.next();
        for (k = 0; k < 20; k++) {
            if (vehicle_id.equals(vid[k])) {
                System.out.println("Enter new Color, Rent & Availability");
                color[k] = sc5.next();
                rent_per_day[k] = sc5.nextInt();
                availability[k] = sc5.nextInt();
                System.out.println("Vehicle info updated successfully");
                break;
            }
        }
    }

    public void remove_vehicle(){
        System.out.println("Enter Vehicle id to remove");
        vehicle_id = sc5.next();
        for (k = 0; k < 20; k++) {
            if (vehicle_id.equals(vid[k])) {
                vid[k] = "null";
                v_name[k] = "null";
                v_number[k] = "null";
                capacity[k] = "null";
                rent_per_day[k] = 0;
                availability[k] = 0;
                color[k] = "null";
                model[k] = "null";
                type[k] = "null";
                System.out.println("Vehicle removed successfully");
                break;
            }
        }
    }

    public void book_vehicle(){
        System.out.println("Enter Vehicle id to book vehicle");
        vehicle_id = sc5.next();
        flag=0;
        for (k = 0; k < 20; k++) {
                if (vehicle_id.equals(vid[k])) {
                    flag =1;
                    if (availability[k] > 0){
                        b.book_vehicles(vehicle_id);
                        availability[k] = availability[k] - 1;
                        flag=1;
                        System.out.println("Waiting for confirmation");

                    }
                    else {
                        System.out.println("Vehicle not available");
                        flag=1;
                    }
                }
        }
        if (flag==0)
            System.out.println("Incorrect vehicle id");

    }
}
