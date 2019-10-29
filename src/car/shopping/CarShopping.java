/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;

// Import Scanner Class
import java.util.Scanner;

public class CarShopping
{
    
    // Create static Scanner Object call it kb
    private static Scanner kb =new Scanner(System.in);
  
    public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += remoteKeyLess();
      totalCost += onStar();
      totalCost += antiLock();
      totalCost += sunRoof(); 
      totalCost += coldWeather();
      totalCost += GPS();
      totalCost += ejectSeat();
      totalCost += secretBathRoom();
      totalCost += pizzaMaker();
      //TODO: call methods that you write for each feature
      
      //TODO: print the total cost of the vehicle
      System.out.println(totalCost);
   
   
   
   
   
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
      System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1"))
      {      
      return 15000;
      }
      else if(model.equalsIgnoreCase("Model 2"))
      {
      return 24000;
      }
      else if(model.equalsIgnoreCase("Model 3"))
      {
      return 40000;
      }   
      else
      {
      return 0;          
      }
   
   }
   
   public static int automaticWindows()
   {
      System.out.println("Automatic Windows for $500? (y/n) > ");
      String yesNo = kb.nextLine(); 
      if(yesNo.equalsIgnoreCase("y"))
      {
       return 500;
      }        
      else
   
      {
        return 0;
      }
               
   }
  
    public static int remoteKeyLess()
    {        
      System.out.println("Remote keyless for $1000? (y/n) > ");
      String yesNo2 = kb.nextLine();
      if(yesNo2.equalsIgnoreCase("y"))
      {
          return 1000;
      }
      else
      {
          return 0;
      }
    }
 

     public static int onStar()
     {
      System.out.println("OnStar System for $1000 (y/n) > ");
      String yesNo3 = kb.nextLine();
      if(yesNo3.equalsIgnoreCase("y"))
      {
          return 1000;
      }
      else
      {
          return 0;
      }

     }

     public static int antiLock()
     {
       System.out.println("Anti-lock Brakes (ABS) $500 (y/n) > ");
       String yesNo4 = kb.nextLine();
       if(yesNo4.equalsIgnoreCase("y"))
       {
           return 500;
       }
        else 
       {
           return 0;
       }
  }
     
     public static int wheel()
     {
         System.out.println("Telescoping steering wheel/adjustable pedals $1000 (y/n) > ");
         String yesNo5 = kb.nextLine();
       if(yesNo5.equalsIgnoreCase("y"))
       {
           return 1000;
       }      
       else
       {
           return 0;
       }
  }
     public static int sunRoof()
     {
        System.out.println("Sunroof $800 (y/n) > ");
        String yesNo6 = kb.nextLine();
     if(yesNo6.equalsIgnoreCase("y"))
     {
          return 800;
     }     
     else
     {
          return 0;
     }
     
 }
     public static int coldWeather()
     {        
       System.out.println("Cold Weather Package(Heated seats/windshield heater) $1500 (y/n) > ");
       String yesNo7 = kb.nextLine();
       if(yesNo7.equalsIgnoreCase("y"))
       {
           return 1500;
       }
       else
       {
           return 0;
       }
 }
     
     public static int GPS()
     {
       System.out.println("GPS Navigation System $750 (y/n) > ");
       String yesNo8 = kb.nextLine();
       if(yesNo8.equalsIgnoreCase("y"))  
       {
           return 750;
       } 
       else
       {
           return 0;
       }   
 }
     public static int ejectSeat()
     {
       System.out.println("Ejection seat system $50000 (y/n) > ");
       String yesNo9 = kb.nextLine();
       if(yesNo9.equalsIgnoreCase("y"))
       {
            return 50000;
       }    
       else
       {
            return 0; 
       }
 }
     
     public static int secretBathRoom()
     {
        System.out.println("Secret Bathroom plumbing $10000 (y/n) > ");
        String yesNo10 = kb.nextLine();
        if(yesNo10.equalsIgnoreCase("y"))
        {
             return 10000;
        }     
        else
        {
             return 0;
        }    
 }
     
     public static int pizzaMaker()
     {
         System.out.println("Pizza maker $100000 (y/n) > ");
         String yesNo11 = kb.nextLine();
         if(yesNo11.equalsIgnoreCase("y"))
         {
             return 100000;
         }
         else
         {
             return 0;
         }    

         
     }       
     
}

