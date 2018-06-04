package com.wusiq.singleton;

/**
 * ��̬�ڲ��൥��ģʽ��Ҳ��һ��������ʽ��
 * �汸����������ģʽ���ŵ㣨�汸�˲�����Ч����ʱ���ص����ƣ�
 * 
 * �ص㣺
 * �ⲿ��û��satatic���ԣ����Բ��������ʽ�����������ض���
 * ֻ����������getInstance������ʱ��Ż�����ڲ��ࡣ��Ϊ������ʱ���̰߳�ȫ�ġ�s3��private static final���εģ���֤���ڴ���ֻ��һ��������ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ���֤���̰߳�ȫ��
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
   
   //˽�л����췽��
   private Singleton03() {}
}
