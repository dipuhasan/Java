
import java.util.Scanner;
import java.math.BigInteger;
public class product {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BigInteger x, y;
		int t;
		//t = sc.nextInt();
		while(sc.hasNext())
		{
			x = sc.nextBigInteger();
			y = sc.nextBigInteger();
			
			System.out.println(x.multiply(y).toString());
			
		}
		
	}
}

Sample Input
12
12
2
222222222222222222222222

Sample Output
144
444444444444444444444444
