package com.wusiq.singleton;

/**
 * 饿汉式单例模式
 * @author wicker
 *
 */
public class Singleton01 {
	//类初始化时，立即创建这个对象（所以叫饿汉式）
  private static final Singleton01 s1 = new Singleton01();
  
  //私有化构造方法
  private Singleton01() {}
  
  //提供一个获取对象的方法
  //因为是类加载的时候直接创建了对象(天然线程安全)，所以不需要加sychronized。方法没有同步，所以效率高
  public static Singleton01 getInstance() {
	  return s1;
  }
}
