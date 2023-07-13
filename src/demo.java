
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        prototype p = new Login_Credentials("admin", 1234);
        Login_Credentials c1 = (Login_Credentials) p.getclone();
        int z = 1, w = 0, j = 0;
        System.out.println("*********************SOCIAL MEDIA REGISTRATIONS****************************");
        while (z != 0) {
            System.out.println("***************************************************************************");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String n = sc.nextLine();
            System.out.print("Enter Social Media Platform: ");
            String sm = sc.next();
            SocialMediaRegistration s1 = new SocialMediaRegistration(n, sm, c1);
            System.out.print("Change user id [Yes:1,No:0]:");
            w = sc.nextInt();
            if (w == 1) {
                System.out.print("Enter new user id :");
                String u = sc.next();
                s1.set_user_id(u);
            }
            System.out.print("Change password [Yes:1,No:0]:");
            j = sc.nextInt();
            if (j == 1) {
                System.out.print("Enter new password:");
                int u = sc.nextInt();
                s1.set_password(u);
            }
            System.out.print("Add new entry [Yes:1,No:0]: ");
            z = sc.nextInt();
            // s1.displaylist();
        }
        System.out.println("**********Welcome to account creation of your desired Social Media **********");
        SocialMediaRegistration s2 = new SocialMediaRegistration();
        s2.displaylist();
        s2.CreateAcc();
    }
}