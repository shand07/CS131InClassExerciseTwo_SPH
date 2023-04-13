import java.util.Scanner;

import java.io.*;

public class InClassExerciseTwo 
{
    public static void main(String[] args) 
    {
        try 
        {
            File file = new File("\"C:\\Users\\shand\\OneDrive\\Documents\\test.dat\"");
            Scanner input = new Scanner(file);
 
            while (input.hasNextLine()) 
            {
                System.out.println(input.nextLine());
            }
           
        } 
        
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found.");
        }
    }
}
