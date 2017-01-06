/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shopping;

//import java.util.ArrayList;

/**
 *
 * @author Daniafahad
 */
public class Admin extends User {

    private String Adm_Name;
    private String emailAd;
    private Clothes[] A_clothes;
    private bag[] A_bag;
    private int con_c=0;
    private int con_b=0;

    //private ArrayList<bag> p_bag = new ArrayList<bag>();
    //private ArrayList<Clothes> p_clothes = new ArrayList<Clothes>();

    public Admin(String Adm_Name, String emailAd, String username, String ID, String Password, String gender, String city) {
        super(username, ID, Password, gender, city);
        this.Adm_Name = Adm_Name;
        this.emailAd = emailAd;
        A_bag=new bag[20];
        A_clothes = new Clothes[20];

        //this.product = product;
    }

    public Clothes[] getA_clothes() {
        return A_clothes;
    }

    public bag[] getA_bag() {
        return A_bag;
    }

    public int getCon_c() {
        return con_c;
    }

    public int getCon_b() {
        return con_b;
    }

    public void setA_clothes(Clothes[] A_clothes) {
        this.A_clothes = A_clothes;
    }

    public void setA_bag(bag[] A_bag) {
        this.A_bag = A_bag;
    }

    public void setCon_c(int con_c) {
        this.con_c = con_c;
    }

    public void setCon_b(int con_b) {
        this.con_b = con_b;
    }

    public String getAdm_Name() {
        return Adm_Name;
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    public String getEmailAd() {
        return emailAd;
    }

    public void setAdm_Name(String Adm_Name) {
        this.Adm_Name = Adm_Name;
    }

    public void setEmailAd(String emailAd) {
        this.emailAd = emailAd;
    }

    /*public void setProduct(String[] product) {
     this.product = product;
     }**/
    public void AddBag(bag newbag) {
        
            A_bag[con_b++] = newbag;
    }

    public void AddClothes(Clothes c) {
        

        
        
            
            A_clothes[con_c] = c;
            con_c++;

        }
    

    //  public void removeClothes(int i) {
    //  p_clothes.remove(i);
    /*   public void removeBag(String id) {

         for (int i = 0; i < p_bag.size(); i++) {
            if(A_bag[i].getP_id().equals(id))
                p_bag.remove(i);
        }
     */
    public void ViewClothes() {

        for (int i = 0; i <con_c ; i++) {
            System.out.println("c"+ A_clothes[i].toString());
        }

    }

    public void ViewBags() {
        for (int i = 0; i < con_b; i++) {
            System.out.println("Bag: "+A_bag[i].toString());
        }

    }
}