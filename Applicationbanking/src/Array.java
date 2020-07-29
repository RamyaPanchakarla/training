import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int length;
		System.out.println("enter the length");
		length=s.nextInt();
		int [] a=new int[length];
		System.out.println("enter the array values");
		for(int i=0;i<length;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		
	System.out.println(Arrays.toString(a));

	}

	
	}


