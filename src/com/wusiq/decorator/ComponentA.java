package com.wusiq.decorator;


/**
 * ���A
 * @author wicker
 *
 */
public class ComponentA extends SuperComponent{

	public ComponentA(SuperInterface myEntity) {
		super(myEntity);

	}
	
	
	/**
	 * ����������еķ���
	 */
	@Override
	public void doSomething() {
		super.doSomething();
		Adoing();
	}



	/**
	 * A���Լ����еķ���
	 */
	private void Adoing() {
		System.out.println("������A�Լ����еķ���");
	}
}
