package com.wusiq.observer;

public class DemoTest {
   public static void main(String[] args) {
	//��ʼ������͹۲���
	SubjectSun subject = new SubjectSun();
	ObserverA obsA = new ObserverA();
	ObserverB obsB = new ObserverB();

	//�۲��߷ֱ�������
	obsA.register(subject);
	obsB.register(subject);
	
	//����״̬�����仯,����۲��ߴ�ӡ����Ϣ
	subject.setSubjectMessage("������Ϣ�����˱仯");
	
	System.out.println("------------------------");
	
	//�۲���Aȡ������
	 obsA.unRegister(subject);
	 //���ⷢ���仯������۲��ߴ�ӡ����Ϣ
	 subject.setSubjectMessage("Aȡ�����ĺ�������Ϣ�ַ����˱仯");
}
}
