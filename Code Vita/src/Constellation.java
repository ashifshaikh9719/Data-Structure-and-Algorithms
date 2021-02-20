import java.util.Scanner;

public class Constellation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		char[][] ar = new char[3][n];
		
		for(int i=0;i<3;i++){
		    String s = sc.nextLine();
		    ar[i] = s.toCharArray();
		}
		
		int j=0;
		
		while(j<=n-3){
		    if(ar[0][j] == '#' || ar[0][j] == '.' && ar[1][j] == '#' || ar[1][j] == '.' && ar[1][j] == '#' || ar[2][j] == '.'){
		        j++;
		    }else{
		        char ch = getStar(ar,j);
		        j+=3;
		        System.out.print(ch);
		        if(j<n && ar[0][j] == '#' && ar[1][j] == '#' && ar[1][j] == '#'){
		            System.out.print('#');
		            j++;
		        }
		    }
		}
		
		
		
		
	}
	
	
	public static char getStar(char[][] ar,int k){
	 
	    int[] count = new int[3];
	    for(int i=0;i<3;i++){
	        for(int j=k;j<k+3;j++){
	            if(ar[i][j] == '*'){
	                count[i]++;    
	            }
	        }
	    }
	    
	    if(count[0] == 3 && count[1] == 3 && count[2] == 3){
	        return 'E';
	    }else if(count[0] == 3 && count[1] == 2 && count[2] == 3 && ar[1][k+1] == '.'){
	        return 'O';
	    }else if(count[0] == 3 && count[1] == 1 && count[2] == 3 && ar[1][k+1] == '*'){
            return 'I';
	    }else if(count[0] == 2 && count[1] == 2 && count[2] == 3 && ar[0][k+1] == '.' && ar[1][k+1] == '.'){
	        return 'U';
	    }else{
	        return 'A';
	    }
	    
	
	   
	}
	
}