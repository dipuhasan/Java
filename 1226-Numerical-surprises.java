import java.math.BigInteger;
import java.util.Scanner;

public class Uva1226 {//Main
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger a, b;
		int t;
		t = sc.nextInt();
		while(t-- !=0){
			//a = new BigInteger(sc.next());
			a = sc.nextBigInteger();
			b = sc.nextBigInteger();
			//b = new BigInteger(sc.next());
			
			System.out.println(b.mod(a).toString());
		}
	}

}
