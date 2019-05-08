import java.util.stream.IntStream;
 
public class FizzBuzz
{
    public static void main(String[] args)// defining the public class
    {
        fizzBuzz1(100); //Defining the counter
        }
 
    private static void fizzBuzz1(int num)
    {
        for (int i = 1; i <= num; i++)//the condition of starting with No 1, add 1, to reach 100
        {
            if (((i % 5) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 3?
                System.out.println("fizzbuzz");// print fizzbuzz
            else if ((i % 3) == 0) // Is it a multiple of 3 condition? Print fizz
                System.out.println("fizz");
            else if ((i % 5) == 0) // Is it a multiple of 5 condition? print buzz
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 3 condition, print number
        }
    }
 
    
}
