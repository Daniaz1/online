/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shopping;

import java.util.Scanner;
//import java.util.ArrayList;

/**
 *
 * @author Daniafahad
 */
public class Online_Shopping {

    /**
     * @param args the command line arguments
     */
    // static User user1;
    //static User user1;
    static bag[] bags = new bag[5];
    static Clothes[] clothes = new Clothes[10];
    static Customer[] customer = new Customer[20];
   
    static Admin admin = new Admin("abeer","abeer@gmail.com","abeer","10018","1234","Female", "ksa" );

  //counter for customer and bag and clothes 
    static int con_c = 0, con_b = 3, con_cl = 4;
  
    static int y = 0;

    public static void main(String[] args) {
      //clothes and bag in our system (just example)
        clothes[0] = new Clothes("45r", "Classic Dress", 6500.30, "Pink", "M", 1, "Channel");
        clothes[1] = new Clothes("47b", "blouse       ", 600.30, "black", "M", 1, "Juicy Couture");
        clothes[2] = new Clothes("48g", "jacket       ", 750.00, "Green", "L", 1, "Juicy Couture");
        clothes[3] = new Clothes("49r", "jacket       ", 350.00, "Red", "L", 1, "JCH");
        bags[0] = new bag("22b", " GUESS Brown ", 1500.45, "Brown", "micro", 1, "GUESS", true);

        bags[1] = new bag("42r", "CH           ", 3799.5, "Red", "L    ", 1, "CH", true);
        bags[2] = new bag("22b", "Prada        ", 6300.89, "Green", "micro", 1, "Prada", true);
        
        
        admin.AddBag(bags[0]);
        admin.AddBag(bags[1]);
        admin.AddBag(bags[2]);
        
        admin.AddClothes(clothes[0]);
        admin.AddClothes(clothes[1]);
        admin.AddClothes(clothes[2]);
        admin.AddClothes(clothes[3]);
        Scanner in = new Scanner(System.in);
        boolean loop = false;

      
       star();
        System.out.println("Welcome In Fashion Online Shopping ");
       
       star();
        int c;

       star();
        System.out.println("menu :\n1-sign in \n2-sign up\n3-exit  ");
        star();
        c = in.nextInt();
        System.out.println();

        do {

            if (c == 1) {
                System.out.println("Please Enter your username");
                String user = in.next();

                System.out.println("Please Enter your Password");
                String pw = in.next();
 star();
                System.out.println("Please press '1' if you are Admin and press '2' if you are Customer ");
                int c2 = in.nextInt();
                switch (c2) {
                    case 1: {
                        if (user.equalsIgnoreCase(admin.getUsername())) {
                            if (pw.equalsIgnoreCase(admin.getPassword())) {
                                 int y4=1;
                                while(y4==1){
                                System.out.println("menu :\n1- view products .\n2-add product .");
                                int c_m = in.nextInt();
                                switch (c_m) {
                                    case 1:
                                        System.out.println("bags :");
                                        admin.ViewBags();
                                        System.out.println("clothes :");
                                        admin.ViewClothes();
                                        break;
                                    case 2:
                                        System.out.println("menu :\n1-bags .\n2-clothes .");
                                        int c_m1 = in.nextInt();
                                        switch (c_m1) {
                                            case 1:
                                                System.out.println("Name of bags");
                                                String b_name = in.next();
                                                System.out.println("ID of bag");
                                                String idb = in.next();
                                                System.out.println("Price");
                                                double p = in.nextDouble();
                                                System.out.println("color");
                                                String co = in.next();
                                                System.out.println("size");
                                                String si = in.next();
                                                System.out.println("Quantity");
                                                int q = in.nextInt();
                                                System.out.println("Brand");
                                                String br = in.next();
                                             
                                                bags[con_b] = new bag(b_name, idb, p, co, si, q, br, true);//io);
                                                admin.AddBag(bags[con_b]);
                                                con_b++;
                                                break;

                                            case 2:
                                                System.out.println("Name of clothes");
                                                String c_name = in.next();
                                                System.out.println("ID ");
                                                String idc = in.next();
                                                System.out.println("Price");
                                                double pc = in.nextDouble();
                                                System.out.println("color");
                                                String coc = in.next();
                                                System.out.println("size");
                                                String sic = in.next();
                                                System.out.println("Quantity");
                                                int qc = in.nextInt();
                                                System.out.println("Quality");
                                                String ccq = in.next();
                                                clothes[con_cl] = new Clothes(c_name, idc, pc, coc, sic, qc, ccq);

                                                admin.AddClothes(clothes[con_cl]);
                                                con_cl++;
                                                break;

                                        }
                                        break;

                                }
                                //i=admin.length;
                                loop = true;
                          
                                System.out.println("Enter 1 if you want continuation and 0 to exit ");
                                y4=in.nextInt();
                                
                                }} else {
                                System.out.println("wrong password");
                                loop = true;
                            }

                        }
                    }
                    if (loop == false) {
                        System.out.println("wrong username");
                    }
                    break;
                    case 2:
                        for (int i = 0; i < con_c; i++) {
                            if (user.equalsIgnoreCase(customer[i].getUsername())) {
                                if (pw.equalsIgnoreCase(customer[i].getPassword())) {
                                    System.out.println("menu :\n 1-View Product \n 2- View My Order \n 3- Add Order \n 4-Delete Order \n 5-exit");
                                    int cv = in.nextInt();
                                    do {
                                        switch (cv) {
                                            case 1: {
                                                System.out.println("menu :\n 1-Bags \n 2- Clothes");
                                                int cv2 = in.nextInt();
                                                if (cv2 == 1) {
                                                    for (int j = 0; j < bags.length; j++) {
                                                        System.out.println(bags[j]);
                                                    }

                                                } else if (cv2 == 2) {
                                                    for (int j = 0; j < clothes.length; j++) {
                                                        System.out.println(clothes[j]);
                                                    }
                                                    break;
                                                } else {
                                                    System.out.println("Wrong number");
                                                }

                                            }

                                            break;
                                            case 2:
                                                customer[i].viewOrder();
                                                break;
                                            case 3:
                                                System.out.println("menu :\n 1-Add Bags \n 2-Add Clothes");
                                                int cv3 = in.nextInt();
                                                if (cv3 == 1) {
                                                    for (int j = 0; j < bags.length; j++) {
                                                        System.out.println(bags[j]);
                                                    }
                                                    int y1 = 1;
                                                    while (y1 == 1) {
                                                        System.out.println("Enter the ID for bag want to add ");
                                                        String id2 = in.next();
                                                        {
                                                            for (int j = 0; j < bags.length; j++) {
                                                                if ((bags[j].getP_id()).equalsIgnoreCase(id2)) {
                                                                    System.out.println(" " + (bags[j].getP_id()).equalsIgnoreCase(id2) + " ");
                                                                    customer[i].addbag(bags[j]);
                                                                    break;

                                                                }
                                                            }
                                                        }
                                                        System.out.println(" \n if you want to add bag press 1 or 0 to exit ");
                                                        y1 = in.nextInt();

                                                    }

                                                } else if (cv3 == 2) {
                                                    for (int o = 0; o < clothes.length; o++) {
                                                        System.out.println(clothes[o]);
                                                    }
                                                    int y2 = 1;
                                                    while (y2 == 1) {
                                                        System.out.println("Enter the ID for the Clothes want to add ");
                                                        String id2 = in.next();
                                                        for (int j = 0; j < clothes.length; j++) {
                                                            if ((clothes[j].getP_id()).equalsIgnoreCase(id2)) {
                                                                System.out.println(" " + (clothes[j].getP_id()).equalsIgnoreCase(id2) + " ");
                                                                customer[i].addclothe(clothes[j]);
                                                                break;
                                                            }
                                                        }

                                                        System.out.println(" \n if you want to add clothes press 1 or 0 to exit ");
                                                        y2 = in.nextInt();

                                                    }
                                                } else {
                                                    System.out.println("Wrong Number");
                                                }

                                                break;
                                            case 4:
                                                System.out.println(" press '1' for Delete all order ");
                                                //press 2 if you want to delete some
                                                int y = in.nextInt();
                                                if (y == 1) {
                                                    customer[i].deleteOrder("all");
                                                }// else if (y == 2) {
                                                   // customer[i].viewOrder();
                                                    //System.out.println("Enter the ID for Delete");
                                                    //String u = in.next();
                                                    //customer[i].deleteOrder(u);
                                               // } 
                                                else {
                                                    System.out.print("Wrong number");
                                                }
                                                break;
                                            default:
                                                break;

                                        }
                                        System.out.println("menu :\n 1-View Product \n 2- View My Order \n 3- Add Order \n 4-Delete Order \n 5-exit");
                                        cv = in.nextInt();
                                    } while (cv != 5);

                                    loop = true;
                                } else {
                                    System.out.println("wrong password");
                                    loop = true;
                                }
                            }
                        }
                        if (loop == false) {
                            System.out.println("wrong username");
                        }
                        break;
                    default:
                        break;

                }

            } else if (c == 2) {
                System.out.println("what's your name");
                String name = in.next();
                System.out.println("Enter your address");
                String add = in.next();
                System.out.println("Enter your email");
                String email = in.next();
                System.out.println("Enter your phone number");
                String phone = in.next();
                System.out.println("Enter your creditcard");
                String cc = in.next();
                System.out.println("Enter your username");
                String un = in.next();
                System.out.println("Enter your ID");
                String ID = in.next();
                System.out.println("Enter your password");
                String pass = in.next();
                System.out.println("Enter your gender");
                String g = in.next();
                System.out.println("Enter your city");
                String city = in.next();

                customer[con_c] = new Customer(name, add,email, phone, cc, un, ID, pass, g, city);
                con_c++;

            } else if (c == 3) {
                break;

            } else {
                System.out.println("wrrong number !! ");
            }
            System.out.println("menu :\n1-sign in \n2-sign up\n3-exit  ");

            c = in.nextInt();
            // TODO code application logic here
        } while (c != 3);
    }
    
    
    public static void  star()
    {
    
    System.out.println("************************************");
    
    
    }
    

}
