package com.wusiq.decorator;

/**
 * 所有的被装饰的实体都实现超级接口
 * @author wicker
 *
 */
public class MyEntity implements SuperInterface{

	@Override
	public void doSomething() {
		System.out.println("实体类可以自由做任何事");
	}
}
