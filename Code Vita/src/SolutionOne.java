import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		String s = sc.nextLine();
		
		
		while(!s.isEmpty()) {
			list.add(s);
			s = sc.nextLine(); 
		}
		
		int n = list.size();
		
		List<String> res = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			String str = list.get(i);
			String temp = "";
			int start = 0;
			for(int j=0;j<str.length()-1;j++) {
				if(str.substring(j, j+2).equals("\\b")){
					temp += str.substring(start,j-1);
					start = j+2;
					 j+= 2;
				}else if(str.substring(j, j+2).equals("\\n")) {
					temp += str.substring(start, j);
					temp += "\n";
					start = j+2;
					j+= 2;
				}
			}
			temp += str.substring(start);
			res.add(temp);
		}
		
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
		
		
		
		
	}

}
