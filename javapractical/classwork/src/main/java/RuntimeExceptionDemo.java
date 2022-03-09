/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bhanu Lamichhane
 */

public class RuntimeExceptionDemo {
    public static void main(String args[])
    {
        int a =10, b=2;
        int c =9;
        System.out.println("b/2 "+b/2);
                b=0;
           try
                {
                  c=a/b; 
                }
           catch(ArithmeticException e)
           {
               System.out.println("Division by zero has occured !!");
                    
                }
           System.out.println("c:"+c);
           System.out.println("1");
           System.out.println("2");
           System.out.println("3");
                }
  
}
