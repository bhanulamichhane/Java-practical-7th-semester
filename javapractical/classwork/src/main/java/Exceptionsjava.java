
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Bhanu Lamichhane
 */
public class Exceptionsjava {
    
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fs=new FileInputStream("a.txt");
        }
        catch(FileNotFoundException ex){
    }
    
}
}
