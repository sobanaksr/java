import java.util.Scanner;
class positive
{
	public static void main(String[] arg)
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=in.nextInt();
		if(n>0)
		System.out.print("The number is positive");
		else if(n=0)
		System.out.print("The number is equal to zero");
		else
		System.out.print("The number is negative");

	}
}
