import java.util.ArrayList;
import java.util.List;

public class PrimeTimeAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int D = 49;
		int P = 7;
		int d = D/P;
		
		boolean[] prime = new boolean[d+1];
		for(int i=2;i<prime.length;i++) {
			prime[i] = true;
		}
		
		int[] ar = getPrimeNumbers(prime,d);
		int count = 0;
		for(int i=0;i<ar.length;i++) {
			boolean flag = true;
			int num = ar[i];
			for(int j=1;j<P;j++) {
				num +=d;
				if(num > D || !isPrime(num)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	
	public static boolean isPrime(int n) {
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static int[] getPrimeNumbers(boolean[] prime,int  n) {
		
		for(int p=2;p*p<=n;p++) {
			if(prime[p]) {
				for(int i=p*p;i<=n;i+=p) {
					prime[i] = false;
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<prime.length;i++) {
			if(prime[i]) {
				list.add(i);
			}
		}
		
		int[] ar = new int[list.size()];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = list.get(i).intValue();
			System.out.print(ar[i] + " ");
		}
		
		System.out.println();
		
		return ar;
		
		
	}

}
