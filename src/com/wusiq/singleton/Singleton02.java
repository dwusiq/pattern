package com.wusiq.singleton;

/**
 * ��������ģʽ
 * @author wicker
 *
 */
public class Singleton02 {
  //���ʼ��ʱ���������������ʹ�õ�ʱ��Ŵ����������Խ�����ʽ��
  private static Singleton02 s2;
  //˽�л����췽��
  private Singleton02() {}
  
  //����ͬ��������Ч�ʵ�
  public static synchronized Singleton02 getInstance() {
	  if(s2==null) {
		  s2 = new Singleton02();
	  }
	  return s2;
  }
}
