package sds;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Name");
		String var1=s.nextLine();
		
		System.out.println("Enter Joiner name");
		String var2=s.nextLine();
		
		System.out.println("Enter Second Name");
		String var3=s.nextLine();
		
		System.out.println("Output:::");
	      System.out.println("  ");
		
		/*
	      String var1="duvva";
	      String var2="And";
	      String var3="Thrisul";*/
	     
	      
	      int var1Length=var1.length();
	      int var2Length=var2.length();
	      int var3Length=var3.length();
	      
	      System.out.println(var1);
	      for(int i=0;i<=var1Length;i++) {
	    	  System.out.print(" ");
	      }
	      System.out.println(var2);
	      for(int i=0;i<=var1Length+var2Length;i++) {
	    	  System.out.print(" ");
	      }
	      System.out.println(var3);
	      
			
			
		}


}
