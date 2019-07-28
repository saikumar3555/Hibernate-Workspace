package com.nt.cfgs;

public class Test {

	public static void main(String[] args) {
      String var1="duvva";
      String var2="Thrisul";
      String var3="And";
      
      int var1Length=var1.length();
      int var2Length=var2.length();
      int var3Length=var3.length();
      System.out.println(var1);
      for(int i=0;i<=var1Length;i++) {
    	  System.out.print(" ");
      }
      System.out.println(var3);
      for(int i=0;i<=var1Length+var3Length;i++) {
    	  System.out.print(var2Length);
      }
      System.out.println();
      
		
		
	}

}
