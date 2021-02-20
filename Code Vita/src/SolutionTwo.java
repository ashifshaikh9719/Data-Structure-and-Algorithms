import java.util.Scanner;

public class SolutionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
//		int l = sc.nextInt();
//		int b = sc.nextInt();
//		int h = sc.nextInt();
//		int t = sc.nextInt();
//		System.out.println(volumn(l,b,h,t));
		
//		int d = sc.nextInt();
//		int s1 = sc.nextInt();
//		int s2 = sc.nextInt();
//		int s3 = sc.nextInt();
//		System.out.println(MinTime(d,s1,s2,s3));

//		int n = sc.nextInt();
//		System.out.println(FindNumber(n));
		
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		System.out.println(fun(p,r,t));
		
	}
	
	
	private static int fun(int p, int r, int n) {
		// TODO Auto-generated method stub
		int temp =  ((100+r)/100);
		System.out.println(temp);
		int res = p *  (int)Math.pow(temp,n);
		return res;
	}


	public  int Volumn(int l,int b,int h,int t) {
		return (l*b*h) - ((l-2*t) * (b-2*t) * (h-2*t));
	}
	
	public static int MinTime(int d, int s1,int s2,int s3) {
		int t1 = d/s1;
		int t2 = d/s2;
		int t3 = d/s3;
		
		if(t1<t2 && t1 <t3) {
			return t1;
		}else if(t2 < t3) {
			return t2;
		}else {
			return t3;
		}
		
	}
	
	
	public static int FindNumber(int n) {
		
		int max = 0;
		
		for(int i=1;i<=n;i++) {
			int rem =  (i*i) %n;
			if(max< rem) {
				max = rem;
			}
			
			if (max==n-1) {
				break;
			}
		}
		
		for(int i=n;i>=0;i--) {
			int rem =  (i*i) %n;
			if(max==rem) {
				return i;
			}
		}
		
		return 0;
		
	}

}
