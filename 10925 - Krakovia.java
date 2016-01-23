import java.util.Scanner;
import java.math.BigInteger;

public class Krakovia {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a, b;
		int t1, t2, c = 0;
		for(;;){
			BigInteger sum = BigInteger.valueOf(0);
			
			t1 = sc.nextInt();
			t2 = sc.nextInt();
			if(t1==0 && t2==0 ) 
				break;
	    while(t1--!=0)
		{
			a = sc.nextBigInteger();
			sum=sum.add(a);
			
		}
		System.out.print("Bill #"+ ++c +" costs "+sum+": ");
		System.out.println("each friend should pay "+sum.divide(BigInteger.valueOf(t2)));
		System.out.printf("\n");
		}
 }
}

Input:                 
3 3
5400000000
5400000000
5400000000
3 2
5400000000
5400000000
9000000001
0 0
Output:
Bill #1 costs 16200000000: each friend should pay 5400000000

Bill #2 costs 19800000001: each friend should pay 9900000000
