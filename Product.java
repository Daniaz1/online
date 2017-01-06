/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shopping;

/**
 *
 * @author Daniafahad
 */
public class Product {

    private String P_id;
    private String P_name;
   
    private double P_price;
   
    private String P_size;
    private int P_quantity;
    //private Admin[] P_admin = new Admin[5];
   // private Order P_order;

    public Product(String ID , String name , double price , String size , int quantity ) {
       P_id = ID ;
       P_name = name ;
      
       P_price = price ;
       P_size = size ;
       P_quantity = quantity;
       
       
 
       
    }

    public String getP_id() {
        return P_id;
    }

    public String getP_name() {
        return P_name;
    }

  

    public double getP_price() {
        return P_price;
    }

   

    public String getP_size() {
        return P_size;
    }

    public int getP_quantity() {
        return P_quantity;
    }

    /*public Admin[] getP_admin() {
        return P_admin;
    }**/

  //  public Order getP_order() {
  //      return P_order;
   // }

    public void setP_id(String P_id) {
        this.P_id = P_id;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }

   
    public void setP_price(double P_price) {
        this.P_price = P_price;
    }

    public void setP_size(String P_size) {
        this.P_size = P_size;
    }

    public void setP_quantity(int P_quantity) {
        this.P_quantity = P_quantity;
    }

    /*public void setP_admin(Admin[] P_admin) {
        this.P_admin = P_admin;
    }
**/
 //   public void setP_order(Order P_order) {
  //      this.P_order = P_order;
   // }

    /*public void Display() {
        System.out.print(P_order.getProduct());
    }**/

}
