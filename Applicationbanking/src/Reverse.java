import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int length;
		System.out.println("enter the length");
		length=s.nextInt();
		int [] arr=new int[length];
		System.out.println("enter the array values");
		for(int i=length-1;i>=0;i++)
		{
			arr[i]=s.nextInt();
			
		}
		
		
	System.out.println(Arrays.toString(arr));

	}


	}


