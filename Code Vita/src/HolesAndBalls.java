import java.util.Arrays;

public class HolesAndBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int H[] = {21, 3, 6};
		int B[] = {20, 15, 5, 7, 10, 4, 2, 1, 3, 6, 8};

//		int H[] = {20, 15, 10, 5, 25};
//		int B[] = {5, 10, 15, 20, 25, 30, 4, 9, 14, 19};
		
		

		
		int N = H.length;
		int M = B.length;
		
		int[] C = new int[N];
		
		for(int i=0;i<N;i++) {
			C[i] = i+1;
		}
		
		for(int i=0;i<M;i++) {
			boolean flag = true;
			for(int j=N-1;j>=0;j--) {
				if(C[j] > 0 && H[j] >= B[i]) {
					System.out.print(j+1 + " ");
					C[j]--;
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.print(0 + " ");
			}
			
			
		}

	}

}
