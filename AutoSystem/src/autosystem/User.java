
package autosystem;


import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class User {
    private String UserName;
    private String UserPassword;
    private String System;
    FileWriter filewriter ;
    Scanner fileReader;
    
    public User(String System) {
        this.System = System;
        this.UserName = "UserName";
        this.UserPassword = "UserPassword";
        
        
    }

    public User(String system, String UserName, String UserPassword){
        this.System = system;
        this.UserName = UserName;
        this.UserPassword = UserPassword;
        
        
    }
    
   public boolean ChangePassWord(String oldPass , String NewPass){
     
       for (int i = 1; i <= 3; i++) {
          String pass1 =JOptionPane.showInputDialog("trail #"+i+"...\nEnter old Password : ");
          
          if(pass1.equals(UserPassword))
          { 
              String NewPass1 =JOptionPane.showInputDialog(null, "Enter new password :");
              String NewPass2 =JOptionPane.showInputDialog(null, "confirm new password :");
              
              if(NewPass1.equals(NewPass2))
              {
                  JOptionPane.showMessageDialog(null,"your password will be changed From *"+
                          UserPassword+"* To *"+NewPass2);
                  UserPassword = NewPass2;
                  return true;
              }
          }//end if
          
       }//end For
                  
        JOptionPane.showMessageDialog(null, "Wrong password ..."
                                       + "\nyour password will not be changed");
        return false;

   }//end function

   public boolean CheckUser() throws FileNotFoundException{

       fileReader = new Scanner(new FileReader("User.txt"));
       String str=fileReader.nextLine();
      
        while(str != null){
            try{
                if(str.contentEquals(System+" "+UserName+" "+UserPassword))
                    return true;
                str=fileReader.nextLine();
            }
            catch(Exception ex){break;}
            
        }
        fileReader.close();
        
        return false;
   }

    @Override
    public String toString() {
        return  System + "\t" + UserName + "\t" + UserPassword;
    }
       
     
       
}
