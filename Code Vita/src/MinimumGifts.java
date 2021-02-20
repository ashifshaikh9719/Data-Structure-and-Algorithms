
public class MinimumGifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		int ratings[] = {1, 2,1,5,2,1,2};
		
		
		int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i=0;i<n;i++){
            left[i] = 1;
            right[i] = 1;
        }
        
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                left[i] = left[i-1]+1;
            }
        }
        
        
        for(int i=n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                right[i] = right[i+1]+1;
            }
        }
        
        int min_candy = 0;
        
        for(int i=0;i<n;i++){
            min_candy += Math.max(left[i],right[i]);
        }
        
        System.out.println(min_candy);
		
		

	}

}
