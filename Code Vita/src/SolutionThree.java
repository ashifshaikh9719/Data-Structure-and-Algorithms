import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {1,20,2,5};
//		int res = ArrayChallenge(arr);
//		System.out.println(res);
	
//		String str = "sskfsssbbb9bbb";
//		String res = SearchingChallenge(str);
//		System.out.println(res);
		
		String str = "aa aa odg dog gdo";

		String res = ArrayChallenge(str);
		System.out.println(res);
		
		
	}

	

	private static String ArrayChallenge(String str) {
		// TODO Auto-generated method stub
		
		String[] ar = str.split(" ");
		
		List<String> list = new ArrayList<>();
		
		int count = 0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i].length() > 1) {
				char[] chars =  ar[i].toCharArray();
				Arrays.sort(chars);
				list.add(new String(chars));
			}
		}
		
		Collections.sort(list);
		int i =0;
		while(i<list.size()-1) {
			int j = i+1;
			if(list.get(i).equals(list.get(j))) {
				count++;
			}
			
			while(j<list.size() && list.get(i).equals(list.get(j))) {
					j++;
			}
			
			i = j;
			
		}
		return String.valueOf(count);
	}



	private static String SearchingChallenge(String str) {
		// TODO Auto-generated method stub
		String res =  "no null";
		int n = str.length();
		
		
		int len = n/2;
		
		while(len >= 2) {
			int i =0;
			int j = len;
			int rl = n-j;
			
			while(rl >= len) {
				String temp = str.substring(i,j);
				if(str.lastIndexOf(temp) >=  j) {
					res = "yes " + temp;
					return res;
				}
				i++;
				j++;
				rl = n-j;
			}
			
			len--;
			
		}
		
		return res;
	}










	private static int ArrayChallenge(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		
		int a = 0;
		int b = 1;
		
		while(b < sum) {
			
			int c = a + b;
			a = b;
			b = c;
		}
		
		return (b-sum);
	}

}
