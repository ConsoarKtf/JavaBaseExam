package com.hand;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {  
    	float rate=0.0f;
    	System.out.println("请输入工资：");
    	 Scanner sc = new Scanner(System.in);
          float salary=sc.nextFloat();
          salary=salary-3500;
          if(salary>0){
          if(salary>80000)
        	    rate=(salary-80000)*0.45f+8750+6000+6500+900+300+45;
        	 else if(salary>55000)
        	 rate=(salary-55000)*0.35f+6000+6500+900+300+45;
        	 else if(salary>35000)
        		 rate=(salary-35000)*0.30f+6500+900+300+45;
        	 else if(salary>9000)
        		 rate=(salary-9000)*0.25f+900+300+45;
        	 else if(salary>4500)
        		 rate=(salary-4500)*0.20f+300+45;
        	 else if(salary>1500)
        		 rate=(salary-1500)*0.1f+45;
        	 else
        		 rate=salary*0.03f;
          }
          System.out.println("所需要纳税的税费为："+rate);
       sc.close();
        	 
        		
        	
        	
        		  
        	  
          
       
    }
}
