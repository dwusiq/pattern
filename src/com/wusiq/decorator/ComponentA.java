package com.wusiq.decorator;


/**
 * 组件A
 * @author wicker
 *
 */
public class ComponentA extends SuperComponent{

	public ComponentA(SuperInterface myEntity) {
		super(myEntity);

	}
	
	
	/**
	 * 所有组件共有的方法
	 */
	@Override
	public void doSomething() {
		super.doSomething();
		Adoing();
	}



	/**
	 * A类自己特有的方法
	 */
	private void Adoing() {
		System.out.println("加上了A自己特有的方法");
	}
}
