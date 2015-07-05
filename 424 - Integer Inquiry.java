
import java.util.Scanner;
import java.math.BigInteger;

public class integer {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger zero = BigInteger.valueOf(0);
		BigInteger sum = BigInteger.valueOf(0);
		while(sc.hasNext()){
			BigInteger A = sc.nextBigInteger();
			if(A.equals(zero)) 
				break;
			sum = sum.add(A);
		}
		System.out.println(sum.toString());
	}

}
