package com.wusiq.singleton;

/**
 * 双重检查加锁，单例模式
 * @author wicker
 *
 */
public class Singleton05 {
  private static Singleton05 s5;
  private Singleton05() {}
  public static Singleton05 getInstance() {
	  //先判断，如果是空，再用同步方法判断是否为空，避免每一次都调用同步方法
	  if(s5==null) {
		  synchronized(Singleton05.class) {
			  if(s5 == null) {
				  s5 = new Singleton05();
			  }
		  }
	  }
	  return s5;
  }
}
