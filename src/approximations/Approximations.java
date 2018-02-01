/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approximations;

import java.util.Scanner;

/**
 *
 * @author Mercedes
 */
public class Approximations {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        
        
        double f = 1;
        int x = 0;
        double e = 0;
        
       String str;   
       
      boolean again = true;
      while(again) // input validation loop
      {
        System.out.print("Please enter number: ");
        str = keyboard.nextLine(); 
        str = str.trim(); 
        try   
        {
          x  = Integer.parseInt(str);  
          again =  false; 
        }
        catch (Exception m) // handle the exception below
        {
          System.out.println("INPUT ERROR: Please enter an integer number!!"); 
          System.out.println(m.getMessage());
        }
       }
        
        
        for(int i = 1; i <= 5; i++){
            
            f = f*i;//to find out the facorital number for exuation.
            
           if(i == 1){ //for if its the very first time.
                e = 1+x;
            }else{
             e = e+Math.pow(x,i)/f; 
           }
            
        }
            System.out.print("calculation: 5 = "+e+"\n"); //printing out calculation
       
        for(int i = 6; i <= 10; i++){ //i must be set to 1 greater than previous loop.
            
            f = f*i;
            
           if(i == 1){
                e = 1+x;
            }else{
             e = e+Math.pow(x,i)/f;
           }
            
        }
            System.out.print("calculation: 10 = "+e+"\n");
            
        for(int i = 11; i <= 50; i++){
            
            f = f*i;
            
           if(i == 1){
                e = 1+x;
            }else{
             e = e+Math.pow(x,i)/f;
           }
            
        }
            System.out.print("calculation: 50 = "+e+"\n");
            
       for(int i = 51; i <= 100; i++){
            
            f = f*i;
            
           if(i == 1){
                e = 1+x;
            }else{
             e = e+Math.pow(x,i)/f;
           }
            
        }
            System.out.print("calculation: 100 = "+e+"\n");
       
        
        
    }
    
}
