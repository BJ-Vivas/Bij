/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg4.vivas;

import java.util.Scanner;


public class Activity4Vivas {

   
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
    
    int entranceScore ;
    float GPA;
    
        System.out.println("Entrance Score : ");
        entranceScore = scn.nextInt();
        
        System.out.println("HighSchool GPA : ");
        GPA = scn.nextFloat();
       
        
    if ( entranceScore >= 70){

        if (entranceScore >= 70){
    
        System.out.println("\n" + "You Pass The Entrance Exam");
            
        } else{
      
        }
        
    } else{

       if ( entranceScore <= 69){
           
        System.out.println("\n" + "Your Score is Too Low");
                   
       } else {
   
       }
    }
    
    if ( GPA >= 3.0){
        
        if (GPA >= 3.0){
            
        System.out.println("\n" + "Your GPA is Good ");
        } else {
        
        }
        
    } else {
        
        if (GPA < 2.9){
            
        System.out.println("\n" + "GPA is Too Low");
            
        }
      }
    }
}