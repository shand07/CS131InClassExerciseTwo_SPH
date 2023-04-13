import java.io.*;

import java.util.Scanner;
 
public class InClassExerciseTwoThrows 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File file = new File("test.dat");
        Scanner input = new Scanner(file);
 
        while (input.hasNextLine()) 
        {
            System.out.println(input.nextLine());
        }
     
    }
}