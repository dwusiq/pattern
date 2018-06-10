package com.wusiq.decorator;


/**
 * ���B
 * @author wicker
 *
 */
public class ComponentB extends SuperComponent{

	public ComponentB(SuperInterface myEntity) {
		super(myEntity);

	}
	
	
	/**
	 * ����������еķ���
	 */
	@Override
	public void doSomething() {
		super.doSomething();
		Bdoing();
	}



	/**
	 * B���Լ����еķ���
	 */
	private void Bdoing() {
		System.out.println("������B�Լ����еķ���");
	}
}
