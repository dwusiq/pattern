package com.wusiq.singleton;

/**
 * 静态内部类单例模式（也是一种懒汉方式）
 * 兼备饿汉和懒汉模式的优点（兼备了并发高效和延时加载的优势）
 * 
 * 特点：
 * 外部类没有satatic属性，所以不会想饿汉式那样立即加载对象。
 * 只有真正调用getInstance方法的时候才会加载内部类。因为加载类时是线程安全的。s3是private static final修饰的，保证了内存中只有一个这样的实例存在，而且只能被赋值一次，保证了线程安全。
 * @author wicker
 *
 */
public class Singleton03 {
   private static class SingletonClassInstance{
	   private static final Singleton03 s3 = new Singleton03();
   }
   
   public static Singleton03 getInstance() {
	   return SingletonClassInstance.s3;
   }
   
   //私有化构造方法
   private Singleton03() {}
}
