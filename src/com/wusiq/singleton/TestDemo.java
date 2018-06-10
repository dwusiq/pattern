package com.wusiq.singleton;

public class TestDemo {
  public static void main(String[] args) {
	  Singleton01 s1_01 = Singleton01.getInstance();
	  Singleton01 s1_02 = Singleton01.getInstance();
	  System.out.println(s1_01==s1_02);
	  
	  Singleton02 s2_01 = Singleton02.getInstance();
	  Singleton02 s2_02 = Singleton02.getInstance();
	  System.out.println(s2_01==s2_02);
	  
	  Singleton03 s3_01 = Singleton03.getInstance();
	  Singleton03 s3_02 = Singleton03.getInstance();
	  System.out.println(s3_01==s3_02);
	  
	  Singleton04 s4_01 = Singleton04.INSTANCE;
	  Singleton04 s4_02 = Singleton04.INSTANCE;
	  System.out.println(s4_01==s4_02);
	  
	  Singleton05 s5_01 = Singleton05.getInstance();
	  Singleton05 s5_02 = Singleton05.getInstance();
	  System.out.println(s5_01==s5_02);
  }
}
