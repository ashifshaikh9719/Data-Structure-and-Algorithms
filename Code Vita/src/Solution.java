import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int n = s.length();
		int res = -1;
		
		int i=0;
		
		while(i<n) {
			int count = 0;
			int j = i;
			
			while(j < n && s.charAt(j) == '1') {
				count++;
				j++;
			}
			
			while(j<n && s.charAt(j) == '0') {
				j++;
			}
			
			if(count != 0 && count > res ) {
				res = count;
			}
			
			i = j;
		}
		
		System.out.println(res);
		
		

	}

}
