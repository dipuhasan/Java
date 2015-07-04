import java.math.BigInteger;
import java.util.Scanner;

public class Uva374 { //use main
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger  b, p, m;
		int t;
	
		while(sc.hasNext()){
			b = new BigInteger(sc.next());
			p = new BigInteger(sc.next());
			m = new BigInteger(sc.next());
		System.out.println(b.modPow(p,m).toString());
		}
	}

}
