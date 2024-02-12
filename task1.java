import java.util.*;
    public class Main
    {
    	public static void main(String[] args) {
    		System.out.println("Enter your Guess: ");
    		Scanner sc=new Scanner(System.in);
    		
    		for(int i=0;i<3;i++)
    		{
    		    double a=sc.nextDouble();
    		    double b=Math.randaom();
    		    if(a==b)
    		    {
    		        System.out.println("Your guess is Correct ");
    		        break;
    		    }
    		    else{
    		        System.out.println("Your guess is incorrect");
    		        System.out.println("Try again\n");
    		    }
    		}
    		
    		System.out.println("Game Over");
    	}
    }
