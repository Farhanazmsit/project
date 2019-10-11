package Todolist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date in yyyy-MM-dd");
		String d=sc.next();
		try {
			
			SimpleDateFormat dob= new SimpleDateFormat("yyyy-MM-dd");
			
			Date temp=dob.parse("2019-10-04");
			
			Date temp2=dob.parse(d);
			
			System.out.println(temp);
			System.out.println(temp2);
			
			System.out.println(temp2.compareTo(temp));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
