import java.util.LinkedList;
import java.util.List;

public class Test { 
	static int minCost =Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 7;
//		int[] cuts = {1,3,4,5};
//		
//		int m = cuts.length;
//        permutation(n,cuts,m,0);
        
//        System.out.println(minCost);
		
		String s = "mohammad-ashif-shaikh";
		System.out.println(s);
		String[] strs = s.split("-");
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
        


	}
	
public static void permutation(int n,int[] cuts,int m,int i){
        
        if(i==m-1 ){
        	for(int l=0;l<m;l++) {
        		System.out.print(cuts[l]+" ");
        	}
        	System.out.println();
            minCost = Math.min(minCost,getMinCost(n,cuts));
            return;
        }
        
        for(int j=i;j<m;j++){
            int temp = cuts[i];
            cuts[i] = cuts[j];
            cuts[j] = temp;
            permutation(n,cuts,m,i+1);
            temp = cuts[i];
            cuts[i] = cuts[j];
            cuts[j] = temp;
        }
        
        
    }
    
    public static int getMinCost(int n, int[] cuts){
        
        List<int[]> list = new LinkedList<>();
        
        int[] ar = {0,n};
        list.add(ar);
        int cost = 0;
        for(int i=0;i<cuts.length;i++){
            for(int[] temp : list){
                if(cuts[i]>temp[0] && cuts[i] < temp[1]){
                    list.remove(temp);
                    cost += temp[1] - temp[0];
                    int[] a1 = {temp[0],cuts[i]};
                    int[] a2 = {cuts[i],temp[1]};
                    list.add(a1);
                    list.add(a2);
                    break;
                } 
                
            }
        }
        return cost;
        
    }

}
