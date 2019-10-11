package Todolist;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class todomain {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of tasks");
		n=sc.nextInt();
		todo ob=new todo(n);
		for(int i=0;i<n;i++) {
			ob.addtask();
		}
		try {
			ob.displaytask();
			System.out.println("enter the name to update");
		    String name = sc.next();
			ob.updatetaskbyname(name);
			System.out.println("after update");
			ob.displaytask();
			System.out.println("enter the task to remove");
			String  name1=sc.next();
			ob.removetaskbyname(name1);
			ob.displaytask();
			System.out.println("display incom status");
			String status1=sc.next();
			ob.pendingtasksbystatus(status1);
			System.out.println("enter the name to find");
			String name2=sc.next();
			System.out.println(ob.findingtask(name2));
			System.out.println("enter the date in yyyy-MM-dd format");
			String Date1=sc.next();
			ob.partdate(Date1);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	} 
		
		
		
		
	}


