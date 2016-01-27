
import java.util.Scanner;
import java.math.BigInteger;
public class remain {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BigInteger p, m;
		int b;
		for(;;)
		{
			 b = sc.nextInt();
			 if(b == 0) break;
			 p = sc.nextBigInteger(b);
			 m = sc.nextBigInteger(b);
			 
			 System.out.println(p.mod(m).toString(b));
		}
	}
}

SampleInput
2 1100 101
10 123456789123456789123456789 1000
0
SampleOutput
10
789

