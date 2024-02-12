import java.util.*;
class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Subjects: ");
		double n=sc.nextInt();
		double count=0;
		double total=n*100;
		for(int i=0;i<n;i++)
		{
		    System.out.println("Enter Marks of Subject "+(i+1)+" out of 100");
		    double a=sc.nextInt();
		    count+=a;
		}
		double percentage=(((count)/total)*100);
		double grade=percentage/9.5;
		System.out.println("Total marks: "+count);
		System.out.println("Total Percentage: "+percentage);
		System.out.println("Total Grade points: "+grade);
		
	}
}
