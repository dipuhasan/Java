//package uva;
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
		int n = sc.nextInt();
		BigInteger f = BigInteger.ONE;
		
		for(int i = 1; i<=n; i++){
			f = f.multiply(BigInteger.valueOf(i));
		}
		System.out.printf("%d!\n", n);
		System.out.println(f.toString());
		
	}
  }
}
