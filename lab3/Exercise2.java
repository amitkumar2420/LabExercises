package lab3;

import java.util.Scanner;

public class Exercise2 {
	String getImage(String str) {
		StringBuffer st= new StringBuffer(str);
		st.append('|');
		StringBuffer st1= new StringBuffer(str);
		st1.reverse();
		st.append(st1);
		
		return st.toString();
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Exercise2 ex=new Exercise2();
	System.out.println("Enter String : ");
	String str=sc.next();
	System.out.println(ex.getImage(str));
			}
}
