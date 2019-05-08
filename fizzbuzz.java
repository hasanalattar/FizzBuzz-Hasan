import java.util.stream.IntStream;
 
public class FizzBuzz
{
    public static void main(String[] args)// definging the public class
    {
        fizzBuzz1(100); //Defining the counter
        }
 
    private static void fizzBuzz1(int num)
    {
        for (int i = 1; i <= num; i++)//the condition of starting with No 1, add 1, to reach 100
        {
            if (((i % 5) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 3?
                System.out.println("fizzbuzz");// if it is not multiple of 5 and 3
            else if ((i % 3) == 0) // Is it a multiple of 3?
                System.out.println("fizz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 3
        }
    }
 
    
}