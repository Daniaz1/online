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
public class bag extends Product {

    private String B_brand;
    private boolean B_Isoriginal;
    private String  colors ;
    private int con_c = 0;

    public bag(String ID , String name , double price , String color , String size , int quantity ,String B_brand, boolean B_Isoriginal ) {

        super(ID ,  name ,   price ,  size ,  quantity );
        this.B_brand = B_brand;
        this.B_Isoriginal = B_Isoriginal;
      this.colors= colors;
        
    }

   

    public String getB_brand() {
        return B_brand;
    }

    public boolean isB_Isoriginal() {
        return B_Isoriginal;
    }

    public void setB_brand(String B_brand) {
        this.B_brand = B_brand;
    }

    public void setB_Isoriginal(boolean B_Isoriginal) {
        this.B_Isoriginal = B_Isoriginal;
    }
   // public void getColors(){
       // System.out.print("( ");
        //for(int i=0 ; i<con_c;i++){
        //    System.out.print(colors[i]);
         //   if (i!=colors.length){
         //       System.out.print(" - ");
          //  }
          //  else
           //     System.out.print(" )");
       // }
        
   // }
   // public void addColors(String color){
   //     colors[con_c]=color;
     //   con_c++;
   // }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setCon_c(int con_c) {
        this.con_c = con_c;
    }

    public String getColors() {
        return colors;
    }

    public int getCon_c() {
        return con_c;
    }

    public String toString(){
        return "Name: "+ super.getP_name()+" ID: "+super.getP_id()+" Size: "+super.getP_size()+" Brand: "+getB_brand();
    }

}
