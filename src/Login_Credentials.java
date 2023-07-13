
public class Login_Credentials implements prototype{
   String user_id;
   int password;
    
   Login_Credentials(String un,int pw){
    this.user_id=un;
    this.password=pw;
   }
           
    @Override
     public prototype getclone() {
       return new Login_Credentials(user_id,password);
    }

  
   
    
}
