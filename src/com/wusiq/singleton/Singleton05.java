package com.wusiq.singleton;

/**
 * ˫�ؼ�����������ģʽ
 * @author wicker
 *
 */
public class Singleton05 {
  private static Singleton05 s5;
  private Singleton05() {}
  public static Singleton05 getInstance() {
	  //���жϣ�����ǿգ�����ͬ�������ж��Ƿ�Ϊ�գ�����ÿһ�ζ�����ͬ������
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
