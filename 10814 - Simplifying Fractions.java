
import java.util.Scanner;
import java.math.BigInteger;

public class fraction {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, gcd;
		int t;
		t = sc.nextInt();
		while(t--!=0)
		{
			a = sc.nextBigInteger();
			sc.next();
			b = sc.nextBigInteger();
			gcd = a.gcd(b);
			System.out.println(a.divide(gcd)+" / "+b.divide(gcd));
		}		
	}
}

SampleInput
4
1 / 2
2 / 4
3 / 3
4 / 2
SampleOutput
1 / 2
1 / 2
1 / 1
2 / 1

