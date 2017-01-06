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
public class Clothes extends Product {

    private String cl_quality;
    private String  colors ;
    //private int con_c = 0;

    public Clothes(String ID, String name, double price, String color, String size, int quantity, String cl_quality1) {
        super(ID, name, price, size, quantity);
        cl_quality = cl_quality1;
        colors = color;
    }

    /*public void Clothes(String cl_quality) {
        this.cl_quality = cl_quality;

    }**/

    public String getcl_quality() {
        return cl_quality;
    }

    public void setcl_quality(String cl_quality) {
        this.cl_quality = cl_quality;
    }
    public String getColors(){
      return this.colors;
        }

    public String getCl_quality() {
        return cl_quality;
    }

    public void setCl_quality(String cl_quality) {
        this.cl_quality = cl_quality;
    }
        
    
    public void setColors(String color){
        colors=color;
        
    }
    public String toString(){
        return "Name: "+super.getP_name()+" ID: "+ super.getP_id() + " Price: "+super.getP_price()+" Size: " +super.getP_size() ;
    }

}
