import java.util.Scanner;
import java.math.BigInteger;
public class factorial {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, s, tem;
		int i, n;
		while(sc.hasNext()){
			a = BigInteger.ONE;
			s = BigInteger.ZERO;
			n = sc.nextInt();
		for(i = 1; i<=n; i++)
		{
			a = a.multiply(BigInteger.valueOf(i));
		}
		//System.out.println("Facts : "+a);
		
		while(a.compareTo(BigInteger.ZERO) == 1)
		{
			s = s.add(a.mod(BigInteger.TEN));			
		    //tem = a.mod(BigInteger.TEN);
			a = a.divide(BigInteger.TEN);
				}
		System.out.println(s);
		
	  }
  }
}


SampleInput
5
60
100
SampleOutput
3
288
648
