package com.wusiq.decorator;

/**
 * 超级组件实现超级接口
 * 所有的组件都继承超级组件
 * @author wicker
 *
 */
public class SuperComponent implements SuperInterface{
	private SuperInterface myEntity;
	
	public SuperComponent(SuperInterface myEntity) {
		this.myEntity = myEntity;
	}

	/**
	 * 被子类实现的方法
	 */
	@Override
	public void doSomething() {
		myEntity.doSomething();
	}

}
