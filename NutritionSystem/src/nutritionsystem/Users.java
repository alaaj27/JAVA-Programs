
package nutritionsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Users {
    
    private String UserName;
    private String FullName;
    private String Password;
    
    private int Age;
    private double Weight = 0;
    private double Tallness= 0;
    private char Gender;
    BaseFrame BaseFrame_Page;

    public void ShowBaseFrame_Page() {
        this.BaseFrame_Page.show();
    }
    
    public Users(String UserName, String FullName, String Password , GetStartedFrame g) {
        this.UserName = UserName;
        this.FullName = FullName;
        this.Password = Password;
        BaseFrame_Page = new BaseFrame(g , this);
        BaseFrame_Page.show();
        
    }

    public String getPassword() {
        return Password;
    }

    public String getUserName() {
        return UserName;
    }
    
    public String greeting(){
        
         if(UserName.equals("Public"))
            return "" ;
        else
            return "Hey "+FullName+"\n";
    }
    
    public void Calculate_BMI(){
        boolean flag = true;
        double weight =0 , Tall=0;
        
        while(flag){
            try{
                weight = Double.parseDouble(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid Weights in (5 - 400 kg): "));
                
                Tall = Double.parseDouble(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid Height in (10-300CM) : "));
                
                
                if((weight >400 || weight<5))
                    throw new NumberFormatException() ;
                if(Tall >300 || Tall <10)
                    throw new NumberFormatException();
                
                flag = false;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Unvalid Input");
            }
        }
       
        double BMI =Math.floor(weight/((Tall/100)*(Tall/100)));
        if(BMI < 18.5){
            //Underweight
            BaseFrame_Page.SetReport(greeting()+"BMI Is :"+BMI +
                    "\nunfortunately your Weight status is (Underweight)");
        }else if(BMI > 18.5 &&BMI < 24.9){
            //Normal or Healthy Weight
            
             BaseFrame_Page.SetReport(greeting()+"BMI Is :"+BMI +
                    "\nfortunately your Weight status is (Normal or Healthy Weight)");
             
        }else if(BMI > 25.0 &&BMI < 29.9){
            //25.0 – 29.9 	Overweight
            BaseFrame_Page.SetReport(greeting()+"BMI Is :"+BMI +
                    "\nunfortunately your Weight status is (Overweight)");
              
        }else if(BMI > 30.0 ){
            //30.0 and Above 	Obese
             BaseFrame_Page.SetReport(greeting()+"BMI Is :"+BMI +
                    "\nunfortunately your Weight status is (Obese)");
        }
        
    }
    
    public void Calculate_BMR(){
        
         boolean flag = true;
         double weight =0 , Tall=0;
         int age=0;
         int activity=-1;
         int gender=-1;
         double BMR=0;
         
         
         while(flag){
            try{
                weight = Double.parseDouble(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid Weights in (5 - 400 kg): "));
                
                Tall = Double.parseDouble(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid Height in (10-300CM) : "));
                  
                age = Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid Age in Years : "));
                
                gender =Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please choose your Gender from the numbers below :\n"
                        + "1 .Male \n2 .Female \n"));
                
                activity = Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please choose your activity during the day from the numbers below to account the calories burned during exercisein the day ,,\n\n"
                        + "1 .for low intensity activities(at the rest)\n"
                        + "2 .for light exercise\n"
                        + "3 .for moderate exercise 3-5 days per week\n"
                        + "4 .for active individuals(exercising 6-7 days/week)\n"
                        + "5 .for the extremely active individuals\n"));
                
                if((weight >400 || weight<5))
                    throw new NumberFormatException("weight") ;
                if(Tall >300 || Tall <10)
                    throw new NumberFormatException("Tallness");
                if(gender !=1 && gender != 2)
                    throw new NumberFormatException("gender");
                if(!(activity>=1 && activity<=5))
                    throw new NumberFormatException("activity");
                
                flag = false;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Unvalid Input when input the "+ex);
            }
        }
         
         /*
         
         BMR x 1.2 for low intensity activities and leisure 
         activities (primarily sedentary)
            
         BMR x 1.375 for light exercise (leisurely walking for 
         30-50 minutes 3-4 days/week, golfing, house chores)

         BMR x 1.55 for moderate exercise 3-5 days per week 
         (60-70% MHR for 30-60 minutes/session)

         BMR x 1.725 for active individuals 
         (exercising 6-7 days/week at moderate to high intensity (70-85% MHR) for 45-60 minutes/session)

         BMR x 1.9 for the extremely active individuals 
         (engaged in heavy/intense exercise like heavy manual labor, 
         heavy lifting, endurance athletes, 
         and competitive team sports athletes 6-7 days/week for 90 + minutes/session)
         for the extremely active individuals
         
         */
         
         if(gender== 1)
             BMR=66.47+(13.75 * weight)+(5.0 * Tall)-(6.75 * age);
         else if(gender== 3)
             BMR=665.09 + (9.56 * weight) + (1.84 * Tall) - (4.67 * age);
         
         if(activity == 1)BMR *=1.2;
         else if(activity == 2)BMR *=1.375;
         else if(activity == 3)BMR *=1.55;
         else if(activity == 4)BMR *=1.725;
         else if(activity == 5)BMR *=1.9;

         BaseFrame_Page.SetReport("You consume at a rate "+Math.floor(BMR)+" calories a day.");
        
    }
    
    public void PregnancyDueDateCalculate(){
       boolean flag = true;
       int day=1;
       int month=1;
       int year=2017;
         
         
         while(flag){
            try{

                day = Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid day in (1-31) : "));
               
                month = Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid month in (1-12) : "));
               
                year = Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid year : "));
                
               
                if(day >31 || day <1)
                    throw new NumberFormatException("day");
                if(month >12 || month <1)
                    throw new NumberFormatException("month");
               
                
                flag = false;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Unvalid Input when input the "+ex);
            }
            
            
            
        }
        
         
         
         
          
         Calendar cal = new GregorianCalendar(year, month, day);
         SimpleDateFormat sdf = new SimpleDateFormat("d / MMM / yyyy");
         
         cal.add(Calendar.MONTH, 9);
         cal.add(Calendar.DAY_OF_MONTH, 8);
         
         String d = sdf.format(cal.getTime());
        
         BaseFrame_Page.SetReport("Pregnancy Due Date will be in : "+ d);
         
    }
    
    public void Calculate_IBW(){
        
        
        boolean flag = true;
         double Tall=0;
         int gender=-1;
         double IBW=0;
         
         
         while(flag){
            try{
                
                Tall = Double.parseDouble(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid Height in (10-300CM) : "));
               
                gender =Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please choose your Gender from the numbers below :\n"
                        + "1 .Male \n2 .Female \n"));
                
               
                if(Tall >300 || Tall <10)
                    throw new NumberFormatException("Tallness");
                if(gender !=1 && gender != 2)
                    throw new NumberFormatException("gender");
                
                flag = false;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Unvalid Input when input the "+ex);
            }
        }
        

         Tall = (Tall*0.393700787 /*cm to inch*/ )*0.0833333333 /*inch to feet*/;
         
         IBW =Tall*3 ;
         if(gender ==1 )
             IBW = 50 + IBW;
         else
             IBW = 45 + IBW;
         
         BaseFrame_Page.SetReport("Your Ideal Body Weight : "+ IBW);
    }
    
    public void Classifies_Blood_Pressure(){

        boolean flag=true;
        int systolic = 0 /*"anq"*/, diastolic=0;
        
         while(flag){
            try{
                
                systolic = Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid systolic blood pressure in mmHg : "));
               
                diastolic = Integer.parseInt(JOptionPane.showInputDialog(null, greeting()+
                        "Please Enter A valid diastolic blood pressure in mmHg : "));
               
                flag = false;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Unvalid Input when input the "+ex);
            }
        }
         
         if(systolic<120 && diastolic <80 )
             BaseFrame_Page.SetReport("Your stage of blood pressure level is : OPTIMAL");
         
         else if((systolic>=120 && systolic<=129) && (diastolic >=80 && diastolic<=84 ))
             BaseFrame_Page.SetReport("Your stage of blood pressure level is : NORMAL");
         
         else  if((systolic>=130 && systolic<=139) && (diastolic >=85 && diastolic<=89 ))
             BaseFrame_Page.SetReport("Your stage of blood pressure level is : HIGH NORMAL");
         
         else if((systolic>=140 && systolic<=159) && (diastolic >=90 && diastolic<=99 ))
             BaseFrame_Page.SetReport("Your stage of blood pressure level is : MID HYPERTENSION");
        
         else if((systolic>=160 && systolic<=179) && (diastolic >=100 && diastolic<=109 ))
             BaseFrame_Page.SetReport("Your stage of blood pressure level is : MODERATE HYPERTENSION");
         else if(systolic>=180 && diastolic >=110 )
             BaseFrame_Page.SetReport("Your stage of blood pressure level is : SEVERE HYPERTENSION");

         
    }

    
}


    

