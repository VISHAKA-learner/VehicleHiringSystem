package project;
import java.util.Scanner;

public class BookVehicle {
    public static String[] Booked_vehicle_id = new String[20];
    public  static int[] Booking_id =new int[20];
    public  static int[] rent_days =new int[20];
    public static String[] Pickup_location  = new String[20];
    public static String[] Drop_location  = new String[20];
    public static String[] date  = new String[20];
    public static int[] total_pay_amount  = new int[20];
    public static String[] payment_successful= new String[20];
    public static String[] refund = new String[20];
    public static int k=0;
    int flag=0;
    String str1 = "successful", str2 = "unsuccessful";
    public int j,i,m;
    Scanner sc4 = new Scanner(System.in);


    public void book_vehicles(String booked_id){
        for (i=0;i<20;i++){
            payment_successful[i] = str2;
            refund[i] = str2;
        }
        for (i=0;i<20;i++){
            if (Booked_vehicle_id.equals(Vehicle.vid))
                m=i;

        }
        if (Vehicle.availability[m]>0){
            Booked_vehicle_id[k] = booked_id;
            System.out.println("Enter Booking ID(Note: Remember this ID to check status)");
            Booking_id[k] = sc4.nextInt();
            System.out.println("Enter date");
            date[k] = sc4.next();
            System.out.println("Enter Pickup location");
            Pickup_location[k] = sc4.next();
            System.out.println("Enter Drop location");
            Drop_location[k] = sc4.next();
            System.out.println("Enter the no of days to rent vehicle for");
            rent_days[k] = sc4.nextInt();
            total_pay_amount[k] = rent_days[k] * Vehicle.rent_per_day[k];
            System.out.println("The total payable amount is " + total_pay_amount[k]);
            k++;
        }


    }

    public void booking_status(){
        System.out.println("Enter Booking id to check status");
        j=sc4.nextInt();
        flag=0;
        for (i=0;i<20;i++)
        {
            if(j==Booking_id[i])
                if(payment_successful[i].equals(str1)) {
                    System.out.println("Booking Successful");
                    flag=1;
                }
                else
                    flag=2;

        }
        if (flag==2)
            System.out.println("Waiting for booking success");
        if (flag==0){
            System.out.println("No such Booking");
        }



    }

    public void cancel_booking(){
        System.out.println("Enter Booking id to cancel booking");
        j=sc4.nextInt();
        for(i=0;i<20;i++)
        {
            if(j==Booking_id[i]) {
                flag=1;
                Vehicle.availability[i] = Vehicle.availability[i] + 1;
                System.out.println("Waiting for confirmation");
            }

        }
        if (flag==0){
            System.out.println("No such Booking");
        }

    }

    public void cancel_status(){
        System.out.println("Enter Booking id to check status");
        j=sc4.nextInt();
        flag=0;
        for(i=0;i<20;i++)
        {
            if(j==Booking_id[i])
                if(refund[i].equals(str1)) {
                    System.out.println("Refund Successful");
                    Booking_id[i] = 0;
                    flag=1;
                }
                else
                    flag=2;

        }
        if (flag==2)
            System.out.println("Waiting for refund acceptance");
        if (flag==0){
            System.out.println("No such Booking");
        }
    }

    public void view_bookings(){
        System.out.print("BOOKING_ID" + "\t\t" + "BOOKED_V_ID" + "\t\t" + "RENT_DAY" + "\t\t" + "DATE" + "\t\t" + "PICKUP_LOCATION" + "\t\t" + "DROP_LOCATION" + "\t\t" + "TOTAL_PAY_AMOUNT" + "\t\t" + "PAY_STATUS" + "\t\t" + "REFUND_STATUS" + "\n" );
        for (i=0;i<20;i++){
            if (Booking_id[i]!=0) {
                System.out.print(Booking_id[i] + "\t\t" + Booked_vehicle_id[i] + "\t\t" + rent_days[i] + "\t\t" + date[i] + "\t\t" + Pickup_location[i] + "\t\t" + Drop_location[i] + "\t\t" + total_pay_amount[i] + "\t\t" + payment_successful[i] + "\t\t" + refund[i] + "\n");
            }
        }
    }
}
