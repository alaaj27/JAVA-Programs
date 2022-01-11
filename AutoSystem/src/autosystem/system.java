package autosystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;



 public class system {
    
    private String SystemName ;
    private String password;
    private final int MaxNoOfUser;
    private static int NoOfLogedUsers;
    public Vector <User> ListOfUser;
    
    FileWriter fileWriterForSystem;
    FileWriter fileWriterForUser;
    Scanner fileReaderForSystem;
    Scanner fileReaderForSUser;
    
    public system(String sysName , String pass , int maxUser) throws IOException {
        
     SystemName = sysName;
     
     password = pass;
      
      MaxNoOfUser = maxUser;
      
      NoOfLogedUsers=0;
      
      ListOfUser = new Vector<User>();
      
     
      fileReaderForSUser = new Scanner(new FileReader("User.txt"));
      
      fileWriterForSystem = new FileWriter("ExistingSystems.txt");
      fileReaderForSystem = new Scanner(new FileReader("ExistingSystems.txt"));
      
      fileWriterForSystem.append(SystemName + " "+ password + "\n");
      
      
      
      JOptionPane.showMessageDialog(null, "New system creation with "+ MaxNoOfUser+" User");
      
    }
    public void AddUsers(String UserName, String UserPassword) throws IOException{
    
        if(NoOfLogedUsers >=MaxNoOfUser){
                JOptionPane.showMessageDialog(null,"You cannot add user ,"
                        + " the system cannot exceed max number of user ");
                return;
        }
        fileWriterForUser = new FileWriter("User.txt");
        
        ListOfUser.add(new User(this.SystemName ,UserName ,UserPassword));
        fileWriterForUser.append(this.SystemName + " " + UserName +" "+ UserPassword);
        NoOfLogedUsers++;
        
        JOptionPane.showMessageDialog(null, "thanks you for register to "+SystemName+
                                    " System...");
        
       fileWriterForUser.close();
    }
  
    public void UserLogIn(String Uname , String pass) throws IOException{
        
        User temp;
        for(int i=0;i<ListOfUser.size(); i++)
        {
            temp = ListOfUser.get(i);
            String Check = temp.toString();
            if(Check.equals(this.SystemName + "\t" + Uname + "\t" + pass))
            {
                JOptionPane.showMessageDialog(null, "your in the system ^^");
                return;
            }
        }
       
            JOptionPane.showMessageDialog(null, "this Account dose not exist in the system !!");
    
    }

    public String getSystemName() {
        return SystemName;
    }
    public String PrintAllUsers() throws FileNotFoundException{
        
        
        String AllUser="System\tUserName\tUserPassword\n";
        
        for(int i=0 ; i< ListOfUser.size() ; i++){
            AllUser +=ListOfUser.elementAt(i).toString()+"\n";
        }
        
        return AllUser;
        
    }
    
}
