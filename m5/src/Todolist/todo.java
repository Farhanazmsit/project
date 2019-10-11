package Todolist;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class todo {
	task tasks[];
	Scanner sc=new Scanner(System.in);
	int index=0;
	todo(int n) {tasks=new task[n];}
	public void addtask() {
		try {
			System.out.println("enter task name:");
			String name=sc.next();
			System.out.println("enter the description: ");
			sc.next();
			String description=sc.nextLine();
			System.out.println("enter the status: ");
			sc.next();
			String status=sc.nextLine();
			System.out.println("enter the date in yyyy-MM-dd:");
			String sDate1=sc.next();
			
			SimpleDateFormat dob= new SimpleDateFormat("yyyy-MM-dd");
			
			Date date1=dob.parse(sDate1);

			
			task t=new task();                     
			t.setName(name);
			t.setDescription(description);
			t.setStatus(status);
			t.setDate(date1);
			tasks[index]=t;
			index++;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	} 

		public void displaytask() {
			for(int i=0;i<tasks.length;i++)
			{
				if(tasks[i]!=null) {
					System.out.println(tasks[i]);
				}
			}
		}
		public boolean updatetaskbyname(String task) {
			for(int i=0;i<tasks.length;i++) {
				if(tasks[i]!=null) {
					if(tasks[i].getName().equals(task)) {
						System.out.println("before update");
						System.out.println(tasks[i]);
						System.out.println("Enter the status of"+tasks[i].getName());
						String status=sc.next();
						tasks[i].setStatus(status);
						System.out.println("Updated tasks");
						System.out.println(tasks[i]);
						return true;
				
				}
				}
		
			}
			return false;
			
		}
		public boolean removetaskbyname(String name) {
			for(int i=0;i<tasks.length;i++) {
				if(tasks[i]!=null) {
					if(tasks[i].getName().equals(name)) {
						System.out.println("removed task");
						/*System.out.println(tasks[i]);*/
						tasks[i]=null;
						return true;
					}
				}
			}
			return false;
		}


		public void pendingtasksbystatus(String status) {
			for(int i=0;i<tasks.length;i++) {
				if(tasks[i]!=null) {
					if(tasks[i].getStatus().equals(status)) 
					{
						System.out.print(tasks[i]);
					}
				}
			}
		}
		public boolean findingtask(String name) {
			for(int i=0;i<tasks.length;i++) {
				if(tasks[i]!=null) {
					if(tasks[i].getName().equals(name))
					{
						System.out.println("found the name");
						System.out.println(tasks[i]);
						return true;
					}
				}
			}
			return false;
		}
		public void partdate(String date) {
			SimpleDateFormat dob= new SimpleDateFormat("yyyy-MM-dd");
			Date dd;
			try {
				dd = dob.parse(date);
				
				for(int i=0;i<tasks.length;i++) {
					
					
					
					if(tasks[i]!=null) {
					Date temp=tasks[i].getDate();
					int n=temp.compareTo(dd);
					
					if(n==0) {
						System.out.println(tasks[i]);
					}
					/*
					 * if(temp.compareTo(dd)==0); { System.out.println(tasks[i]); }
					 */
					}
					
					
					
					}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			}
		}
		
		

		

					