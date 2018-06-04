package com.wusiq.singleton;

/**
 * ����ʽ����ģʽ
 * @author wicker
 *
 */
public class Singleton01 {
	//���ʼ��ʱ��������������������Խж���ʽ��
  private static final Singleton01 s1 = new Singleton01();
  
  //˽�л����췽��
  private Singleton01() {}
  
  //�ṩһ����ȡ����ķ���
  //��Ϊ������ص�ʱ��ֱ�Ӵ����˶���(��Ȼ�̰߳�ȫ)�����Բ���Ҫ��sychronized������û��ͬ��������Ч�ʸ�
  public static Singleton01 getInstance() {
	  return s1;
  }
}
