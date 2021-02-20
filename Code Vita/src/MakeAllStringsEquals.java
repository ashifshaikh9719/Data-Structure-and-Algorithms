
public class MakeAllStringsEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] arr  =  {"west", "east", "wait"} ;
		String[] arr = { "abcd", "bcde", "cdef" };

		
		int N = arr.length;
		int M = arr[0].length();
		
		int[][] hash = new int[256][M];
		
		int res = 0;
	
		
		for(int j=0;j<M;j++) {
			int max = 0;
			for(int i=0;i<N;i++) {
				char ch = arr[i].charAt(j);
				hash[ch][j]++;
				if(max<hash[ch][j]) {
					max = hash[ch][j];
				}
			}
			
			res += (N-max);
		}
		
		System.out.println(res);
		

	}

}
