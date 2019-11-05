package project;
import java.util.Scanner;
public class Interface{


    public static void main(String[] args){

        int ch,ch1,flag;
        String id,password;
        Admin a = new Admin();
        Customer c=new Customer();
        Register r = new Register();

        do{
            System.out.println("\n\n");
            System.out.println("=======SELECT LOGIN=======");
            System.out.println("1. Admin Login");
            System.out.println("2. Customer Login");
            System.out.println("3. Register new customer");
            System.out.println("4. Exit");
            Scanner sc1=new Scanner(System.in);
            ch1=sc1.nextInt();
            switch(ch1){
                case 1:

                    System.out.println("Enter Username");
                    id=sc1.next();
                    System.out.println("Enter password");
                    password=sc1.next();

                    flag=a.AdminLogin(id,password);
                    if(flag==0)
                        System.out.println("Login Failed");
                    else
                    {
                        do{
                            System.out.println("\n\n");
                            System.out.println("=============MENU============");
                            System.out.println("1.Manage Customer Info");
                            System.out.println("2.Manage Driver Info");
                            System.out.println("3.Manage Vehicle Info");
                            System.out.println("4.Manage Payments");
                            System.out.println("5.Manage Account");
                            System.out.println("6.Exit");
                            Scanner sc=new Scanner(System.in);
                            ch = sc.nextInt();
                            switch(ch)
                            {
                                case 1:
                                    a.Manage_Customer_info();
                                    break;
                                case 2:
                                    a.Manage_Driver_info();
                                    break;
                                case 3:
                                    a.Manage_Vehicle_info();
                                    break;
                                case 4:
                                    a.Manage_payments();
                                    break;
                                case 5:
                                    a.Manage_account();
                                    break;

                            }
                        }while(ch!=6);
                        break;



                    }
                    break;
                case 2:
                    System.out.println("Enter Username");
                    id=sc1.next();
                    System.out.println("Enter password");
                    password=sc1.next();
                    flag=c.CustomerLogin(id,password);
                    if(flag==0)
                        System.out.println("Login Failed");
                    else
                    {
                        System.out.println("Login Successful");
                        do{
                            System.out.println("\n\n");
                            System.out.println("=============MENU============");
                            System.out.println("1.Search Vehicle");
                            System.out.println("2.Select Vehicle");
                            System.out.println("3.Manage Account");
                            System.out.println("4.Exit");
                            Scanner sc=new Scanner(System.in);
                            ch = sc.nextInt();
                            switch(ch)
                            {
                                case 1:
                                    c.Search_vehicle();
                                    break;
                                case 2:
                                    c.Select_vehicle();
                                    break;
                                case 3:
                                    c.Manage_account();
                                    break;

                            }
                        }while(ch!=4);


                        break;

                    }
                    break;


                case 3:
                    r.register_new_customer();
                    System.out.println("Registration successful");
                    break;



            }

        }while(ch1!=4);


    }
}

