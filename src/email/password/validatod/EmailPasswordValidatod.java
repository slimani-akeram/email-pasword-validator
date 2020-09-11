
package email.password.validatod;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPasswordValidatod {

    public static void main(String[] args) {
     
      Scanner in = new Scanner(System.in);
      System.out.println("enter your email");
      String email = in.next();
      boolean em = Pattern.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-z0-9-]+\\.)+[a-zA-Z]{2,6}$", email);
      while(false == em)
      {
      System.out.println("not valide");
      System.out.println("re enter your email");
      email = in.next();
      boolean ee = Pattern.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-z0-9-]+\\.)+[a-zA-Z]{2,6}$", email);
      if (ee == true){  break;
      } }
      System.out.println("enter your password");
      String password = in.next();
        boolean ps = Pattern.matches("[a-zA-Z0-9]{4,8}" , password);
        while(false == ps)
      {
      System.out.println("not valide");
      System.out.println("re enter your password");
      password = in.next();
       boolean pss = Pattern.matches("[a-zA-Z0-9]{4,8}" , password);
      if (pss == true){  break;
      } }
        }}
    
    
    
    
    
  


    

   /* if (em == true) {
        
        if (ps == true) {
            System.out.print("you registe succefully");
        }
        else {
            System.out.print("password must have more tahn 4 char and less than 8."
             + "and contain enless 1 higher char"); */
            
       