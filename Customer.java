/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shopping;

//import java.util.ArrayList;
//import java.util.Arrays;

/**
 *
 * @author Daniafahad
 */
//ooo
public class Customer extends User {
 
    private String Cus_Name;
    private String Address;
    private String Email;
    private String Phone_Number;
    private String creditCard;
  // private Order[] Order;
    
    private String[] order=new String[10];
    private bag[] bags;
    private Clothes[] clothes;
//  ArrayList<bag> p_bag = new ArrayList<bag>(Arrays.asList(bags));
//   private ArrayList<Clothes> p_clothes = new ArrayList<Clothes>(Arrays.asList(clothes));
     private int r = 0;
    
    private int i = 0; 

    public Customer(String Cus_Name, String Address, String Email, String Phone_Number, String creditCard,  String username, String ID, String Password, String gender, String city) {
        super(username, ID, Password, gender, city);
        this.Cus_Name = Cus_Name;
        this.Address = Address;
        this.Email = Email;
        this.Phone_Number = Phone_Number;
        this.creditCard = creditCard;
        
    }

    public String[] getOrder() {
        return order;
    }

    public bag[] getBags() {
        return bags;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public int getR() {
        return r;
    }

    public int getI() {
        return i;
    }

    public String getCus_Name() {
        return Cus_Name;
    }

    public void setOrder(String[] order) {
        this.order = order;
    }

    public void setBags(bag[] bags) {
        this.bags = bags;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setCus_Name(String Cus_Name) {
        this.Cus_Name = Cus_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    
  /*  public void AddOrder(Product o) {
        if(o instanceof bag)
           t[i]=Order[i].addbag(o); 
            Order[i] = order ;
           i++;
   }*/
    
   
   

public void addbag(bag b){
   
//b.getB_brand();
order[i]=b.getP_id()+" "+b.getB_brand();

//b.toString();

        //Order[i].addbag(b);
System.out.print(order[i]);
     
  i++;
 
 
}
public void addclothe(Clothes c)
{
  order[i]= c.getP_id()+"  "+c.getP_name();

  i++;
}
    public void viewOrder() {
     //   Order[i].viewOrder(t);
      //  System.out.println("yor"+ Order[i].viewOrder(t));
      
        
            
           for(int i=0;i<order.length;i++)
           if (order[i]!=null)
           { System.out.println((i+1)+"  "+order[i] );  
          }
           else if(order[i]==null){
               for(int j=i;j<order.length;j++)
                r++; 
               if(r==order.length)
               {   System.out.println("you don't have any order");      
                  break;} 
           }
                  
                   
             
           }
        
        }
        
      
    /*    public void deleteOrder(String o) 
       {
            for(int i=0;i<order.length;i++)
               if (o.equalsIgnoreCase(order[i]))
               { order[i]=null;
               System.out.print("Delete Done");
               }
               // p_clothes.remove(i);
            else if (o.equalsIgnoreCase("all"))
          for(int j=0;j<order.length;j++)
                   order[j]=null;
            
                    }}//}

    

    
 /*   public void AddOrder(Order order,int type) {
        Order_A.add(order);
        i=Order_A.size();
        if (type==2){
            Order[i].AddClothes(null);
        }
    }

    public void viewOrder() {
        for(int i=0;i<Order_A.size();i++){
            System.out.println((i+1)+Order[i].toString());         
        }
        

    }
    
   public void removeOrder(String id){
        for(int i=0;i<Order_A.size();i++){
            if(Order[i].getOrder_ID().equals(id)){
                Order_A.remove(i);
                
            }       
        }
    }

}*/


