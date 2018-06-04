package com.wusiq.singleton;

/**
 * 懒汉单例模式
 * @author wicker
 *
 */
public class Singleton02 {
  //类初始化时，不创建这个对象，使用的时候才创建对象（所以叫懒汉式）
  private static Singleton02 s2;
  //私有化构造方法
  private Singleton02() {}
  
  //方法同步，调用效率低
  public static synchronized Singleton02 getInstance() {
	  if(s2==null) {
		  s2 = new Singleton02();
	  }
	  return s2;
  }
}
