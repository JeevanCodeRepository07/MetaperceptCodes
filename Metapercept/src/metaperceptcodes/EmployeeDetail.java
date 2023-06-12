package metaperceptcodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDetail {
	public static void main(String[] args) {
		Employee e1;
		ArrayList<Employee> a1=new ArrayList<>();
		while(true) {
		System.out.println("Enter operation");
		System.out.println("1=> insert employee details");
		System.out.println("2=> show all employee detail");
		System.out.println("3=> Delete employee details where id=");
		System.out.println("4=> Update employee detail where id=");
		System.out.println("5=> Exits");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		EmployeeDetail es=new EmployeeDetail();
		
		switch(ch) {
		
		case 1:
		System.out.println("enter how many emp insert");
		int empn=sc.nextInt();
		for(int i=0;i<empn;i++) {
			System.out.println("enter fname,lname id"+i);
			
			String fname=sc.next();
			String lname=sc.next();
			int id=sc.nextInt();
			
			e1=new Employee(fname,lname,id);
			a1.add(e1);
			
			
		}
		System.out.println("<-----All record inserted----->");
		break;
		case 2:
			for (Employee e : a1) {
				System.out.println("{");
				System.out.println("\t fname :"+e.getFname()+",");
				System.out.println("\t lname :"+e.getLname()+",");
				System.out.println("\t fname :"+e.getId()+",");
				System.out.println("}");
				
			}
			System.out.println("<-----All record Display----->");
			break;
		case 3:
			System.out.println("Enter id to delete record emp");
			int id1=sc.nextInt();
			Employee ef=null;
			for (Employee e : a1) {
				if(e.getId()==id1) {
					ef=e;
				
			}
			}
			a1.remove(ef);
			System.out.println("Deletd Successfully--\n\n");
				
			break;
			
		case 4:
			System.out.println("enter id to update record emp");
			int id2=sc.nextInt();
			System.out.println("enter fname lname to update record emp");
			String fn=sc.next();
			String ln=sc.next();
			Employee ef2=null;
			for (Employee e : a1) {
				if(e.getId()==id2) {
					ef2=e;
					e.setFname(fn);
					e.setLname(ln);
					e.setId(id2);
				}
			}
					System.out.println("<----update record---->");
					
					break;
					case 5:System.exit(0);
						
						
					
				
			}
		}
				
	
	
	
	
	
	
}
}
