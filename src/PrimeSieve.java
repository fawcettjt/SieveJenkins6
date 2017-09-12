import java.util.Scanner;

public class PrimeSieve {
	
	
    public static void checkPrimeNumbers(int n)
    {
        //Uses boolean array to check whether number is prime.
    	//If number is prime, number is added to array for printing later.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
         
        for(int pNumber = 2; pNumber*pNumber <=n; pNumber++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[pNumber] == true)
            {
                for(int i = pNumber*2; i <= n; i += pNumber)
                    prime[i] = false;
            }
        }
         
        // Print all members of the prime array (prime numbers <= to supplied integer).
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
	
    public static void main(String[] args) { 
    	//initialize our variable to supply to method.
    	int number = 0;
    	
    	//print statements to gather number to test. Collect input number and assign it to number variable.
    	System.out.println("This application takes the supplied number and returns all prime numbers equal to or less than that number.");
    	System.out.println("Please enter a number:");
    	Scanner input = new Scanner(System.in);
    	number = input.nextInt();
    	
    	//Use supplied number as argument for prime method.
    	checkPrimeNumbers(number);
    	
    	System.out.println();
    	System.out.println("Thank you for using Prime Sieve application");

    }
}