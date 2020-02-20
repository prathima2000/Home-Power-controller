/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package powersystem;

import java.util.Scanner;

/**
 *
 * @author USER
 */
class Power {
 int fan,ac,light;
 Scanner sc=new Scanner(System.in);
           
 public Power()
{
     fan=0;
     ac=0;
     light=0;
    
}
 void fan()
 {
     if(ac==0 && light==0)
     {
         fan=1;
         System.out.println("fan is switched on ");
     }
     else if(ac==0 && light==1)
     {    
     fan=1;
     System.out.println("fan is switched  on ");
             }
     else if(fan==1)
         System.out.println("fan is already switched  on ");
         else
     {
         System.out.println("ac is on so can i off ac to on fan \n enter  1 for  yes or  2 for n");
         int f=sc.nextInt();
                 if(f==1)
                 {
                     ac=0;
                     fan=1;
                     System.out.println("fan is on and ac is off");
                 }
                
 }}
 void ac()
 {
     if(fan==0 && light==0)
     {
         ac=1;
         System.out.println("ac is switched  on");
     }
     else if(fan==0 && light==1)
     {    
     ac=1;
     System.out.println("ac is switched  on");
             }
     else if(ac==1)
         System.out.println("ac is already switched  on ");
         else
     {
         System.out.println("fan is on so can i off fan to on ac \n enter1. y/2.n");
         int f=sc.nextInt();
                 if(f==1)
                 {
                     fan=0;
                     ac=1;
                     System.out.println("ac is on and fan is off");
                 }
 }}
 void light()
 {
     if(light==1)
         System.out.println("light is already switched  on ");
     light=1;
      System.out.println("light is switched  on");
     
 }
 void result()
 {
     if(fan==1)
         System.out.println("fan - on");
     else
         System.out.println("fan - off");
     if(ac==1)
         System.out.println("ac - on");
     else
         System.out.println("ac - off");
     if(light==1)
         System.out.println("light - on");
     else
         System.out.println("light - off");
 }
         
 }
 

public  class Powersystem
   {
       
    public static void main(String[] args) {
        int again;
        Scanner sc=new Scanner(System.in);
        Power p =new Power();
        do
        {
        System.out.println("1.fan  2.ac   3.light");
        System.out.println("enter option to switch on");
         int option=sc.nextInt();
          if(option==1)
                   p.fan();
           else if(option==2)
                   p.ac();
           else if(option==3)
                  p.light();
          else
               System.out.println("invalid  appliances name");
           System.out.println("do u want to switch on any more! \n press 10 to continue");
            again=sc.nextInt();
       }while(again==10);
      p.result();
    }
   }
        
    

