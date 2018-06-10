package com.wusiq.decorator;


/**
 * 组件B
 * @author wicker
 *
 */
public class ComponentB extends SuperComponent{

	public ComponentB(SuperInterface myEntity) {
		super(myEntity);

	}
	
	
	/**
	 * 所有组件共有的方法
	 */
	@Override
	public void doSomething() {
		super.doSomething();
		Bdoing();
	}



	/**
	 * B类自己特有的方法
	 */
	private void Bdoing() {
		System.out.println("加上了B自己特有的方法");
	}
}
