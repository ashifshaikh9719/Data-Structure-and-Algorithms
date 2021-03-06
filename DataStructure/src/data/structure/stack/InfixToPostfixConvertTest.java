package data.structure.stack;

import java.util.Scanner;

public class InfixToPostfixConvertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InfixToPostfixConvertorStack ip = new InfixToPostfixConvertorStack();
		StringBuilder sb = new StringBuilder("");
		String str = "";
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the Infix Expression : ");
			str = sc.nextLine();
		}
		
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			
			if(Character.isDigit(ch) || Character.isLetter(ch)) {
				sb.append(ch);
			}else if(ch=='(') {
				ip.push(ch);
			}else if(ch == ')') {
				char ch1 = ip.pop();
				while(ch1 != '(') {
					sb.append(ch1);
					ch1 = ip.pop();
				}
			}else {
				while(ip.priority(ip.peek()) > ip.priority(ch)) {
					sb.append(ip.pop());
				}
				ip.push(ch);
			}
			
		}
		char ch2 = ip.pop();
		while(ch2 != '@') {
			sb.append(ch2);
			ch2 = ip.pop();
		}
		System.out.println(sb.toString());

	}

}
