
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 91702
 */
public class SocialMediaRegistration implements AccCreation {

    String name;
    String sn_name;
    String user_id;
    int password;

    Scanner sc = new Scanner(System.in);

    static ArrayList<SocialMediaRegistration> list = new ArrayList<>();

    SocialMediaRegistration(String n, String sm, Login_Credentials o) {
        this.name = n;
        this.sn_name = sm;
        this.user_id = o.user_id;
        this.password = o.password;
        list.add(this);
    }

    SocialMediaRegistration(){

    }

    public void set_user_id(String s) {
        user_id = s;
    }

    public void set_password(int s) {
        password = s;
    }

    public void displaylist() {
        for (SocialMediaRegistration entry : list) {
            System.out.println(entry.name + " " + entry.sn_name + " " + entry.user_id + " " + entry.password);
        }
    }

    public void display() {
        System.out.println(this.name + " " + this.sn_name + " " + this.user_id + " " + this.password);
    }

    // public static void Open_Account() {
    //     // String name, platform;
    //     // name = sc.nextLine();
    //     // platform = sc.nextLine();

    //     // for (SocialMediaRegistration entry : list) {
    //     //     if (entry.name == name && entry.sn_name == platform) {
                
    //     //     }
    //     // }
        
    // }

    @Override
    public void CreateAcc() {
        boolean stat = false;
        Instagram insta = new Instagram();
        Twitter tweet = new Twitter();
        // TODO Auto-generated method stub
        String name, platform;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter platform: ");
        platform = sc.nextLine();

        for (SocialMediaRegistration entry : list) {
            if (entry.name.equalsIgnoreCase(name) && entry.sn_name.equalsIgnoreCase(platform)) {
                if(entry.sn_name.equalsIgnoreCase("Instagram")){
                    stat = true;
                    insta.CreateAcc();
                }
                else if(entry.sn_name.equalsIgnoreCase("Twitter")){
                    stat = true;
                    tweet.CreateAcc();
                }
            }
        }
        if(stat== false){
            System.out.println("Sorry Invalid Entry....");
        }

    }

}
